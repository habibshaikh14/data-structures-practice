package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// https://leetcode.com/problems/top-k-frequent-elements/description/
public class TopKFrequentElements {
  public static void main(String[] args) {
    for (int value : topKFrequent(new int[] { 1, 2, 4, 4, 4, 2, 2, 6, 6, 3, 3 }, 3)) {
      System.out.print(value);
    }
  }

  public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freqMap = new HashMap<>();
    for (int num : nums) {
      if (freqMap.containsKey(num)) {
        freqMap.put(num, freqMap.get(num) + 1);
      } else {
        freqMap.put(num, 1);
      }
    }

    TreeMap<Integer, List<Integer>> freqListMap = new TreeMap<>();
    for (Integer freq : freqMap.keySet()) {
      int key = freqMap.get(freq);
      int value = freq;
      freqListMap.putIfAbsent(key, new ArrayList<>());
      freqListMap.get(key).add(value);
    }

    List<Integer> result = new ArrayList<>();
    for (Integer freq : freqListMap.descendingKeySet()) {
      List<Integer> values = freqListMap.get(freq);
      if (values.size() > k) {
        values = values.subList(0, k);
      }
      result.addAll(values);
      k -= values.size();
      if (k == 0) {
        break;
      }
    }

    return result.stream().mapToInt(i -> i).toArray();
  }
}
