package date;

import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;



public class DateConvert {
	public static final ZoneId DEFAULT_ZONEID=ZoneId.systemDefault();
	
	public static Instant instantFromDate (Date date) {
		return date.toInstant();
	}
	
	public static Date dateFromInstant(Instant  inst) {
		return Date.from(inst);
	}
	
	public static LocalDate dateToLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();// ZoneId.systemDefault() вынесем в отдельную переменную для удобства
	}
	public static Date localDateToDate(LocalDate date) {
		return Date.from(date.atStartOfDay(DEFAULT_ZONEID).toInstant());
	}
	public static LocalDateTime dateToLocalDateTime(Date date) {
		return date.toInstant().atZone(DEFAULT_ZONEID).toLocalDateTime();
	}
	public static Date localDateTimeToDate(LocalDateTime ldt) {
		return Date.from(ldt.atZone(DEFAULT_ZONEID).toInstant());
	}
	public static ZonedDateTime dateToZonedDateTime(Date date) {
		return  date.toInstant().atZone(DEFAULT_ZONEID);
	}
	public static Date dateFromZonedDateTime(ZonedDateTime zdt) {
		return Date.from(zdt.toInstant());
	}
	public static OffsetDateTime dateToOffsetDateTime(Date date) {
		return date.toInstant().atZone(DEFAULT_ZONEID).toOffsetDateTime();
	}
	/*
	 Конвертирование ИЗ OffsetTime В Date ДОЛЖНО учитывать, ЧТО OffsetTime не имеет компонента даты. Это означает, что решение должно установить дату на 1 января 1970 года в качестве эпохи: 
	 */
	public static Date dateFromOffsetDateTime(OffsetTime offsettime) {
		return Date.from(offsettime.atDate(LocalDate.EPOCH).toInstant());
	}
	public static LocalTime localTimeFromDate(Date date) {
		return LocalTime.ofInstant(date.toInstant(), DEFAULT_ZONEID);
	}
	/*
	 * Конвертирование LocalTime в Date должно учитывать, что LocalTime не имеет компонента даты. Это означает, что решением должна быть установлена дата 1 января 1970 года в качестве эпохи: 
	 */
	public static Date dateFromLocalTime(LocalTime locTime) {
		return Date.from(locTime.atDate(LocalDate.EPOCH).toInstant(DEFAULT_ZONEID.getRules().getOffset(Instant.now())));
	}
}
