package leetcode;

// https://leetcode.com/problems/rotate-image/description/
public class RotateMatrix {
  public static void main(String[] args) {
    rotate(new int[][] {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 } });
  }

  private static void rotate(int[][] matrix) {
    printMatrix(matrix);
    int size = matrix.length;
    for (int i = 0; i < size / 2; i++) {
      int edge1 = size - 1 - i;
      for (int j = i; j < edge1; j++) {
        final int edge2 = size - 1 - j;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[edge2][i];
        matrix[edge2][i] = matrix[edge1][edge2];
        matrix[edge1][edge2] = matrix[j][edge1];
        matrix[j][edge1] = temp;
      }
    }
    printMatrix(matrix);
  }

  private static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      System.out.print("[");
      for (int entry : row) {
        System.out.print(" " + entry + " ");
      }
      System.out.print("]\n");
    }
  }

}