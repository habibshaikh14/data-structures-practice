package leetcode;

import java.util.Arrays;

import static java.lang.System.out;

public class RomanToInt {
    public static void main(String[] args) {
        for (String s : Arrays.asList("MCMXCIV", "III", "DCXXI")) {
            out.println(romanToInt(s));
        }
    }

    public static int romanToInt(String s) {
        int res = 0;
        int i = s.length() - 1;
        while (i > 0) {
            int num = addNumber(s.charAt(i), s.charAt(--i));
            if (num == 4 || num == 9 || num == 40 || num == 90 || num == 400 || num == 900) {
                i--;
            }
            res += num;
        }
        if (i == 0) {
            res += addNumber(s.charAt(0), 'A');
        }
        return res;
    }

    private static int addNumber(char curr, char prev) {
        return switch (curr) {
            case 'I' -> 1;
            case 'V' -> 5 - (prev == 'I' ? 1 : 0);
            case 'X' -> 10 - (prev == 'I' ? 1 : 0);
            case 'L' -> 50 - (prev == 'X' ? 10 : 0);
            case 'C' -> 100 - (prev == 'X' ? 10 : 0);
            case 'D' -> 500 - (prev == 'C' ? 100 : 0);
            default -> 1000 - (prev == 'C' ? 100 : 0);
        };
    }
}
