package Task13;

        //Вывести на экран строку, которая представляет собой период длиной в неделю.
        //Пример: 07 августа - 14 августа

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task13 {

    public static void main (String[] args){
        ZonedDateTime minskTime = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));

        LocalDate toDayFull = LocalDate.now();
        LocalDate weekEarlierFull = toDayFull.minusWeeks(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM", new Locale("ru"));

        String toDay = toDayFull.format(formatter);
        String weekEarlier = weekEarlierFull.format(formatter);

        System.out.println(weekEarlier + " - " + toDay);
    }
}
