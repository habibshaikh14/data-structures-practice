package leetcode;

import static java.lang.System.out;

public class ReverseInt {
    public static void main(String[] args) {
        // Print 0 if x is out of signed int range.
        int x = 1534236469;
        out.println(reverse(x));
    }

    private static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (((((res * 10) + (x % 10)) - (x % 10)) / 10) != res) {
                res = 0;
                break;
            }
            res = (res * 10) + (x % 10);
            x /= 10;
        }
        return res;
    }
}
