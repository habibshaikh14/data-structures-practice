package assignments;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class AssignmentsRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("""
                ::::::::Welcome to Assignment runner window::::::::
                Please choose an option.
                1. Positive Negative Zero.
                2. Speed Converter.
                3. Megabytes Converter.
                4. Barking Dog.
                5. Leap year calculator.
                6. Check numbers up to 3 decimal.
                7. Check if there is a teen.
                8. Check if cat is playing.
                """);
        int option = sc.nextInt();
        out.println();
        switch (option) {
            case 1 -> positiveNegativeZero(sc);
            case 2 -> speedConverter(sc);
            case 3 -> megaBytesConverter(sc);
            case 4 -> barkingDog(sc);
            case 5 -> leapYearCalculator(sc);
            case 6 -> decimalComparator(sc);
            case 7 -> teenNumberChecker(sc);
            case 8 -> playingCat(sc);
            default -> out.println("Option was invalid :(");
        }
    }

    private static void playingCat(Scanner sc) {
        out.println("Enter summer and temperature");
        boolean summer = sc.nextBoolean();
        int temperature = sc.nextInt();
        PlayingCat.isCatPlaying(summer, temperature);
    }

    private static void teenNumberChecker(Scanner sc) {
        out.println("Enter three ages.");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        TeenNumberChecker.hasTeen(one, two, three);
    }

    private static void decimalComparator(Scanner sc) {
        out.println("Enter numbers");
        double one = sc.nextDouble();
        double two = sc.nextDouble();
        DecimalComparator.areEqualByThreeDecimalPlaces(one, two);
    }

    private static void leapYearCalculator(Scanner sc) {
        out.println("Enter year");
        int year = sc.nextInt();
        LeapYearCalculator.isLeapYear(year);
    }

    private static void barkingDog(Scanner sc) {
        out.println("Enter Barking and Hour");
        boolean barking = sc.nextBoolean();
        int hourOfDay = sc.nextInt();
        BarkingDog.shouldWakeUp(barking, hourOfDay);
    }

    private static void megaBytesConverter(Scanner sc) {
        out.println("Enter kilobytes");
        int kiloBytes = sc.nextInt();
        MegaBytesConverter.toMegaBytes(kiloBytes);
    }

    private static void speedConverter(Scanner sc) {
        out.println("Enter speed in kilometers per hour (km/h)");
        double speedKilometersPerHour = sc.nextDouble();
        SpeedConverter.toMilesPerHour(speedKilometersPerHour);
    }

    private static void positiveNegativeZero(Scanner sc) {
        out.println("Enter an integer value.");
        int number = sc.nextInt();
        PositiveNegativeZero.checkNumber(number);
    }
}
