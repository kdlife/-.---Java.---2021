package firstChapter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;


public class countVowelsAndConsonants {
 private static final Set <Character>  allVowels= new HashSet(Arrays.asList('a','o','u','y','i','e'));
 public static Pair<Integer, Integer> countVC (String str){// создаем пару с 2-мя значениемия
	 str.toLowerCase(); // переводим текст в малений буквы
	 int vowels=0;// гласные
	 int consonants=0;// согласгые
	 for (int i=0;i<str.length();i++) {// перебираем всю строку
		char ch=str.charAt(i);// разбираем каждый символ
		 if(allVowels.contains(ch)) {// сравниваем содержит ли наше множество такой символ ch
			 vowels++; // если содердит то ++
		 }
		 else if('a'<=ch&&ch<='z') consonants++;// если не сожердит и буква ++
		 
	 }
	 return Pair.of(vowels, consonants); //возвращаем пару значений
 }
 // в синтаксите ява 8 
 public static Pair<Long, Long> countVC2(String str){
	 	 str.toLowerCase();
	 long vowels=str.chars()// создаем поток символов
			 .filter(c->allVowels.contains((char)c))// проеверяем на совпадения с гласными
			 .count();// ++
	 long contains=str.chars()
			 .filter(c->!allVowels.contains((char)c))//исключаем гласные
			 .filter(ch->('a'<=ch&&ch<='z'))//  буквы
			 .count();//++
	 
	 
	 return Pair.of(vowels, contains);
 }
 //  еще один вариант
 public static Pair<Long,Long> countVC3(String str){
	 
     Map<Boolean, Long> result = str.chars()
             .mapToObj(c -> (char) c)
             .filter(ch -> (ch >= 'a' && ch <= 'z'))
             .collect(partitioningBy(c -> allVowels.contains(c), counting()));

     return Pair.of(result.get(true), result.get(false));// тут непонимаю
	 
 }
}
