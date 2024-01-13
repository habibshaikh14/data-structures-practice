package adventofcode;

import java.util.List;

import adventofcode.util.InputUtil;

/*
 * Code challenge link: https://adventofcode.com/2022/day/1
 */
public class Day1 {
  public static void main(String[] args) {
    List<String> data = InputUtil.getFileData(".\\src\\adventofcode\\input\\day1.txt");
    int large = 0;
    int medium = 0;
    int small = 0;
    int caloriesSum = 0;
    System.out.println("Welcome to day 1.");
    for (String string : data) {
      if (!string.isEmpty()) {
        caloriesSum += Integer.parseInt(string);
      } else {
        if (caloriesSum >= large) {
          small = medium;
          medium = large;
          large = caloriesSum;
        } else if (caloriesSum >= medium) {
          small = medium;
          medium = caloriesSum;
        } else {
          small = Math.max(small, caloriesSum);
        }
        caloriesSum = 0;
      }
    }
    System.out.println("Result1: " + large);
    System.out.println("Result2: " + (large + medium + small));
  }
}