package firstChapter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class deleteRepeatSymbol {

	public static String deleteRep(String str) {// приколько сам написал, но возможно не очень правлино так как сет правктически не используется
		StringBuilder xxx=new StringBuilder();
		Set<Character> test=new HashSet<>();
		for (int i=0; i<str.length();i++) {
			int n=test.size();
			test.add(str.charAt(i));
			if (n!=test.size()) {
				xxx.append(str.charAt(i));
			}
		}
		
		return xxx.toString();
	}
	public static String removeDublicate(String str) {
		char[] chx=str.toCharArray();// 
		StringBuilder sb=new StringBuilder();
		
		for(char ch :chx) {
			if(sb.indexOf(String.valueOf(ch))==-1) {//sb.indexOf метод который возвращает индекс  заданого первого элемента в строке, если его нет то -1
				//String.valueOf(ch) используем  так как стригбилдер не принимает char и этим методом мы делаем из char стринг
				//valueOf(char c) — возвращает строковое представление char аргумента.
				sb.append(ch);
			}
		}
	return sb.toString();
	}
	// теперь новое и не понятноя ява 8
	public static String removeDublicateV2(String str) {
		return Arrays.asList(str.split("")).stream()// создаем поток принимающий массив символов строки стр, разбитых на буквы методом str.split("")
				.distinct() // метод проверяет на дубликаты
				.collect(Collectors.joining());
		
		
	}
}
