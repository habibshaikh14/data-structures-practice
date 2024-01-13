package leetcode;

import static java.lang.System.out;

public class HaystackAndNeedle {
    public static void main(String[] args) {
        for (int i : new int[] { haystackAndNeedle("Saab", "bs"), haystackAndNeedle("abacus", "ac") }) {
            out.println(i);
        }
    }

    private static int haystackAndNeedle(String haystack, String needle) {
        if (needle.length() <= haystack.length()) {
            if (needle.length() > 0 && !haystack.equals(needle)) {
                int i = 0;
                while (i <= (haystack.length() - needle.length())) {
                    out.println(i);
                    if (haystack.startsWith(needle, i)) {
                        return i;
                    }
                    i++;
                }
                return -1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }
}
