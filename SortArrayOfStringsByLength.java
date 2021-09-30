package firstChapter;

import java.util.Arrays;

public class SortArrayOfStringsByLength {
	public enum Sort {
		ASC,DESC // название не важно просто 2 параматра для прямой и обратной сортировеи
	}

	public static void SortString(String[] args, Sort direct) {//  передаем массив строк и направление сортировки в метод
		if (direct.equals(Sort.ASC)) {// проверям прямая сортировка или нет
			Arrays.sort(args,(String s1, String s2)->Integer.compare(s1.length(),s2.length()));	// сортируем 
			}
		else {
			Arrays.sort(args, (String s1,String s2)->(-1)*Integer.compare(s1.length(),s2.length()));
		}
	}
}
