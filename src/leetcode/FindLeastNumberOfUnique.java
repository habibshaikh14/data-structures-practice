package leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

// https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/description

public class FindLeastNumberOfUnique {
  public static void main(String[] args) {
    System.out.println(findLeastNumOfUniqueInts(new int[] { 2, 2 }, 1));
  }

  private static int findLeastNumOfUniqueInts(int[] arr, int k) {
    HashMap<Integer, Integer> fMap = new HashMap<>();
    for (int num : arr) {
      fMap.putIfAbsent(num, 0);
      fMap.put(num, fMap.get(num) + 1);
    }

    int[] freq = new int[arr.length + 1];
    int res = 0;
    for (Entry<Integer, Integer> entry : fMap.entrySet()) {
      freq[entry.getValue()]++;
      res++;
    }

    for (int i = 1; i < freq.length; i++) {
      res -= freq[i];
      if ((freq[i] * i) < k) {
        k -= (freq[i] * i);
        freq[i] = 0;
      } else {
        freq[i] -= k / i;
        res += freq[i];
        break;
      }
    }

    return res;
  }
}
