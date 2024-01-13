package assignments;

import static java.lang.System.out;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 12);
        shouldWakeUp(true, 6);
        shouldWakeUp(false, 23);
    }

    public static void shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if ((hourOfDay < 8 && hourOfDay >= 0) || hourOfDay == 23) {
                out.println("I am awake.");
            } else {
                out.println("Dog is playing.");
            }
        } else {
            out.println("Dog is sleeping.");
        }
    }
}
