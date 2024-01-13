package assignments;

import static java.lang.System.out;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(11.11132, 22.11134);
        areEqualByThreeDecimalPlaces(11.11132, 22.22234);
    }

    public static void areEqualByThreeDecimalPlaces(double one, double two) {
        if (one * 1000 == two * 1000) {
            out.println("Numbers are equal.");
        } else {
            out.println("Numbers are not equal.");
        }
    }
}
