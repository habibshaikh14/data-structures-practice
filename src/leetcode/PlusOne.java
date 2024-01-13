package leetcode;

import java.util.Arrays;

import static java.lang.System.out;

public class PlusOne {
    public static void main(String[] args) {
        for (int[] ints : Arrays.asList(new int[] { 9, 9 }, new int[] { 9, 8 }, new int[] { 8 }, new int[] {})) {
            out.println(Arrays.toString(plusOne(ints)));
        }
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }
        if (i < 0) {
            int[] a = new int[digits.length + 1];
            a[0] = 1;
            return a;
        } else {
            digits[i]++;
            return digits;
        }
    }
}
