package leetcode;

public class RotateArray {
  public static void main(String[] args) {
    int[] a = new int[] { 1, 2, 3, 4 };
    int k = 2;
    int[] queries = new int[] { 1, 2 };
    for (int i = 0; i < k; i++) {
      int j;
      int last;
      last = a[a.length - 1];

      for (j = a.length - 1; j > 0; j--) {
        a[j] = a[j - 1];
      }
      a[0] = last;
    }

    for (int i = 0; i < queries.length; i++) {
      System.out.println("a[" + queries[i] + "] = " + a[queries[i]]);
    }

  }
}
