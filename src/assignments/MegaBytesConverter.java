package assignments;

import static java.lang.System.out;

public class MegaBytesConverter {
    public static void main(String[] args) {
        toMegaBytes(1232);
        toMegaBytes(6969);
    }

    public static void toMegaBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megaBytes = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;
            out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
        } else {
            out.println("Invalid Value");
        }
    }
}
