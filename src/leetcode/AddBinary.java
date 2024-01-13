package leetcode;

import java.util.Arrays;

import static java.lang.System.out;

public class AddBinary {
    public static void main(String[] args) {
        for (String s : Arrays.asList(addBinary("110011", "1011"), addBinary("1111", "1"), addBinary("", "101"))) {
            out.println(s);
            out.println(Integer.parseInt(String.valueOf(" 100")));
        }
    }

    public static String addBinary(String a, String b) {
        boolean carry = false;
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        int i = 1;
        while (i <= maxLength) {
            boolean aVal = (a.length() - i >= 0) && a.charAt(a.length() - i) == '1';
            boolean bVal = (b.length() - i >= 0) && b.charAt(b.length() - i) == '1';
            boolean sum = aVal ^ bVal ^ carry;
            result.append(toChar(sum));
            carry = (aVal ^ bVal) ? carry : aVal;
            i++;
        }

        if (carry) {
            result.append('1');
        }

        return result.reverse().toString();
    }

    private static char toChar(boolean value) {
        if (value) {
            return '1';
        } else {
            return '0';
        }
    }
}
