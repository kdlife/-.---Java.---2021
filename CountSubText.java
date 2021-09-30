package firstChapter;

import java.util.regex.Pattern;

public class CountSubText {
public static int CountText(String str1, String str2) {
	int count =0;
	int position=0;
	int length= str1.length();
	for (int i =position; i <length; i++) {
		if (str1.indexOf(str2, position)!=-1) {// если есть совпадение подстраки
			count++;
			position=i+str2.length()-1;// все включения даже пересикаюиесся
		}
	}
	
	return count;
}
public static int CountText2(String str1, String str2) {
	int count =0;
	int position=0;
	int length= str1.length();
	for (int i =position; i <length; i++) {
		if (str1.indexOf(str2, position)!=-1) {
			count++;
			position=position+str2.length();// тут шаг на длинну найденой подстроки
		}
	}
	
	return count;
}
// добавим тоже самое через while  пример из книши
public static int CountText3(String str1, String str2) {
int position = 0;
int count = 0;
int n = str2.length();

while ((position = str1.indexOf(str2, position)) != -1) {
    position = position + n;
    count++;
}

return count;
}
//добавим тоже самое через  String.split пример из книши
public static int CountText4(String str1, String str2) {
	return str1.split(Pattern.quote(str2), -1).length - 1;//В качестве альтернативы этот вариант решения может использовать метод string.split о. В сущности, этот вариант решения разбивает заданную строку, используя заданную подстроку в качестве разделителя. Длина результирующего массива string [ ] должна быть равна числу ожидаемых появлений: 
}
}