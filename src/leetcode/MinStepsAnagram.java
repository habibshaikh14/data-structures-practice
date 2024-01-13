package leetcode;

import java.util.Date;
import java.util.HashMap;

public class MinStepsAnagram {
  public static void main(String[] args) {
    System.err.println(minSteps1("leetcode", "practice"));
    System.err.println(minSteps2("leetcode", "practice"));
  }
  
  public static int minSteps2(String s, String t) {
    System.out.println("Start: " + new Date().getTime());
    int[] freq = new int[26];
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i) - 'a']++;
      freq[t.charAt(i) - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
      result+= freq[i] > 0 ? freq[i] : 0;
    }
    System.out.println("End: " + new Date().getTime());
    return result;
  }

  public static int minSteps1(String s, String t) {
    System.out.println("Start: " + new Date().getTime());
    HashMap<Character, Integer> stringMap = new HashMap<>();
    int result = s.length();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (stringMap.containsKey(c)) {
        stringMap.put(c, stringMap.get(c) + 1);
      } else {
        stringMap.put(c, 1);
      }
    }
    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      if (stringMap.containsKey(c) && stringMap.get(c) > 0) {
        stringMap.put(c, stringMap.get(c) - 1);
        result--;
      }
    }
    System.out.println("Start: " + new Date().getTime());
    return result;    
  }
}
