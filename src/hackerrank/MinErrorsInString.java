import java.util.Scanner;

public class MinErrorsInString {

    public static final int MOD = 1000000007;

    public static int getMinErrors(String errorString, int x, int y) {
        int n = errorString.length();

        // Initial counts
        long count0 = 0;  // Number of sequences ending with '0'
        long count1 = 0;  // Number of sequences ending with '1'
        long errorsEndingWith0 = 0;  // Errors counting subsequences "10"
        long errorsEndingWith1 = 0;  // Errors counting subsequences "01"

        for (char ch : errorString.toCharArray()) {
            if (ch == '0') {
                // Update for a current '0'
                count0 = (count0 + 1) % MOD;
                errorsEndingWith0 = (errorsEndingWith0 + count1) % MOD;  // Add all '1's before this '0' to form "10"
            } else if (ch == '1') {
                // Update for a current '1'
                count1 = (count1 + 1) % MOD;
                errorsEndingWith1 = (errorsEndingWith1 + count0) % MOD;  // Add all '0's before this '1' to form "01"
            } else if (ch == '!') {
                // Case when character is '!'
                // Temporarily store previous counts
                long newCount0 = (count0 + 1) % MOD;
                long newCount1 = (count1 + 1) % MOD;

                // Compute new errors if '!' was '0' and if it was '1'
                long newErrorsEndingWith0 = (errorsEndingWith0 + count1) % MOD;  // If '!' is '0', it forms "10"
                long newErrorsEndingWith1 = (errorsEndingWith1 + count0) % MOD;  // If '!' is '1', it forms "01"

                // Update counts and errors to the minimum error configuration
                count0 = newCount0;
                count1 = newCount1;
                errorsEndingWith0 = Math.min(newErrorsEndingWith0 * y, newErrorsEndingWith1 * x) % MOD;
                errorsEndingWith1 = Math.min(newErrorsEndingWith0 * y, newErrorsEndingWith1 * x) % MOD;
            }
        }

        // Total minimum errors
        return (int) ((errorsEndingWith0 * y % MOD) + (errorsEndingWith1 * x % MOD)) % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String errorString = "01!0";
        int x = 2;
        int y = 3;

        int result = getMinErrors(errorString, x, y);
        System.out.println(result);
    }
}