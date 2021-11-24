package firstChapter;

public class onlyDigits {
public static boolean onlyDigit(String str) {
	for(int i=0; i<str.length(); i++) {// перебираем всю строку посимвольно
		if (!Character.isDigit(str.charAt(i))) {//  провериям число или нет
		return false;}// если есть  буквы то
	}
	
	return true;// если  нету букв
}
// напишем для непонятной ява 8
public static boolean onlyDigit2(String str) {
	return !str.chars()
			.anyMatch(n->!Character.isDigit(n));//Метод anyMatch() вернет true в том случае, если в Stream-e есть хоть один элемент, что удовлетворяет условию
}
}
