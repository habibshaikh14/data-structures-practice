package leetcode;

public class TwoSumSorted {
  public static void main(String[] args) {
    int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
    System.out.println("i=" + result[0] + " j=" + result[1]);
  }

  public static int[] twoSum(int[] numbers, int target) {
    int i = 0;
    int j = numbers.length - 1;
    while (i <= j) {
      int sum = numbers[i] + numbers[j];
      if (sum == target) {
        break;
      } else {
        if (sum < target) {
          i++;
        } else {
          j--;
        }
      }
    }
    return new int[] { i + 1, j + 1 };
  }
}
