package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
  /**
   * A happy number is a number defined by the following process:
   * 
   * Starting with any positive integer, replace the number by the sum of the
   * squares of its digits. Repeat the process until the number equals 1 (where it
   * will stay), or it loops endlessly in a cycle which does not include 1. Those
   * numbers for which this process ends in 1 are happy. Return true if n is a
   * happy number, and false if not.
   * 
   */
  public static void main(String[] args) {
    System.out.println(isHappy(19));
    System.out.println(isHappy(33));
  }

  private static boolean isHappy(int n) {
    Set<Integer> resSet = new HashSet<>();
    while (n != 1) {
      int sum = 0;
      while (n != 0) {
        int digit = n % 10;
        sum += (digit * digit);
        n /= 10;
      }
      if (!resSet.add(sum)) {
        return false;
      }
      n = sum;
    }
    return true;
  }
}
