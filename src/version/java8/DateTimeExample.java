package version.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // Output: 2023-05-17

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); // Output: 16:23:45.123456789

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); // Output: 2023-05-17T16:23:45.123456789

        LocalDate specificDate = LocalDate.of(2022, Month.JULY, 15);
        System.out.println(specificDate); // Output: 2022-07-15
    }
}
