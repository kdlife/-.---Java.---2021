package date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class HowYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate MyBirthDay=LocalDate.of(1988, 8, 26);
LocalDate nowDate=LocalDate.now();
Long myAge=ChronoUnit.YEARS.between(MyBirthDay, nowDate);
System.out.println("Тебе сейчас "+ myAge+" лет");
Period myAgePerod=Period.between(MyBirthDay, nowDate);
System.out.println("Тебе сейчас "+ myAgePerod.getYears()+" лет"+myAgePerod.getMonths()+" месяцев"+myAgePerod.getDays()+"Day");
	//

System.out.println("Before JDK 8:");
Calendar startDate = Calendar.getInstance();
startDate.set(1977, 10, 2);
Calendar endDate = Calendar.getInstance();
endDate.setTime(new Date());

int yearsc = endDate.get(Calendar.YEAR) - startDate.get(Calendar.YEAR);

if (yearsc > 0) {
    if (startDate.get(Calendar.MONTH) > endDate.get(Calendar.MONTH)
            || (startDate.get(Calendar.MONTH) == endDate.get(Calendar.MONTH)
            && startDate.get(Calendar.DAY_OF_MONTH) > endDate.get(Calendar.DAY_OF_MONTH))) {
        yearsc--;
    }
}

System.out.println(yearsc + "y");
	}

}
