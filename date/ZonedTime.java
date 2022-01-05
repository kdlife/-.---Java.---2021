package date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ZonedTime {
	
	private ZonedTime() {
		throw new AssertionError("Can not....");
	}
	public static List<String> AllTime(){
	ZonedDateTime test=ZonedDateTime.now();
	Set<String> zone=ZoneId.getAvailableZoneIds();
	ArrayList<String> result=new ArrayList<>();
	DateTimeFormatter form=DateTimeFormatter.ofPattern("yyyy-MMM-dd'T'HH:mm:ss");
	zone.forEach((zones)->{result.add(test.format(form)+" В "+zones+" IS"+test.withZoneSameInstant(ZoneId.of(zones)).format(form));
	});
	
	
	return result;
	}
}
