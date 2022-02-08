package date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class AllTimeZone {
		
	public enum OffsetType {
		GMT, UTC
	}
	private AllTimeZone() {
		throw new AssertionError(" Can not be ....");
	}
	
	public static List<String> allZone1(OffsetType type){
		List<String> timeZone=new ArrayList<>();// создаем лист 
		Set<String> zoneId=ZoneId.getAvailableZoneIds();//создаем множество и записываем туда все ZoneId
		LocalDateTime test=LocalDateTime.now();
		
		zoneId.forEach((zone)->{
			timeZone.add("(("+type+test.atZone(ZoneId.of(zone)).getOffset().getId().replace("Z", "+00:00")+"))"+zone);
		});
		return timeZone;
	}
	//  до ява 8 
	public static List<String> fetchTimeZones7(OffsetType type) {

        List<String> timezones = new ArrayList<>();
        String[] zoneIds = TimeZone.getAvailableIDs();

        long timestamp = new Date().getTime();

        for (String zoneId : zoneIds) {
            TimeZone curTimeZone = TimeZone.getTimeZone(zoneId);
            curTimeZone.useDaylightTime();
            String offset = formatOffset(curTimeZone.getOffset(timestamp));

            timezones.add("(" + type + offset + ") " + zoneId);
        }

        return timezones;
    }

    public static String formatOffset(int offset) {

        if (offset == 0) {
            return "+00:00";
        }

        long offsetInHours = TimeUnit.MILLISECONDS.toHours(offset);
        long offsetInMinutesFromHours = TimeUnit.HOURS.toMinutes(offsetInHours);
        long offsetInMinutes = TimeUnit.MILLISECONDS.toMinutes(offset);

        offsetInMinutes = Math.abs(offsetInMinutesFromHours - offsetInMinutes);

        return String.format("%+03d:%02d", offsetInHours, offsetInMinutes);
    }
	
	
	
}
