package leetcode;

class Node {
  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}

public class DeepCopyLinkedList {
  public static void main(String[] args) {
    Node testNode = new Node(7);
    testNode.next = new Node(13);
    testNode.next.next = new Node(11);
    testNode.next.next.next = new Node(10);
    testNode.next.next.next.next = new Node(1);
    testNode.next.random = testNode;
    testNode.next.next.random = testNode.next.next.next.next;
    testNode.next.next.next.random = testNode.next.next;
    testNode.next.next.next.next.random = testNode;
    System.out.println(copyRandomList(testNode));
  }

  private static Node copyRandomList(Node head) {
    Node iter = head;
    Node next;

    // First round: make copy of each node,
    // and link them together side-by-side in a single list.
    while (iter != null) {
      next = iter.next;

      Node copy = new Node(iter.val);
      iter.next = copy;
      copy.next = next;

      iter = next;
    }

    // Second round: assign random pointers for the copy nodes.
    iter = head;
    while (iter != null) {
      if (iter.random != null) {
        iter.next.random = iter.random.next;
      }
      iter = iter.next.next;
    }

    // Third round: restore the original list, and extract the copy list.
    iter = head;
    Node pseudoHead = new Node(0);
    Node copy;
    Node copyIter = pseudoHead;

    while (iter != null) {
      next = iter.next.next;

      // extract the copy
      copy = iter.next;
      copyIter.next = copy;
      copyIter = copy;

      // restore the original list
      iter.next = next;

      iter = next;
    }

    return pseudoHead.next;
  }
}
