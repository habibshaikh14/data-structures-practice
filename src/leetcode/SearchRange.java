package leetcode;

public class SearchRange {

  /**
   * Given an array of integers nums sorted in ascending order, find the starting
   * and ending position of a given target value. If target is not found in the
   * array, return [-1, -1].
   * 
   * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
   * 
   */

  public static void main(String[] args) {
    int[] nums = new int[] { 1, 3, 4, 5, 6 };
    int target = 4;
    int[] res = searchRange(nums, target);
    System.out.println("Range = [" + res[0] + ", " + res[1] + "]");
  }

  private static int[] searchRange(int[] nums, int target) {
    int[] res = new int[] { -1, -1 };
    int length = nums.length;
    int mid = 0;
    int start = 0;
    int end = length - 1;
    while (start <= end) {
      mid = (start + end) / 2;
      if (nums[mid] == target) {
        break;
      } else if (nums[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    if (start <= end) {
      getRange(nums, target, res, length, mid);
    }

    return res;
  }

  private static void getRange(int[] nums, int target, int[] res, int length, int mid) {
    int i = mid;
    int j = mid;
    while ((i >= 0 && nums[i] == target) || (j <= length - 1 && nums[j] == target)) {
      if (i >= 0 && nums[i] == target) {
        i--;
      }
      if (j <= length - 1 && nums[j] == target) {
        j++;
      }
    }
    res[0] = i + 1;
    res[1] = j - 1;
  }

}
