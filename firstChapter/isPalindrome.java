package firstChapter;

import java.util.stream.IntStream;

public class isPalindrome {
public static boolean checkPalindrome(String str) {
	int length=str.length();
	String reversStr="";
	for (int i=0;i<length;i++) {
		reversStr=str.charAt(i)+reversStr;
	}
	return str.equals(reversStr);
}
public static boolean checkPalindrome2(String str) {
	String revStr=new StringBuilder(str).reverse().toString();
	return revStr.equals(str);
}
// попробуем в ява 8 пример из книги

public static boolean checkPalindrome3(String str) {
	return IntStream.range(0, str.length()/2)
			.noneMatch(p->str.charAt(p)!=str.charAt(str.length()-p-1));
}

}
