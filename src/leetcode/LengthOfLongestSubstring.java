package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LengthOfLongestSubstring {

  /**
   * Given a string s, find the length of the longest substring without repeating
   * characters.
   * 
   * Input: s = "abcabcbb" Output: 3
   * 
   */

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("habib");
    strings.add("Hello World");
    strings.add("I am the best");
    strings.add("bbbbba");
    for (String string : strings) {
      System.out.println(lengthOfLongestSubstring(string));
    }
  }

  private static int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>(); // create a set to store unique char values
    int i = 0;
    int j = 0;
    int res = 0;
    while (j < s.length()) {
      if (!set.contains(s.charAt(j))) { // if set doesn't contain the char, we'll simply add it to the set.
        set.add(s.charAt(j++));
        res = Math.max(set.size(), res); // we will update the result value after each iteration.
      } else
        set.remove(s.charAt(i++)); // if set contains the char, then we have to remove it from the beginning, so as
                                   // to mantain the substring.
    }
    return res; // finally, return the result.
  }

}
