package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateFormatToString {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub//  эти форматы нужно просто запомнить
String date= "2020-06-01";// обязательно соблюдать формат xxxx-xx-xx
String time= "12:52:01";// обязательно соблюдать формат XX:XX:XX
String dateAndTime="2020-06-01T12:52:01";// обязательно соблюдать формат xxxx-xx-xxTXX:XX:XX (Буква T посередине)
String zone = "2020-06-01T12:52:01+03:00[Europe/Minsk]";//03:00[Europe/Minsk] должно быть по стандаруту ISO 4
String offsetDateTime="2020-06-01T12:52:01+03:00";//бязательно соблюдать формат
String offsetTimeString="12:52:01+03:00";//бязательно соблюдать формат
System.out.println("Тестовая строка "+date);
LocalDate localDate1=LocalDate.parse(date);
System.out.println("Выводим дату полученную из строки"+ localDate1);
LocalTime localTime1=LocalTime.parse(time);
System.out.println("тестовое время в строке" + time+"  перевели в Time" + localTime1 );
LocalDateTime localDateTime1=LocalDateTime.parse(dateAndTime);
System.out.println("тестовое время и дата в строке" + dateAndTime+"  перевели в Time" + localDateTime1 );
ZonedDateTime znd=ZonedDateTime.parse(zone);
System.out.println("тестовое время и дата в строке+ зона" + zone+"  перевели в Time+зоне" + znd );
OffsetDateTime offsetT=OffsetDateTime.parse(offsetDateTime);
System.out.println("тестовое строке" + offsetDateTime+"  перевели в Time" + offsetT );
OffsetTime offsetTim=OffsetTime.parse(offsetTimeString);
System.out.println("тестовое строке" + offsetTimeString+"  перевели в Time" + offsetTim );
// если формат не совпадает со стандартным делаем свой
DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("dd.MM.yyyy");// задаем свой формат времени 
DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("HH.mm.ss");
String testFormatter="10.12.2021";
String testTimeFormatter="10.30.59";
LocalDate dateFormat1=LocalDate.parse(testFormatter, formatter1);
System.out.println("тестовое строке" + testFormatter+"  перевели в Time испольщуя свой вормат" + dateFormat1 );
LocalTime testTime=LocalTime.parse(testTimeFormatter, formatter2);
System.out.println("тестовое строке" + testTimeFormatter+"  перевели в Time испольщуя свой вормат" + testTime );
String testDateTimeFormatter="03/12/2021 11:52:00";
DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
LocalDateTime testDateTime=LocalDateTime.parse(testDateTimeFormatter, formatter3);
System.out.println("тестовое строке" + testDateTimeFormatter+"  перевели в Time испольщуя свой вормат" + testDateTime );
DateTimeFormatter zonedDateTimeFomatter = DateTimeFormatter.ofPattern ("dd.MM.yyyy, HH:mm:ssXXXXX '['VV']'"); 
ZonedDateTime zonedDateTimeFormatted = ZonedDateTime.parse("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]", zonedDateTimeFomatter); 
System.out.println("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]" +" перевели в Time испольщуя свой вормат" + zonedDateTimeFormatted );
	/// из книги 
System.out.println("Before Java 8 (default formatting styles): ");

DateFormat defaultDateFormatUS   = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.US);
// convert String to Date
// https://bugs.openjdk.java.net/browse/JDK-8206961 - why ",", read there
Date usDate = defaultDateFormatUS.parse("01/15/95, 5:23 AM"); 
// convert Date to String
String usDateAsString = usDate.toString();
String usDateAsFormattedString = defaultDateFormatUS.format(usDate);
System.out.println("SHORT format of date & time in US locale: " + usDateAsString);
System.out.println("SHORT format of date & time in US locale (formatted): " + usDateAsFormattedString);

DateFormat defaultDateFormatDE
        = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.GERMAN);
// convert String to Date
// https://bugs.openjdk.java.net/browse/JDK-8206961 - why ",", read there
Date deDate = defaultDateFormatDE.parse("15.01.95, 5:23 AM");
// convert Date to String
String deDateAsString = deDate.toString();
String deDateAsFormattedString = defaultDateFormatDE.format(deDate);
System.out.println("SHORT format of date & time in German locale: " + deDateAsString);
System.out.println("SHORT format of date & time in German locale (formatted): " + deDateAsFormattedString);

System.out.println("\nBefore Java 8 (custom formatting styles): ");

// convert String to Date        
DateFormat simpleDateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss zzz");
//simpleDateFormatter.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
Date dateSimpleFormatted = simpleDateFormatter.parse("1-Jun-2020 08:22:34 GMT");
// convert Date to String
String dateAsDefaultString = dateSimpleFormatted.toString();
String dateAsFormattedString = simpleDateFormatter.format(dateSimpleFormatted);
System.out.println("Default format: " + dateAsDefaultString);
System.out.println("Explicit format: " + dateAsFormattedString);

System.out.println("\nJava 8, convert without formatter:");

// convert String to LocalDate
LocalDate localDate = LocalDate.parse("2020-06-01");
// convert LocalDate to String
String localDateAsDefaultString = localDate.toString();
System.out.println("LocalDate: " + localDateAsDefaultString + "( year: " + localDate.getYear()
        + ", month: " + localDate.getMonthValue() + ", day: " + localDate.getDayOfMonth() + " )");

LocalTime localTime = LocalTime.parse("12:23:44");
// convert LocalTime to String
String localTimeAsDefaultString = localTime.toString();
System.out.println("LocalTime: " + localTimeAsDefaultString + "( hour: " + localTime.getHour()
        + ", minute: " + localTime.getMinute() + ", second: " + localTime.getSecond() + " )");

// convert String to LocalDateTime
LocalDateTime localDateTime = LocalDateTime.parse("2020-06-01T11:20:15");
// convert LocalDateTime to String
String localDateTimeAsDefaultString = localDateTime.toString();
System.out.println("LocalDateTime: " + localDateTimeAsDefaultString + "( year: " + localDateTime.getYear()
        + ", month: " + localDateTime.getMonthValue() + ", day: " + localDateTime.getDayOfMonth()
        + ", hour: " + localDateTime.getHour() + ", minute: " + localDateTime.getMinute()
        + ", second: " + localDateTime.getSecond() + " )");

// convert String to OffsetDateTime
OffsetDateTime offsetDateTime11 = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
// convert OffsetDateTime to String
String offsetDateTimeAsDefaultString = offsetDateTime11.toString();
System.out.println("OffsetDateTime: " + offsetDateTimeAsDefaultString + "( year: " + offsetDateTime11.getYear()
        + ", month: " + offsetDateTime11.getMonthValue() + ", day: " + offsetDateTime11.getDayOfMonth()
        + ", hour: " + offsetDateTime11.getHour() + ", minute: " + offsetDateTime11.getMinute()
        + ", second: " + offsetDateTime11.getSecond() + ", offset: " + offsetDateTime11.getOffset() + " )");

// convert String to OffsetTime
OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
// convert OffsetTime to String
String offsetTimeAsDefaultString = offsetTime.toString();
System.out.println("OffsetTime: " + offsetTimeAsDefaultString
        + "( hour: " + offsetTime.getHour() + ", minute: " + offsetTime.getMinute()
        + ", second: " + offsetTime.getSecond() + ", offset: " + offsetTime.getOffset() + " )");

// convert String to ZonedDateTime
ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-06-01T10:15:30+09:00[Asia/Tokyo]");
// convert ZonedDateTime to String
String zonedDateTimeAsDefaultString = zonedDateTime.toString();
System.out.println("ZonedDateTime: " + zonedDateTimeAsDefaultString + "( year: " + zonedDateTime.getYear()
        + ", month: " + zonedDateTime.getMonthValue() + ", day: " + zonedDateTime.getDayOfMonth()
        + ", hour: " + zonedDateTime.getHour() + ", minute: " + zonedDateTime.getMinute()
        + ", second: " + zonedDateTime.getSecond() + ", offset: " + zonedDateTime.getOffset()
        + ", zone: " + zonedDateTime.getZone() + " )");

System.out.println("\nJava 8, convert with formatter:");

DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
// convert String to LocalDate
LocalDate localDateFormatted = LocalDate.parse("01.06.2020", dateFormatter);
// convert LocalDate to String              
String localDateAsFormattedString = dateFormatter.format(localDateFormatted);
System.out.println("Date: " + localDateAsFormattedString + "( year: " + localDateFormatted.getYear()
        + ", month: " + localDateFormatted.getMonthValue() + ", day: " + localDateFormatted.getDayOfMonth() + " )");

DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
// convert String to LocalTime
LocalTime localTimeFormatted = LocalTime.parse("12|23|44", timeFormatter);
// convert LocalTime to String              
String localTimeAsFormattedString = timeFormatter.format(localTimeFormatted);
System.out.println("Time: " + localTimeAsFormattedString + "( hour: " + localTimeFormatted.getHour()
        + ", minute: " + localTimeFormatted.getMinute() + ", second: " + localTimeFormatted.getSecond() + " )");

DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
// convert String to LocalDateTime
LocalDateTime localDateTimeFormatted = LocalDateTime.parse("01.06.2020, 11:20:15", dateTimeFormatter);
// convert LocalDateTime to String        
String localDateTimeAsFormattedString = dateTimeFormatter.format(localDateTimeFormatted);
System.out.println("DateTime: " + localDateTimeAsFormattedString + "( year: " + localDateTimeFormatted.getYear()
        + ", month: " + localDateTimeFormatted.getMonthValue() + ", day: " + localDateTimeFormatted.getDayOfMonth()
        + ", hour: " + localDateTimeFormatted.getHour() + ", minute: " + localDateTimeFormatted.getMinute()
        + ", second: " + localDateTimeFormatted.getSecond() + " )");

DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ss, XXXXX");
// convert String to OffsetDateTime
OffsetDateTime offsetDateTimeFormatted = OffsetDateTime.parse("2007.12.03, 10:15:30, +01:00", offsetDateTimeFormatter);
// convert OffsetDateTime to String        
String offsetDateTimeAsFormattedString = offsetDateTimeFormatter.format(offsetDateTimeFormatted);
System.out.println("OffsetDateTime: " + offsetDateTimeAsFormattedString + "( year: " + offsetDateTimeFormatted.getYear()
        + ", month: " + offsetDateTimeFormatted.getMonthValue() + ", day: " + offsetDateTimeFormatted.getDayOfMonth()
        + ", hour: " + offsetDateTimeFormatted.getHour() + ", minute: " + offsetDateTimeFormatted.getMinute()
        + ", second: " + offsetDateTimeFormatted.getSecond() + ", offset: " + offsetDateTimeFormatted.getOffset() + " )");

DateTimeFormatter offsetTimeFormatter = DateTimeFormatter.ofPattern("HH mm ss XXXXX");
// convert String to OffsetTime
OffsetTime offsetTimeFormatted = OffsetTime.parse("10 15 30 +01:00", offsetTimeFormatter);
// convert OffsetTime to String
String offsetTimeAsFormattedString = offsetTimeFormatter.format(offsetTimeFormatted);
System.out.println("OffsetTime: " + offsetTimeAsFormattedString
        + "( hour: " + offsetTimeFormatted.getHour() + ", minute: " + offsetTimeFormatted.getMinute()
        + ", second: " + offsetTimeFormatted.getSecond() + ", offset: " + offsetTimeFormatted.getOffset() + " )");

	
	}

}
