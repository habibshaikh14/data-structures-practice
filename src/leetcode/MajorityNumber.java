package leetcode;

public class MajorityNumber {

  public static void main(String[] args) {
    System.out.println(majorityElement(new int[] { 1, 2, 3, 1, 1, 1 }));
  }

  public static int majorityElement(int[] nums) {

    int majIndex = 0;
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[majIndex] == nums[i])
        count++;
      else
        count--;
      if (count == 0) {
        majIndex = i;
        count = 1;
      }
    }

    return nums[majIndex];
  }
}
