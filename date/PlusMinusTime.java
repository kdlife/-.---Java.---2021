package date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PlusMinusTime {
	public static void main (String[]args) {
LocalDateTime test=LocalDateTime.now();
LocalDateTime testPlus=test.plusMinutes(20);
Instant testInst=Instant.now();
Instant testInstPlus=testInst.plus(10, ChronoUnit.HOURS);
Instant testInstMinus=testInst.minus(10, ChronoUnit.HOURS);
System.out.println("Now date"+ test+"Plus 20 min"+testPlus);
System.out.println("instant now "+ testInst+ "+10Hous "+ testInstPlus+" Min 10 hours"+ testInstMinus);
	}
}
