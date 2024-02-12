package leetcode;

public class PermutationInString {
  public static void main(String[] args) {
    System.out.println(checkInclusion("adc", "caa"));
  }

  private static boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length()) {
      return false;
    }

    int[] count1 = new int[26]; // Array to store character counts of s1
    int[] count2 = new int[26]; // Array to store character counts of current window in s2

    // Initialize count1 array with character counts of s1
    for (char c : s1.toCharArray()) {
      count1[c - 'a']++;
    }

    // Initialize count2 array with character counts of the first window in s2
    for (int i = 0; i < s1.length(); i++) {
      count2[s2.charAt(i) - 'a']++;
    }

    // Sliding window approach
    for (int i = 0; i <= s2.length() - s1.length(); i++) {
      // Check if counts of characters in the current window match the counts in s1
      if (matches(count1, count2)) {
        return true;
      }

      // Slide the window by removing the character at the beginning and adding the
      // next character
      if (i < s2.length() - s1.length()) {
        count2[s2.charAt(i) - 'a']--; // Remove character at the beginning
        count2[s2.charAt(i + s1.length()) - 'a']++; // Add next character to the window
      }
    }

    return false;
  }

  // Helper method to check if two character count arrays match
  private static boolean matches(int[] count1, int[] count2) {
    for (int i = 0; i < 26; i++) {
      if (count1[i] != count2[i]) {
        return false;
      }
    }
    return true;
  }

}
