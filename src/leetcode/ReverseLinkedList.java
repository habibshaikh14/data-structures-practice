package leetcode;

import leetcode.helper.classes.ListNode;

public class ReverseLinkedList {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
    System.out.println(reverseList(l1).getVal());
  }

  public static ListNode reverseList(ListNode head) {
    ListNode last = head;
    if (head == null) {
      return head;
    }
    while (last.getNext() != null) {
      last = last.getNext();
    }
    doReversal(head);
    head.setNext(null);
    return last;
  }

  private static ListNode doReversal(ListNode curr) {
    if (curr.getNext() != null) {
      doReversal(curr.getNext()).setNext(curr);
    }
    return curr;
  }
}
