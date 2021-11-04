package SecondChapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CheckNull {
	public static List<Integer> evenList(List<Integer> tempList){
	if(tempList==null) {
		return Collections.EMPTY_LIST;
	}
		List<Integer>evens= new ArrayList<>();
		for (Integer temp: tempList) {
			if(temp!=null&&temp%2==0) {
				evens.add(temp);
			}
		}
		
		return evens;
	}
	public static List<Integer> evenList2(List<Integer> tempList){
		if(Objects.isNull(tempList)) {// тоже самое только испольованны встроенные методы проверки на null
			return Collections.EMPTY_LIST;
		}
			List<Integer>evens= new ArrayList<>();
			for (Integer temp: evens) {
				if(Objects.nonNull(temp)&&temp%2==0) {
					evens.add(temp);
				}
			}
			
			return evens;
		}
	 public static int evenList3(List<Integer>tempList){
		 if(Objects.isNull(tempList)) { throw new IllegalArgumentException("List can not be null");
			 		 }
		 return tempList.stream()
				 .filter(i->i!=null)
				 .mapToInt(Integer::intValue).sum();// тут еще надо подучить
	 }
	 public static boolean haveNull(List<Integer>tempList) {
		 if (tempList==null) {return false;}
		 return tempList.stream()
				 .anyMatch(Objects::isNull);
	 }
}
