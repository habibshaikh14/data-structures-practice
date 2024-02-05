package leetcode;

// https://leetcode.com/problems/sort-characters-by-frequency/description/
public class SortByFrequency {
  public static void main(String[] args) {
    System.out.println(frequencySort("eeeee"));

  }

  private static String frequencySort(String s) {
    int[] freq = new int[128];
    char[] chars = s.toCharArray();
    for (char c : chars) {
      freq[c]++;
    }
    String[] counts = new String[s.length() + 1];
    for (int i = 65; i < 128; i++) {
      int f = freq[i];
      if (f != 0) {
        if (counts[f] == null) {
          counts[f] = "";
        }
        counts[f] += (char) i;
      }
    }
    StringBuilder sb = new StringBuilder("");
    for (int i = counts.length - 1; i >= 0; i--) {
      if (counts[i] != null) {
        addCharacter(counts[i], sb, i);
      }
    }
    return sb.toString();
  }

  private static void addCharacter(String chars, StringBuilder sb, int count) {
    for (char c : chars.toCharArray()) {
      while (count != 0) {
        sb.append(c);
        count--;
      }
    }
  }
}
