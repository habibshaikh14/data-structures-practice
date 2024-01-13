package adventofcode;

import java.util.HashMap;

import adventofcode.util.InputUtil;

/*
 * Code challenge link: https://adventofcode.com/2022/day/6
 */
public class Day6 {
  public static void main(String[] args) {
    final int PACKET_MARKER = 4;
    final int MESSAGE_MARKER = 14;
    String string = InputUtil.getFileData(".\\src\\adventofcode\\input\\day6.txt").get(0);
    int start = 0;
    int result1 = 0;
    int result2 = 0;
    HashMap<Character, Integer> charPositions = getCharacterMap();
    System.out.println(charPositions);
    for (int end = 0; end < string.length(); end++) {
      char currentChar = string.charAt(end);
      int oldPosition = charPositions.get(currentChar);
      if (oldPosition != 0 && oldPosition >= start) {
        start =  oldPosition + 1;
      }
      charPositions.put(currentChar, end);
      int difference = end - start + 1;
      if (result1 == 0 && difference == PACKET_MARKER) {
        result1 = start + PACKET_MARKER;
      }
      if (difference == MESSAGE_MARKER) {
        result2 = start + MESSAGE_MARKER;
        break;
      }
    }
    System.out.println("Result1 is: " + result1);
    System.out.println("Result2 is: " + result2);
  }

  private static HashMap<Character, Integer> getCharacterMap() {
    HashMap<Character, Integer> characterMap = new HashMap<>();
    for (char ch = 'a'; ch <= 'z'; ch++) {
      characterMap.put(ch, 0);
    }
    return characterMap;
  }
}