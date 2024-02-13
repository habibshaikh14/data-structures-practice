package leetcode;

import leetcode.helper.classes.ListNode;

// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeSortedLinkedList {
  public static void main(String[] args) {
    ListNode l1 = new ListNode("1 4 6 7");
    ListNode l2 = new ListNode("1 2 3 5 6");
    System.out.print(sortedMerge(l1, l2).getString());
  }

  private static ListNode sortedMerge(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    if (l1.getVal() < l2.getVal()) {
      l1.setNext(sortedMerge(l1.getNext(), l2));
      return l1;
    } else {
      l2.setNext(sortedMerge(l1, l2.getNext()));
      return l2;
    }
  }
}
