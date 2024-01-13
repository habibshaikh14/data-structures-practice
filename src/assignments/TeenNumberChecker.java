package assignments;

import static java.lang.System.out;

public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(12, 17, 33);
        hasTeen(12, 17, 18);
    }

    public static void hasTeen(int one, int two, int three) {
        if (isTeen(one) || isTeen(two) || isTeen(three)) {
            out.println("There is a teen");

        } else {
            out.println("There is no teen");
        }
    }

    private static boolean isTeen(int number) {
        return (number <= 19 && number >= 13);
    }
}
