package leetcode;

import java.util.Arrays;

import static java.lang.System.out;

public class LengthOfLastWord {
    public static void main(String[] args) {
        for (String s : Arrays.asList("Hello There.", "Hello  ", "Hi", " ")) {
            out.println(lengthOfLastWord(s));
        }
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && count > 0) {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}
