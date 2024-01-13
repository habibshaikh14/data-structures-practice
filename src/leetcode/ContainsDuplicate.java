package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  /**
   * Given an integer array nums, return true if any value appears at least twice
   * in the array, and return false if every element is distinct.
   * 
   */
  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[] { 1, 2, 3, 4, 1 }));
  }

  private static boolean containsDuplicate(int[] nums) {
    Set<Integer> numsSet = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (!numsSet.add(nums[i])) {
        return true;
      }
    }
    return false;
  }
}
