package adventofcode;

import java.util.List;

import adventofcode.util.InputUtil;

/*
 * Code challenge link: https://adventofcode.com/2022/day/4
 */
public class Day4 {
  public static void main(String[] args) {
    List<String> data = InputUtil.getFileData(".\\src\\adventofcode\\input\\day4.txt");
    int result1 = 0;
    int result2 = 0;
    for (String string : data) {
      String[] range1 = string.split(",")[0].split("-");
      String[] range2 = string.split(",")[1].split("-");
      int a = Integer.parseInt(range1[0]);
      int b = Integer.parseInt(range1[1]);
      int c = Integer.parseInt(range2[0]);
      int d = Integer.parseInt(range2[1]);
      if ((a - c) * (b - d) <= 0) {
        result1++;
      }
      if ((a >= c && a <= d) || (c >= a && c <= b)) {
        result2++;
      }
    }
    System.out.println("Result1 is: " + result1);
    System.out.println("Result2 is: " + result2);
  }
}
