package leetcode;

// https://leetcode.com/problems/koko-eating-bananas/description/
public class KokoEatingBananas {
  public static void main(String[] args) {
    System.out.println(minEatingSpeed(new int[] { 805306368, 805306368, 805306368 }, 1000000000));
  }

  private static int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = 1;
    for (int pile : piles) {
      if (right < pile) {
        right = pile;
      }
    }
    int result = right;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (canEatInTime(piles, mid, h)) {
        result = result > mid ? mid : result;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return result;
  }

  private static boolean canEatInTime(int[] piles, int k, int h) {
    int hours = 0;
    for (int pile : piles) {
      int div = pile / k;
      hours += div;
      if (pile % k != 0) {
        hours++;
      }
    }
    return hours > 0 && hours <= h;
  }
}
