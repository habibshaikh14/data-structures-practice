package leetcode;

import java.util.HashMap;
import java.util.HashSet;

// https://leetcode.com/problems/unique-number-of-occurrences/description/

public class UniqueOccurences {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 4, 4, 5, 5, 5 };
    System.out.println("UniqueOccurences: " + uniqueOccurrences(arr));
  }

  private static boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> numsMap = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (numsMap.containsKey(arr[i])) {
        numsMap.put(arr[i], numsMap.get(arr[i]) + 1);
      } else {
        numsMap.put(arr[i], 1);
      }
    }
    return numsMap.size() == new HashSet<Integer>(numsMap.values()).size();
  }
}
