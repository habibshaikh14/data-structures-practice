package leetcode;

public class MyAtoi {
    public static void main(String[] args) {
        String numberString = "-91283472332";
        System.out.println(myAtoi(numberString));
    }

    private static int myAtoi(String numberString) {

        if (numberString.length() == 0) {
            return 0;
        }
        int i = 0;
        while (numberString.charAt(i) == ' ') {
            i++;
            if (i == numberString.length()) {
                return 0;
            }
        }

        int number = 0;
        boolean isNegative = false;
        boolean numberFound = false;
        char n = numberString.charAt(i);

        if (n == '+' || n == '-') {
            numberFound = true;
            isNegative = n == '-';
            i++;
        } else if ('0' <= n && n <= '9') {
            numberFound = true;
            number = n - 48;
            i++;
        }

        if (numberFound) {
            int prev = number;
            while (i < numberString.length()) {
                n = numberString.charAt(i);
                if ('0' <= n && n <= '9') {
                    prev = number;
                    number = (number * 10) + (n - 48);
                    if (number / 10 != prev) {
                        if (isNegative) {
                            return -2147483648;
                        } else {
                            return 2147483647;
                        }
                    }
                } else {
                    break;
                }
                i++;
            }
            if (isNegative) {
                number *= -1;
            }
        }
        return number;
    }
}