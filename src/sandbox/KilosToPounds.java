package sandbox;

public class KilosToPounds {

    public static void main(String[] args) {
        System.out.println("Hello there General.");
        final var POUNDS_TO_KILOS = 0.45359237d;
        var pounds = 33;

        double kilos = pounds * POUNDS_TO_KILOS;
        System.out.println(pounds + " pounds equals to " + kilos + " kilos");
    }
}
