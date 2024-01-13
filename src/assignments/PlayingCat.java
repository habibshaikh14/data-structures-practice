package assignments;

import static java.lang.System.out;

public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true, 66);
        isCatPlaying(true, 21);
        isCatPlaying(false, 40);
        isCatPlaying(false, 30);
        isCatPlaying(true, 40);
    }

    public static void isCatPlaying(boolean summer, int temperature) {
        if (summer && temperature <= 45 && temperature >= 25) {
            out.println("Cat is playing.");
        } else if (temperature <= 35 && temperature >= 25) {
            out.println("Cat is playing.");
        } else {
            out.println("Cat is sleeping.");
        }
    }
}
