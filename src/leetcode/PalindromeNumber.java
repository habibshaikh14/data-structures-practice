package leetcode;

import static java.lang.System.out;

public class PalindromeNumber {
    public static void main(String[] args) {
        for (int i : new int[] { -121, 1221, 123521, 0 }) {
            out.println(isPalindrome(i));
        }
    }

    public static boolean isPalindrome(int x) {
        if (x >= 0) {
            int temp = x;
            int pal = 0;
            while (x != 0) {
                pal = pal * 10 + x % 10;
                x /= 10;
            }
            return temp == pal;
        } else {
            return false;
        }
    }
}
