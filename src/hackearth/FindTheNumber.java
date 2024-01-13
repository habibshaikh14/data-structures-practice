package hackearth;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheNumber {

  public static void main(String[] args) {
    int n = 50;
    int x = 8;
    long k = 40001;
    String s = "69859241839387868941176158769631317592843734734832";

    String soln = solution(x, k, s, n);
    System.out.println(soln);
  }

  private static String solution(int x, long k, String s, int n) {
    StringBuilder result = new StringBuilder();
    ArrayList<String> blocks = new ArrayList<>();
    for (int start = 0; start < n; start = start + x) {
      int end = start + x;
      if (end > n) {
        end = n;
      }
      char[] block = s.substring(start, end).toCharArray();
      Arrays.sort(block);
      StringBuilder blockString = new StringBuilder();
      blockString.append(block[0]);
      for (int j = 1; j < block.length; j++) {
        if (block[j] != block[j - 1]) {
          blockString.append(block[j]);
        }
      }
      blocks.add(blockString.toString());
    }
    System.out.println(blocks);
    k--;
    for (int i = blocks.size() - 1; i >= 0; i--) {
      String position = "0";
      String block = blocks.get(i);
      if (k != 0) {
        position = String.valueOf(k % block.length());
        k /= block.length();
      }
      result.append(block.charAt(Integer.parseInt(position)));
      System.out.println(position);
    }
    return result.reverse().toString();
  }
}
