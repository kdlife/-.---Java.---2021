package date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Calendar;

public class CyclePeriod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate start=LocalDate.of(2020, 12, 1);
		LocalDate end=LocalDate.of(2020, 12, 30);
		for(LocalDate date=start; date.isBefore(end);date=date.plusDays(1)) {
			System.out.println(date);
		}
		start.datesUntil(end, Period.ofDays(1)).forEach(System.out::println);
	
		System.out.println("Before JDK 8");

        Calendar calendar = Calendar.getInstance();

        calendar.set(2019, 1, 1);
        Date startDate = calendar.getTime();

        calendar.set(2019, 1, 21);
        Date endDate = calendar.getTime();

        Date day = startDate;
        while (day.before(endDate)) {

            // do something with this day
            System.out.println(day);

            calendar.setTime(day);
            calendar.add(Calendar.DATE, 1);
            day = calendar.getTime();
        }
	
	}
	

}
