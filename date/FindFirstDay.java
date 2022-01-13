package date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
//import java.time.temporal.TemporalUnit;

public class FindFirstDay implements TemporalAdjuster {
		public static LocalDate findDay(LocalDate date, int day) {
			Period period=Period.ofDays(day);
			TemporalAdjuster ta=p->p.plus(period);
			LocalDate endDate=date.with(ta);
			return endDate;
			
		}
		@Override
		public Temporal adjustInto(Temporal temporal) {
			DayOfWeek dayOftheWeek=DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
			if(dayOftheWeek==DayOfWeek.SATURDAY) {  // если сейчас суббота то возварзаем субботу
				return temporal;
			}
			if (dayOftheWeek==DayOfWeek.SUNDAY) {// если сейчас восресенье то следующая суббота через 6 дней
				return temporal.plus(6, ChronoUnit.DAYS);
			}
			return temporal.plus(6-dayOftheWeek.getValue(), ChronoUnit.DAYS);// иначе6- значение для недели
		}
}
