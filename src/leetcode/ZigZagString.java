package leetcode;

import static java.lang.System.out;

public class ZigZagString {
    public static void main(String[] args) {
        out.println(convert("PAYPALISHIRINGEVERYONE", 5));
    }

    public static String convert(String s, int numRows) {
        var sb = new StringBuilder(s);
        var result = new StringBuilder();
        for (var i = 1; i < numRows && sb.length() > 0; i++) {
            var pos = 0;
            var diff = (2 * (numRows - i)) - 1;
            do {
                if (pos > 0 && i > 1 && pos + 1 < sb.length()) {
                    result.append(sb.charAt(pos));
                    printRow(sb.charAt(pos), 2 * numRows - diff - 4);
                    sb.deleteCharAt(pos);
                }
                result.append(sb.charAt(pos));
                printRow(sb.charAt(pos), diff);
                sb.deleteCharAt(pos);
                pos += diff;
            } while (pos < sb.length());
            out.println();
        }
        for (var i = 0; i < sb.length(); i++) {
            printRow(sb.charAt(i), 2 * numRows - 3);
        }
        out.println();
        return result.append(sb).toString();
    }

    private static void printRow(char c, int n) {
        out.print(c);
        for (var i = 0; i < n; i++) {
            out.print(" ");
        }
    }
}
