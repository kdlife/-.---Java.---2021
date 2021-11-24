package firstChapter;

import java.util.Arrays;

public class IsAnagram {
public static boolean anagramV1(String str1, String str2) {
	str1.toLowerCase();
	str2.toCharArray();
	str1.replaceAll("\\s", "");
	str2.replaceAll("\\s", "");
	if (str1.length()!=str2.length()) {return false;}
	char []charStr1=str1.toCharArray();
	char[] charStr2=str2.toCharArray();
	Arrays.sort(charStr1);
	Arrays.sort(charStr2);
	return Arrays.equals(charStr1, charStr2);
}
}
