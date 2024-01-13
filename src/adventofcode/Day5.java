package adventofcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import adventofcode.util.InputUtil;

/*
 * Code challenge link: https://adventofcode.com/2022/day/5
 */
public class Day5 {
  public static void main(String[] args) {
    List<String> data = InputUtil.getFileData(".\\src\\adventofcode\\input\\day5.txt");
    System.out.println("Result1 is: " + getResult(data, true));
    System.out.println("Result1 is: " + getResult(data, false));
  }

  private static String getResult(List<String> data, boolean isFirst) {
    ArrayList<Deque<Character>> stacks = getInitialStacks();
    StringBuilder result = new StringBuilder();
    for (String string : data) {
      String[] words = string.split(" ");
      int count = Integer.parseInt(words[1]);
      int start = Integer.parseInt(words[3]) - 1;
      int end = Integer.parseInt(words[5]) - 1;
      if (isFirst) {
        for (int i = 0; i < count; i++) {
          stacks.get(end).push(stacks.get(start).pop());
        }
      } else {
        char[] chunk = new char[count];
        for (int i = count - 1; i >= 0; i--) {
          chunk[i] = stacks.get(start).pop();
        }
        for (int i = 0; i < count; i++) {
          stacks.get(end).push(chunk[i]);
        }
      }
    }
    stacks.forEach(stack -> result.append(stack.pop()));
    return result.toString();
  }

  private static ArrayList<Deque<Character>> getInitialStacks() {
    ArrayList<Deque<Character>> stacks = new ArrayList<>();
    stacks.add(new ArrayDeque<>(Arrays.asList('V', 'R', 'H', 'B', 'G', 'D', 'W')));
    stacks.add(new ArrayDeque<>(Arrays.asList('F', 'R', 'C', 'G', 'N', 'J')));
    stacks.add(new ArrayDeque<>(Arrays.asList('J', 'N', 'D', 'H', 'F', 'S', 'L')));
    stacks.add(new ArrayDeque<>(Arrays.asList('V', 'S', 'D', 'J')));
    stacks.add(new ArrayDeque<>(Arrays.asList('V', 'N', 'W', 'Q', 'R', 'D', 'H', 'S')));
    stacks.add(new ArrayDeque<>(Arrays.asList('M', 'C', 'H', 'G', 'P')));
    stacks.add(new ArrayDeque<>(Arrays.asList('C', 'H', 'Z', 'L', 'G', 'B', 'J', 'F')));
    stacks.add(new ArrayDeque<>(Arrays.asList('R', 'J', 'S')));
    stacks.add(new ArrayDeque<>(Arrays.asList('M', 'V', 'N', 'B', 'R', 'S', 'G', 'L')));
    return stacks;
  }
}
