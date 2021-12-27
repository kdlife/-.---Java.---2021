package date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime test=LocalDateTime.now();
int year=test.getYear();
int month=test.getMonthValue();
int day = test.getDayOfMonth();
int hours=test.getHour();
int min=test.getMinute();
int sec= test.getSecond();
int nano=test.getNano();

System.out.println("year"+ year+" month"+month+"Day"+day+"hours"+hours+"min"+min+"sec"+sec+"nana"+nano);
//or
int year2=test.get(ChronoField.YEAR);
int month2=test.get(ChronoField.MONTH_OF_YEAR);
int day2=test.get(ChronoField.DAY_OF_MONTH);
int hours2=test.get(ChronoField.HOUR_OF_DAY);
int min2=test.get(ChronoField.MINUTE_OF_HOUR);
int sec2=test.get(ChronoField.SECOND_OF_MINUTE);
int nano2=test.get(ChronoField.NANO_OF_SECOND);
System.out.println("year"+ year2+" month"+month2+"Day"+day2+"hours"+hours2+"min"+min2+"sec"+sec2+"nana"+nano2);
// точно также из LocalDate, LocalTime, ZonedDateTime И других объектов. 
	}

}
