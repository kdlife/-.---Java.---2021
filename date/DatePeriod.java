package date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DatePeriod {

	public static String periodTest(Period per) {
		StringBuffer sb=new StringBuffer();
		sb.append("Data:")
		.append("Year:").append(per.getYears())
		.append("Month").append(per.getMonths())
		.append("days").append(per.getDays());
				return sb.toString();
	}
	public static String durationTest(Duration dr) {
		StringBuffer sb =new StringBuffer();
		sb.append("Дней ").append(dr.toDays())
		.append("Часов").append(dr.toHoursPart())
		.append("min").append(dr.toMinutesPart())
		.append("sec").append(dr.toSecondsPart())
		.append("mil").append(dr.toMillisPart())
		.append("nano").append(dr.toNanosPart());
		
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Period days=Period.ofDays(10);
System.out.println(days);
Period daysYears=Period.of(1000, 10, 2);
System.out.println(daysYears);
LocalDate date=LocalDate.now();
Period periodFromDate=Period.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth());//  получаем обьект перилда ищ даты
System.out.println(periodFromDate);
Period perFromStr=Period.parse("P1000Y10M2D");// период из текста P1000Y10M2D
System.out.println(perFromStr);
LocalDate startDate=LocalDate.of(2002, 8, 20);
LocalDate EndDate=LocalDate.of(2022, 2, 22);
Period perBetween= Period.between(startDate, EndDate);//высчитыет разницу в датах
System.out.println(perBetween);
String testper=periodTest(perBetween);
System.out.println(testper);
System.out.println(perBetween.isNegative());
Period perPlus=perBetween.plusYears(2L);
System.out.println(perPlus);
Period p1=Period.ofDays(30);
Period p2=Period.ofDays(40);
Period p3=Period.ofMonths(2);
Period sump1p2=p1.plus(p2);
Period testsum=p1.plus(p2).plus(p3);
System.out.println("P1 period: "+ p1+" "+ "P2 Period: "+ p2 +" "+ " Period P3:"+p3+" "+ "Summa P1 P2: "+ sump1p2+ " "+ "Day +month " + testsum );
/// Класс Duration  аналогичен периоду только для минут секунд и часов
Duration durHours= Duration.ofHours(10);
System.out.println(durHours);
Duration minDur=Duration.ofMinutes(56);
Duration minDur2=Duration.of(25, ChronoUnit.MINUTES);
System.out.println(minDur+ " @ "+ minDur2);
LocalDateTime locdt=LocalDateTime.of(2012, 6, 25, 14, 55, 50, 320);//2012-06-25T14:55:50.000000320
System.out.println(locdt);
Duration fromLocDate=Duration.ofMinutes(locdt.getMinute());
System.out.println(fromLocDate);// минуты из даты
LocalTime locTime=LocalTime.now();
Duration fromTime=Duration.ofNanos(locTime.getNano());
System.out.println("Time "+ locTime+" Nano"+ fromTime);
Duration testParse=Duration.parse("P2DT3H44M");//длительности ISO-8601, PnDTnHnMn.ns 
System.out.println(testParse);
Instant start=Instant.now();
Instant end=Instant.now().plus(30, ChronoUnit.MINUTES);
Duration testBet=Duration.between(start, end);

System.out.println(start + " " +end + "Duration  " + testBet+ " in Seconds "+ testBet.getSeconds() );
Duration testLocBet=Duration.between(locdt, LocalDateTime.now());
System.out.println(testLocBet+"in day " + testLocBet.toDays());//  
System.out.println(durationTest(testLocBet) + "   "+ testLocBet.isNegative() + " Складываем два обьекта" + durationTest(testLocBet.plus(testBet)));

	}

}
