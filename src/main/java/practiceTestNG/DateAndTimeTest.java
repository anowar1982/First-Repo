package practiceTestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class DateAndTimeTest {
@Test
public void DataAndTime(){
    LocalDateTime now = LocalDateTime.now();
    System.out.println("Before : " + now);
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formatDateTime = now.format(formatter);
    System.out.println("After : " + formatDateTime);
}
}
