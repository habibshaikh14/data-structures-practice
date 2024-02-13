package leetcode;

import leetcode.helper.classes.ListNode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNodeFromLinkedList {
  public static void main(String[] args) {
    System.out.println(removeNthFromEnd(new ListNode("1 2 3 4 5 6"), 0).getString());
  }

  private static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode start = head;
    ListNode end = head;
    while (n != 0 && end.getNext() != null) {
      n--;
      end = end.getNext();
    }
    if (n != 0 && end.getNext() == null) {
      return head.getNext();
    }
    while (end.getNext() != null) {
      start = start.getNext();
      end = end.getNext();
    }
    start.setNext(start.getNext().getNext());
    return head;
  }
}
