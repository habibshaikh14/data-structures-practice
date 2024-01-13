package assignments;

import static java.lang.System.out;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(-2);
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            out.println("Positive");
        } else if (number < 0) {
            out.println("Negative");
        } else {
            out.println("Zero");
        }
    }
}
