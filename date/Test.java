package date;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import date.AllTimeZone.OffsetType;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>test=AllTimeZone.allZone1(OffsetType.UTC);
Collections.sort(test);
//test.forEach(System.out::println);

List<String>test2=AllTimeZone.fetchTimeZones7(OffsetType.GMT);
Collections.sort(test2);
//test2.forEach(System.out::println);
System.out.println("Выводим время с часовым поясом");
List<String> test3=ZonedTime.AllTime();
Collections.sort(test3);
test3.forEach(System.out::println);
LocalDate date=LocalDate.now();
System.out.println("текушей дате ь"+date);
LocalDate firstDayNowMonth=date.with(TemporalAdjusters.firstDayOfMonth());
LocalDate lastDayNowMonth=date.with(TemporalAdjusters.lastDayOfMonth());
System.out.println("Первое число текушего месяца"+firstDayNowMonth);
System.out.println("последнее число текушего месяца"+lastDayNowMonth);
LocalDate endDate=FindFirstDay.findDay(date, 31);
System.out.println("Добавим к текушей дате 31 день"+endDate);
LocalDate newSaturday=date.with(NEXT_SATURDAY);
System.out.println("следующая суббота будет"+newSaturday);
FindFirstDay  fd=new FindFirstDay();
LocalDate newSaturday2=date.with(fd);
System.out.println("следующая суббота будет"+newSaturday2);
// convert date
Instant inst1=Instant.now();
System.out.println("Дата и время в Instant"+ inst1);
Date dateFromInst=DateConvert.dateFromInstant(inst1);
System.out.println("Обьект дата полученый из Instant" + dateFromInst);
LocalDate locDateFromDate=DateConvert.dateToLocalDate(dateFromInst);
System.out.println("Обьект Локалдата из Дата"+locDateFromDate);








	}
	 static TemporalAdjuster NEXT_SATURDAY = TemporalAdjusters.ofDateAdjuster(today -> {

	        DayOfWeek dayOfWeek = today.getDayOfWeek();

	        if (dayOfWeek == DayOfWeek.SATURDAY) {
	            return today;
	        }

	        if (dayOfWeek == DayOfWeek.SUNDAY) {
	            return today.plusDays(6);
	        }

	        return today.plusDays(6 - dayOfWeek.getValue());
	    });
	
}
