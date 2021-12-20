package date;

import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class dateInstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instant test=Instant.now();// текущее время машинное
System.out.println(test);
OffsetDateTime now=OffsetDateTime.now(ZoneOffset.UTC);// The same
System.out.println(now);
Clock clock=Clock.systemUTC();
System.out.println(clock.toString());
	}

}
