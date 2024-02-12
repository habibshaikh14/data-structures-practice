package leetcode;

import leetcode.helper.classes.ListNode;

public class ReverseLinkedList {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
    System.out.println(reverseList(l1));
  }

  public static ListNode reverseList(ListNode head) {
    ListNode last = head;
    ListNode prev = null;
    while (last != null) {
      ListNode next = last.getNext();
      last.setNext(prev);
      prev = last;
      last = next;
    }
    return last;
  }
}
