package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class CalculateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate date1=LocalDate.now();
LocalDate myDate=LocalDate.of(1988, 8, 26);

long betweenInDay=Math.abs(ChronoUnit.DAYS.between(date1, myDate));
System.out.println(betweenInDay+"Мне дней");
long betweenInYear=Math.abs(ChronoUnit.YEARS.between(date1, myDate));
System.out.println(betweenInYear+"Мне лет");
long betweenInMonth=Math.abs(ChronoUnit.MONTHS.between(date1, myDate));
System.out.println(betweenInMonth+"Мне  месяцев");
Period myAge=Period.between(date1, myDate);
System.out.println(myAge.getYears()+"Years"+myAge.getMonths()+"month"+myAge.getDays());
// or
long inDay=Math.abs(date1.until(myDate, ChronoUnit.DAYS));
long inMonth=Math.abs(date1.until(myDate, ChronoUnit.MONTHS));
long inYears=Math.abs(date1.until(myDate, ChronoUnit.YEARS));
System.out.println(inDay+" "+inMonth+" "+inYears);
LocalDateTime ldt1=myDate.atStartOfDay();
LocalDateTime ldt2=LocalDateTime.now();
long myMinute=Math.abs(ChronoUnit.MINUTES.between(ldt1, ldt2));
System.out.println(myMinute+" myMin");
//или
long myHour=Math.abs(ldt1.until(ldt2, ChronoUnit.HOURS));
System.out.println(myHour+"myhours");
ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.systemDefault());
ZonedDateTime zdt2=ldt1.atZone(ZoneId.of("Europe/Minsk"));
long min=Math.abs(ChronoUnit.MINUTES.between(zdt1, zdt2));
System.out.println(min);
ZonedDateTime zdt3=ldt1.atZone(ZoneId.of("Europe/Rome"));
long test=ChronoUnit.HOURS.between(zdt2, zdt3);
System.out.println(test);
long test2=zdt2.until(zdt3, ChronoUnit.MINUTES);
System.out.println(test2);



	}

}
