package leetcode;

import static java.lang.System.out;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        out.println(longestCommonPrefix(new String[] { "sad", "sup", "saddle" }));
    }

    public static String longestCommonPrefix(String[] strings) {
        int size = 0;
        if (strings.length > 0) {
            int smallest = strings[0].length();
            while (size < smallest) {
                boolean breakWhile = false;
                for (int i = 1; i < strings.length; i++) {
                    smallest = Math.min(smallest, strings[i].length());
                    if (smallest == 0 || strings[0].charAt(size) != strings[i].charAt(size)) {
                        breakWhile = true;
                        break;
                    }
                }
                if (breakWhile) {
                    break;
                }
                size++;
            }
        }
        return size > 0 ? strings[0].substring(0, size) : "";
    }
}
