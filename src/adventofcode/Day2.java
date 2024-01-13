package adventofcode;

import java.util.List;

import adventofcode.util.InputUtil;

/*
 * Code challenge link: https://adventofcode.com/2022/day/2
 */
public class Day2 {
  public static void main(String[] args) {
    List<String> data = InputUtil.getFileData(".\\src\\adventofcode\\input\\day2.txt");
    int totalPoints1 = 0;
    int totalPoints2 = 0;
    System.out.println("Welcome to day 2.");
    for (String string : data) {
      int computer = string.charAt(0);
      int player = string.charAt(2) - 88;
      totalPoints1 += (player + 1) + ((player - computer + 90) % 3) * 3;
      totalPoints2 += (player) * 3 + 1 + (player + (computer % 3)) % 3;
    }
    System.out.println("Result1: " + totalPoints1);
    System.out.println("Result2: " + totalPoints2);
  }
}
