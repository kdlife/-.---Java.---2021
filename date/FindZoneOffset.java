package date;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;

public class FindZoneOffset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone zone=TimeZone.getTimeZone("Europe/Minsk");
		int zoneOff=zone.getRawOffset();
		System.out.println("Смещение от UTC"+zoneOff);
		String zoneOffStr=formatZone(zoneOff);
		System.out.println("После форматирования"+zoneOffStr);
		// через календарь
		Calendar calendar= Calendar.getInstance();
		calendar.set(2020, 10, 20);
		TimeZone zoneMinsk=TimeZone.getTimeZone("Europe/Minsk");
		System.out.println("Тиме зоне минск"+zoneMinsk);
		zoneMinsk.useDaylightTime();
		System.out.println("Тиме зоне минск"+zoneMinsk);
		int zoneMinskTime=zoneMinsk.getOffset(calendar.getTime().getTime());
		System.out.println("получено смещение в милисек"+zoneMinskTime);
		String zoneMinskFormat=formatZone(zoneMinskTime);
		System.out.println("после формата"+zoneMinskFormat);

        // JDK 8
        System.out.println("\n\nStarting with JDK 8:");
        ZoneOffset zone1=ZoneOffset.UTC;
        System.out.println(zone1); //Z
        ZoneId myZone=ZoneId.systemDefault();
        System.out.println(myZone);
        LocalDateTime ldt=LocalDateTime.now();
        ZoneOffset zone2=myZone.getRules().getOffset(ldt);
        System.out.println(zone2);
        ZoneOffset zoneFromStr=ZoneOffset.of("+02:00");
        System.out.println("Смещение из строки"+ zoneFromStr);
        OffsetTime off1=OffsetTime.now(zoneFromStr);
        System.out.println(off1);
        OffsetDateTime off2=OffsetDateTime.now(zoneFromStr);
        System.out.println(off2);
        ZoneOffset zonefromHM=ZoneOffset.ofHoursMinutes(10, 30);
        System.out.println(zonefromHM);
        ZoneOffset zonefromoff=off1.getOffset();
        System.out.println(zonefromoff);
        
	}

	private static String formatZone(int zoneOff) {
		// TODO Auto-generated method stub
		
		if(zoneOff==0) {
			return "00:00";
		}
		long offsetHour=TimeUnit.MILLISECONDS.toHours(zoneOff);//перевод в часы
		long offsetMin=TimeUnit.HOURS.toMinutes(offsetHour);// переводим часы в минуты
		long offsetMInFull=TimeUnit.MILLISECONDS.toMinutes(zoneOff);// общее колво минут
		long div=Math.abs(offsetMin-offsetMInFull);
		
		
		return String.format("%+03d:%02d", offsetHour,div);
	}

}
