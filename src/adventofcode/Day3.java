package adventofcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import adventofcode.util.InputUtil;

/*
 * Code challenge link: https://adventofcode.com/2022/day/3
 */
public class Day3 {
  public static void main(String[] args) {
    List<String> data = InputUtil.getFileData(".\\src\\adventofcode\\input\\day3.txt");
    int result1 = 0;
    int result2 = 0;
    int groupCounter = 0;
    ArrayList<HashSet<Character>> group = new ArrayList<>();
    for (String string : data) {
      group.add(groupCounter++, getCharacterSet(string));
      int mid = string.length() / 2;
      HashSet<Character> commonCharacters = getCharacterSet(string.substring(0, mid));
      commonCharacters.retainAll(getCharacterSet(string.substring(mid, string.length())));
      result1 += getPriorityValue(commonCharacters);

      if (groupCounter == 3) {
        group.forEach(System.out::println);
        commonCharacters = group.get(0);
        commonCharacters.retainAll(group.get(1));
        commonCharacters.retainAll(group.get(2));
        result2 += getPriorityValue(commonCharacters);
        System.out.println();
        groupCounter = 0;
        group.clear();
      }
    }
    System.out.println("Result1 is: " + result1);
    System.out.println("Result2 is: " + result2);
  }

  private static HashSet<Character> getCharacterSet(String string) {
    HashSet<Character> charSet = new HashSet<>();
    for (int i = 0; i < string.length(); i++) {
      charSet.add(string.charAt(i));
    }
    System.out.println(string + " ===> " + charSet.toString());
    return charSet;
  }

  private static int getPriorityValue(HashSet<Character> characters) {
    int value = 0;
    for (Character character : characters) {
      if (character >= 'A' && character <= 'Z') {
        value = character - 38;
      } else {
        value = character - 96;
      }
      System.out.println("Character=" + character + " Value=" + value);
    }
    return value;
  }
}
