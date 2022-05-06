package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class DateTimeCheck {
    public static void dateTimeCheck(String dateOfBirth) throws Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(dateOfBirth,formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        if (localDate1.isBefore(localDate2)){
            throw new StarTimeException();
        }
    }
}
