package leetcode;

public class NumberOfDecoding {
    public static void main(String[] args) {
        String digits = "123456101";
        int n = digits.length();
        System.out.println("Count is " + countDecodingDP(digits, n));
    }

    static int countDecodingDP(String digits, int n) {
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        if (digits.charAt(0) == '0') {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            count[i] = 0;

            if (digits.charAt(i - 1) > '0') {
                count[i] = count[i - 1];
            }

            if (digits.charAt(i - 2) == '1' || (digits.charAt(i - 2) == '2' && digits.charAt(i - 1) < '7')) {
                count[i] += count[i - 2];
            }
        }
        return count[n];
    }
}