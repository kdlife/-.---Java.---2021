package firstChapter;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class joinString {
 public static String joinStringV1(char delimetr,String...args ) {
	 StringBuilder join= new StringBuilder();
	 int i=0;// создаем переменную для того чтобы к послежней строке не приклеивать разделитель
	 for ( i = 0; i<args.length-1;i++) {
		 join.append(args[i]).append(delimetr);// соединяем строки
	 }
	 join.append(args[i]);//добавляем последюю строку
	 return join.toString();//  возварщаем строку
 }
  public static String joinStringV2(char delimetr, String...args) {
	  StringJoiner join=new StringJoiner(String.valueOf(delimetr));
	  for(String a:args) {
		  join.add(a);
	  }
	  return join.toString();
  }
 public static String joinStringV4(char delimetr,String...args) { // испольщуя ява 8
	 return Arrays.stream(args, 0, args.length)
			 .collect(Collectors.joining(String.valueOf(delimetr)));
 }
}
