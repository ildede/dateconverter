package cloud.happydev.converter;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.JULY;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateConverterTest {

    @Test
    void toLocalDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, JULY, 26);
        Date testDate = calendar.getTime();

        LocalDate actual = DateConverter.toLocalDate(testDate);

        assertEquals(2020, actual.get(ChronoField.YEAR));
        assertEquals(7, actual.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(26, actual.get(ChronoField.DAY_OF_MONTH));
    }

    @Test
    void toLocalDateTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, JULY, 26, 22, 30, 45);
        Date testDate = calendar.getTime();

        LocalDateTime actual = DateConverter.toLocalDateTime(testDate);

        assertEquals(2020, actual.get(ChronoField.YEAR));
        assertEquals(7, actual.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(26, actual.get(ChronoField.DAY_OF_MONTH));
        assertEquals(22, actual.get(ChronoField.HOUR_OF_DAY));
        assertEquals(30, actual.get(ChronoField.MINUTE_OF_HOUR));
        assertEquals(45, actual.get(ChronoField.SECOND_OF_MINUTE));
    }
}
