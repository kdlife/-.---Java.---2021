package date;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ArriveFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime time1=LocalDateTime.of(2022, Month.FEBRUARY, 25, 18, 10);
		ZonedDateTime time1Depart=time1.atZone(ZoneId.of("Europe/Minsk"));
		System.out.println(time1Depart+"Местное время вылета");
		ZonedDateTime ArrivTime1=time1Depart.plusHours(15).plusMinutes(30);
		System.out.println(ArrivTime1+"Время прилета по минскому времени");
		ZonedDateTime DepartTimeInArriv1=time1Depart.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		System.out.println(DepartTimeInArriv1+"Время вылета по Австралии");
		ZonedDateTime ArrivTime2=ArrivTime1.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
		System.out.println(ArrivTime2+"Время прилета по Австралии");
		OffsetDateTime offTime1=time1Depart.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
		OffsetDateTime offTime2=ArrivTime1.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
		System.out.println("Время вылета по UTC"+offTime1);
		System.out.println("Время прилета по UTC"+ offTime2);
	}

}
