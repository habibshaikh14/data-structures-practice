package leetcode;

public class HammingWeight {
  /**
   * Write a function that takes an unsigned integer and returns the number of '1'
   * bits it has (also known as the Hamming weight).
   * 
   */
  public static void main(String[] args) {
    System.out.println(hammingWeight(00001011));
  }

  private static int hammingWeight(int n) {
    int count = 0;
    while (n != 0) {
      n = n & (n - 1);
      count++;
    }
    return count;
  }
}
