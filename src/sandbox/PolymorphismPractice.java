package sandbox;

import static java.lang.System.out;

public class PolymorphismPractice {

    public static final String INVALID_INPUT = "Invalid input.";

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5, 9);
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(69);
        calcFeetAndInchesToCentimeters(420.69);
        toHoursMinutesAndSeconds(123, 45);
        toHoursMinutesAndSeconds(543, 21);
        toHoursMinutesAndSeconds(42069);
        toHoursMinutesAndSeconds(3661);
    }

    private static void toHoursMinutesAndSeconds(long minutes, long seconds) {
        if (minutes >= 0 && 0 <= seconds && seconds <= 59) {
            long hours = minutes / 60;
            minutes %= 60;
            out.println(addLeadingZero(hours) + "h:" + addLeadingZero(minutes) + "m:" + addLeadingZero(seconds) + "s");
        } else {
            out.println(INVALID_INPUT);
        }
    }

    private static void toHoursMinutesAndSeconds(long seconds) {
        if (0 <= seconds) {
            toHoursMinutesAndSeconds(seconds / 60, seconds % 60);
        } else {
            out.println(INVALID_INPUT);
        }
    }

    private static String addLeadingZero(long value) {
        return (value < 10 ? "0" : "") + value;
    }

    private static void calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && 0 <= inches && inches <= 12) {
            double centimeters = (feet * 12 + inches) * 2.54;
            out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimeters");
        } else {
            out.println(INVALID_INPUT);
        }
    }

    private static void calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            calcFeetAndInchesToCentimeters(Math.floor(inches / 12), inches % 12);
        } else {
            out.println(INVALID_INPUT);
        }
    }
}
