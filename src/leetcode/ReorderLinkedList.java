package leetcode;

import leetcode.helper.classes.ListNode;

// https://leetcode.com/problems/reorder-list/description/
public class ReorderLinkedList {
  public static void main(String[] args) {
    reorderList(new ListNode("1 2 3 4 5 6 7 8 9 10"));
  }

  public static void reorderList(ListNode head) {
    ListNode slowPtr = head;
    ListNode fastPtr = head;
    while (fastPtr != null && fastPtr.getNext() != null) {
      slowPtr = slowPtr.getNext();
      fastPtr = fastPtr.getNext().getNext();
    }
    ListNode prev = null;
    while (slowPtr != null) {
      ListNode next = slowPtr.getNext();
      slowPtr.setNext(prev);
      prev = slowPtr;
      slowPtr = next;
    }
    slowPtr = head;
    while (prev != null && prev.getNext() != null) {
      ListNode next = head.getNext();
      head.setNext(prev);
      prev = prev.getNext();
      head.getNext().setNext(next);
      head = next;
    }
    head = slowPtr;
    if (head != null) {
      System.out.println(head.getString());
    } else {
      System.out.println("empty list");
    }
  }
}
