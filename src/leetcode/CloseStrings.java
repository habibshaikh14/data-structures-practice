package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/determine-if-two-strings-are-close/description/
public class CloseStrings {
  public static void main(String[] args) {
    System.out.println("Close Strings: " + closeStrings("wordss", "woords"));
  }

  private static boolean closeStrings(String word1, String word2) {
    int length = word1.length();
    if (length != word2.length())
      return false;
    int[] arr1 = new int[26];
    int[] arr2 = new int[26];
    for (int i = 0; i < length; i++) {
      arr1[word1.charAt(i) - 'a']++;
      arr2[word2.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (arr1[i] != arr2[i] && (arr1[i] == 0 || arr2[i] == 0)) {
        return false;
      }
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for (int i = 0; i < 26; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }
    return true;
  }
}
