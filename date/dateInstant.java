package date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class dateInstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instant test=Instant.now();// текущее время машинное
System.out.println(test);
OffsetDateTime now=OffsetDateTime.now(ZoneOffset.UTC);// The same
System.out.println(now);
Clock clock=Clock.systemUTC();//  not working
System.out.println(clock.toString());
Instant testParse=Instant.parse("2021-12-20T09:47:35.663603700Z");
System.out.println(testParse);
Instant testplus=Instant.now().plus(10, ChronoUnit.HOURS);
System.out.println(testplus);
boolean before = testplus.isBefore(test);
System.out.println(before);
boolean after =testplus.isAfter(test);
System.out.println(after);
Long different=testplus.until(test, ChronoUnit.HOURS);
System.out.println(different);
LocalDateTime LDT=LocalDateTime.ofInstant(test, ZoneOffset.UTC);// конверьируем в LocalDateTime
System.out.println(LDT);
Instant LDTInstant=LocalDateTime.now().toInstant(ZoneOffset.UTC);//конверьируем в Instatn
System.out.println(LDTInstant);
ZonedDateTime ZDT=ZonedDateTime.ofInstant(test, ZoneOffset.UTC);
ZonedDateTime ZDT2=test.atZone(ZoneId.of("Europe/Paris"));
System.out.println(ZDT);
System.out.println(ZDT2);
Instant ZDTInstant = LocalDateTime.now().atZone(ZoneId.of("Europe/Paris")).toInstant();
System.out.println(ZDTInstant);
	}

}
