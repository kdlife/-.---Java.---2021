package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class StartEndDAy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate myBirthDay=LocalDate.of(1988, 8, 26);
LocalDateTime startDay=myBirthDay.atStartOfDay();
System.out.println(startDay);
//or
LocalDateTime start2=LocalDateTime.of(myBirthDay, LocalTime.MIN);
System.out.println(start2);
//or
LocalDateTime  end1 =LocalDateTime.of(myBirthDay, LocalTime.MAX);
//or
LocalDateTime 	end2= myBirthDay.atTime(LocalTime.MAX);
System.out.println(end1);
System.out.println(end2);
ZonedDateTime startZone=myBirthDay.atStartOfDay(ZoneId.systemDefault());
ZonedDateTime startZone2=myBirthDay.atStartOfDay(ZoneId.of("Europe/Minsk"));
System.out.println(startZone);
System.out.println(startZone2);
//or
ZonedDateTime startZone3=LocalDateTime.of(myBirthDay, LocalTime.MIN).atZone(ZoneId.systemDefault());
System.out.println(startZone3);
ZonedDateTime endZone3=LocalDateTime.of(myBirthDay, LocalTime.MAX).atZone(ZoneId.systemDefault());
ZonedDateTime endZone2=LocalTime.MAX.atDate(myBirthDay).atZone(ZoneId.systemDefault());
System.out.println(endZone3);
System.out.println(endZone2);
LocalDateTime ldt=LocalDateTime.of(2020, 2, 6, 12, 20, 56);
LocalDateTime test=ldt.with(ChronoField.NANO_OF_DAY, 0);
LocalDateTime test2=ldt.with(ChronoField.NANO_OF_DAY, LocalTime.MAX.toNanoOfDay());
System.out.println(test);
System.out.println(test2);
ZonedDateTime startZone4=ldt.with(ChronoField.NANO_OF_DAY, 0).atZone(ZoneId.of("Europe/Minsk"));
ZonedDateTime endZone4=ldt.with(ChronoField.NANO_OF_DAY, LocalTime.MAX.toNanoOfDay()).atZone(ZoneId.systemDefault());
System.out.println(startZone4);
System.out.println(endZone4);
// in UTC
ZonedDateTime zdt=ZonedDateTime.now(ZoneOffset.UTC);
System.out.println(zdt);
ZonedDateTime zdtEnd=zdt.toLocalDate().atTime(LocalTime.MAX).atZone(zdt.getZone());
ZonedDateTime start=zdt.toLocalDate().atStartOfDay(zdt.getZone());
System.out.println(zdtEnd);
System.out.println(start);


	}

}
