package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// До JDK 8  SimpleDateFormat
		Date date = new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");//задаем формат вывовдв даты
		String strDate=formatter.format(date);
		System.out.println("Выводим строку с датой" + strDate);
// после jdk8 используем DataTimeFormatter and LocaleData 		
		LocalDate locDate= LocalDate.now();
		DateTimeFormatter formatDate=DateTimeFormatter.ofPattern("dd-MM-yyyy");// задаем формат вывовдв даты
		String strLocDate= formatDate.format(locDate);
		System.out.println(strLocDate);
	// короткая запись. 
		String shortlyDate=LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Shortly  // "+shortlyDate);
		// время
		LocalTime locTime=LocalTime.now();
		DateTimeFormatter form1=DateTimeFormatter.ofPattern("HH:mm:ss");
		String testTime=form1.format(locTime);
		System.out.println(testTime);
		// коротная запись 
		String shortlyTime=LocalTime.now().format(DateTimeFormatter.ofPattern("HH/mm/ss"));
		System.out.println(shortlyTime);
		// date + time
		LocalDateTime localDT=LocalDateTime.now();
		DateTimeFormatter formDateTime=DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		String testDataTime=formDateTime.format(localDT);
		System.out.println(testDataTime);
		//короткая запись
		String strDataTime=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss"));
		System.out.println(strDataTime);
		//(дата-время с часовым поясом в календарной системе ISO- 8601): 
		ZonedDateTime dateTime=ZonedDateTime.now();
		DateTimeFormatter formZone=DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ");// E день, МММ месяц, SSSZ милисек + смещение
		String testZone1=formZone.format(dateTime);
		System.out.println(testZone1);
		// коротая запись 
		String testZDT=ZonedDateTime.now().format(DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ"));
		System.out.println(testZDT);
		// дата со смешением
		OffsetDateTime offsetDateTime=OffsetDateTime.now();
		DateTimeFormatter formOff=DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ");
		String testOff=formOff.format(offsetDateTime);
		System.out.println(testOff);
		 LocalDate ld = LocalDate.now();        
	     System.out.println("Only date: " + ld);
	        
	        LocalTime lt = LocalTime.now();        
	        System.out.println("Only time: " + lt);
	        LocalDateTime dateTimeConnect=LocalDateTime.of(ld, lt);
	        System.out.println(dateTimeConnect.format(DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss a")));
		
	}

}
