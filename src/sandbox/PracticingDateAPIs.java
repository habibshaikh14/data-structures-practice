package sandbox;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static java.lang.System.out;

public class PracticingDateAPIs {
    public static void main(String[] args) {
        playWithLocalTime();
        playWithLocalDate();
        playWithLocalDateTime();
        var dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy+hh:mm:ss+cccc+LLLL");
        var sdf = new SimpleDateFormat("EEEE-dd-MMMM-yyyy");
        var dateTime = LocalDateTime.now();
        out.println(dateTime);
        out.println(dateTime.format(dtf));
        out.println(sdf.format(new Date()));
    }

    private static void playWithLocalDateTime() {
        out.println("::::::::This is Local Date Time::::::::::::");
        var dateTime = LocalDateTime.now();
        out.println(dateTime);
        out.println("This is day of the year: " + dateTime.getDayOfYear());
        out.println("This is instant :" + dateTime.toInstant(ZoneOffset.UTC));
    }

    private static void playWithLocalTime() {
        out.println(":::::::::This is Local Time::::::::::::");
        var time = LocalTime.now();
        out.println(time);
        out.println(time.getNano());
        out.println(time.toNanoOfDay());
        out.println(time.toSecondOfDay());
    }

    private static void playWithLocalDate() {
        out.println("::::::::::This is Local Date::::::::::::");
        var date = LocalDate.now();
        out.println(date);
        out.println(date.plus(1, ChronoUnit.DAYS));
        out.println(date.getChronology());
        out.println(date.getDayOfYear());
        out.println(date.getDayOfWeek());
        out.println(date.getEra());
        out.println(date.atTime(LocalTime.MIDNIGHT));
    }
}
