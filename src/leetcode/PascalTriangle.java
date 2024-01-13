package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
  public static void main(String[] args) {
    System.out.println(generate(8));
  }

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> newRow = new ArrayList<>();
    newRow.add(1);
    result.add(newRow);
    while (numRows != result.size()) {
      List<Integer> prevRow = result.get(result.size() - 1);
      newRow = new ArrayList<>();
      result.add(newRow);
      newRow.add(1);
      for (int i = 0; i < prevRow.size() - 1; i++) {
        newRow.add(prevRow.get(i) + prevRow.get(i + 1));
      }
      newRow.add(1);
    }
    return result;
  }
}
