package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
  /**
   * Given an integer array nums, return all the triplets [nums[i], nums[j],
   * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
   * nums[k] == 0.
   */
  public static void main(String[] args) {
    int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
    List<List<Integer>> result = new ArrayList<>();
    Set<List<Integer>> positions = new HashSet<>();
    Arrays.sort(nums);
    int target = 0;
    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == target) {
          positions.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
          k--;
        } else if (sum < target) {
          j++;
        } else {
          k--;
        }
      }
    }
    result.addAll(positions);
    System.out.println(result);
  }
}
