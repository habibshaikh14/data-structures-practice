package leetcode;

import leetcode.helper.classes.ListNode;

public class LinkedListBinaryToDecimal {
  /**
   * A class to convert Binary to Decimal.
   */
  private static final ListNode BINARY = new ListNode("1 0 1 0 0 1");

  public static void main(String[] args) {
    System.out.println(BINARY.getString());
    System.out.println(getDecimal(BINARY));
  }

  private static int getDecimal(ListNode head) {
    int decimal = head.getVal();
    while (head.getNext() != null) {
      head = head.getNext();
      decimal = decimal * 2 + head.getVal();
    }
    return decimal;
  }
}
