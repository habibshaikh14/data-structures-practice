package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
  public static void main(String[] args) {
    for (int day : betterSolution(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 })) {
      System.out.println(day);
    }
  }

  public static int[] dailyTemperatures(int[] temperatures) {
    int[] result = new int[temperatures.length];
    for (int i = 0; i < temperatures.length - 1; i++) {
      int current = temperatures[i];
      int next = temperatures[i + 1];
      if (next > current) {
        result[i] = 1;
      } else {
        int j = i;
        while (j < result.length) {
          if (temperatures[j] > current) {
            result[i] = j - i;
            break;
          }
          j++;
        }
      }
    }
    return result;
  }

  private static int[] betterSolution(int[] temperatures) {
    Deque<Integer> deque = new ArrayDeque<>();
    int[] res = new int[temperatures.length];
    for (int i = temperatures.length - 1; i >= 0; --i) {
      if (deque.isEmpty()) {
        deque.offerFirst(i);
        res[i] = 0;
      } else {
        while (!deque.isEmpty() && temperatures[i] >= temperatures[deque.peekFirst()]) {
          deque.pollFirst();
        }

        if (deque.isEmpty()) {
          res[i] = 0;
        } else {
          res[i] = deque.peekFirst() - i;
        }

        deque.offerFirst(i);
      }
    }
    return res;
  }
}
