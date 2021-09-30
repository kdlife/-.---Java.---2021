package firstChapter;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class deleteSymbol {
public static String deleteV1(String str, char ch) {
	
	//return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");///*
	/* Обратите внимание, что регулярное выражение обернуто в
	 *  метод Pattern.quoteO. Это необходимо для экранирования 
	 *  специальных символов, таких как <, (,[,{, \, Л, -, =, $, !, |, ], }, ), ?, *, +, . и >. 
	 *  В общих чертах этот метод возвращает строку литерального шаблона
	 *   для заданной строки. 
	 *  
	 * */
	return str.replaceAll((String.valueOf(ch)), "");// и так и так верно но правильнее вверху
}
	public static String deleteV2(String str, char ch) {
		char [] temp=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<temp.length; i++) {
			if(temp[i]!=ch) sb.append(String.valueOf(temp[i]));
				}
	return sb.toString();}
	//  попробуем в java 8
	
	public static String deleteV3(String str, char ch) {
		return str.chars()
				.filter(c->c!=ch)
				.mapToObj(c->String.valueOf((char) c))
				.collect(Collectors.joining());
	}
}
