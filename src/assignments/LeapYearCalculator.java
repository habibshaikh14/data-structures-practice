package assignments;

import static java.lang.System.out;

public class LeapYearCalculator {
    public static void main(String[] args) {
        isLeapYear(1800);
        isLeapYear(6969);
        isLeapYear(1924);
    }

    public static void isLeapYear(int year) {
        if (1 <= year && year <= 9999) {
            if (year % 4 == 0 && year % 100 == 0) {
                if (year % 400 == 0) {
                    out.println("It's a leap year");
                }
                out.println("Not a leap year");
            } else if (year % 4 == 0 && year % 100 != 0) {
                out.println("It's a leap year");
            }
        } else {
            out.println("Out of range.");
        }
    }
}
