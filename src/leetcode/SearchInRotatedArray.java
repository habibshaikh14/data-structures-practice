package leetcode;

public class SearchInRotatedArray {
  public static void main(String[] args) {
    System.out.println(search(new int[] { 15, 16, 20, 0, 5, 6, 8, 9, 11, 13 }, 0));
  }

  public static int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
    int m;
    while (l <= r) {
      m = (l + r) / 2;
      if (nums[m] == target) {
        return m;
      }
      if (nums[l] <= nums[m]) {
        if (nums[l] <= target && target < nums[m]) {
          r = m - 1;
        } else {
          l = m + 1;
        }
      } else {
        if (nums[m] < target && target <= nums[r]) {
          l = m + 1;
        } else {
          r = m - 1;
        }
      }
    }
    return -1;
  }

}
