package leetcode;

public class LargestPalindromeString {
    public static void main(String[] args) {
        System.out.println(largestPalindromeString("h"));
        System.out.println(OptimalSolution.longestPalindrome("h"));
    }

    private static String largestPalindromeString(String s) {
        String pal = "";
        char[] textArray = s.toCharArray();
        int textLength = s.length();
        int j = textLength - 1;
        for (int i = 0; (i < textLength) && (pal.length() < j - i + 1); i++) {
            while (i < j && (pal.length() < j - i + 1)) {
                if (textArray[i] == textArray[j]) {
                    String test = s.substring(i, j + 1);
                    if (isPalindrome(test.toCharArray())) {
                        if (pal.length() < test.length()) {
                            pal = test;
                        }
                        break;
                    }
                }
                j--;
            }
            j = textLength - 1;
        }
        return pal.length() == 0 ? String.valueOf(textArray[0]) : pal;
    }

    private static boolean isPalindrome(char[] cs) {
        for (int i = 0; i <= cs.length / 2; i++) {
            if (cs[i] != cs[cs.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

class OptimalSolution {

    private OptimalSolution() {
        // shouldn't be instantiated.
    }

    private static int maxLen = 0, start = 0;

    public static String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            check(i, i, s);
            check(i, i + 1, s);
        }
        return s.substring(start, start + maxLen);
    }

    private static void check(int i, int j, String s) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        int len = j - i - 1;
        if (maxLen < len) {
            maxLen = len;
            start = i + 1;
        }
    }
}
