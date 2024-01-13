package assignments;

import static java.lang.System.out;

public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(420.69);
        toMilesPerHour(12.11222121);
        toMilesPerHour(100);
    }

    public static void toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            out.println("Please enter a valid speed.");
        } else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
