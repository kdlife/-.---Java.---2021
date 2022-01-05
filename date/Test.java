package date;

import java.util.Collections;
import java.util.List;

import date.AllTimeZone.OffsetType;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>test=AllTimeZone.allZone1(OffsetType.UTC);
Collections.sort(test);
//test.forEach(System.out::println);

List<String>test2=AllTimeZone.fetchTimeZones7(OffsetType.GMT);
Collections.sort(test2);
//test2.forEach(System.out::println);
System.out.println("Выводим время с часовым поясом");
List<String> test3=ZonedTime.AllTime();
Collections.sort(test3);
test3.forEach(System.out::println);

	}

}
