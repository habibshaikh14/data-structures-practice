package leetcode;

public class DailyTemperatures {
  public static void main(String[] args) {
    for (int day : dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 })) {
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
}
