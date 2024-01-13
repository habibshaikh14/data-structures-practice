package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PlusMinusZero {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(1);
    arr.add(-1);
    arr.add(0);
    arr.add(-1);
    arr.add(-1);
    plusMinus(arr);
  }

  public static void plusMinus(List<Integer> arr) {
    float p = 0f;
    float n = 0f;
    float z = 0f;
    int t = arr.size();
    for (Integer num : arr) {
      if (num > 0) {
        p++;
      } else if (num < 0) {
        n++;
      } else {
        z++;
      }
    }
    System.out.printf("%.6f%n", p / t);
    System.out.printf("%.6f%n", n / t);
    System.out.printf("%.6f%n", z / t);
  }
}
