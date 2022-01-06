package date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnixDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long unix=1695580000;
Date dateUnix1=new Date(unix*1000L);// unix в секундах, date в милисекунах
System.out.println(dateUnix1);
Date dateUnix2=new Date(TimeUnit.MILLISECONDS.convert(unix, TimeUnit.SECONDS));
System.out.println(dateUnix2);

// используя новые java8
Instant inst=Instant.ofEpochSecond(unix);
System.out.println(inst);
Date date= Date.from(inst);
System.out.println(date);
LocalDateTime date1=LocalDateTime.ofInstant(inst, ZoneId.of("Europe/Minsk"));
System.out.println(date1);
ZonedDateTime date2=ZonedDateTime.ofInstant(inst, ZoneId.of("Europe/Minsk"));
System.out.println(date2);
	}

}
