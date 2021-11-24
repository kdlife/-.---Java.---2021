package firstChapter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class findSeemChar {// класс для поиска одинаковых симвлов
	
	private findSeemChar() {//  приватный конструктор, для перехвата исключений  ХЗ но непонятно когда оно может вылезти
        throw new AssertionError("Cannot be instantiated");// просто сообщение обо ошибке
    }

	public static Map<Character, Integer> countDublicateCharacters(String str){ // создаем метод принимабщий строку и переводим ее в мап
		
		if (str == null || str.isBlank()) {// если пустая строка
            // or throw IllegalArgumentException
            return Collections.emptyMap();// возвазаем пустую карту
        }
		
		Map<Character,Integer> result=new HashMap<>(); // создаем обьект hashmap c названием результ
		//for (char ch:str.toCharArray()) {char ch =str.charAt();}
		for (int i = 0; i<str.length(); i++) {// делаем перебор всех симвлов строки 
			char ch =str.charAt(i); // создаем переменную ch  и присваиваем ей i ое занчение из строки
			result.compute(ch,(a,b)->(b==null)?1:++b);// .compute делает ремап  если при добовлении ch  b =0 то 1, иначе увеличиваем на 1
			}
		return result;
	}
	
	/////////////////////попробум  чделать тоже с java-8(идея не моя , примеры из книги)
		public static Map<Character, Long> countDublicateCharacters2(String str){
			Map <Character, Long> result=str.chars() //  представляет строку в виде кодов инт
					.mapToObj(c->(char) c)// переводит числовое значение в символьное
					.collect(Collectors.groupingBy(c->c,Collectors.counting()));//групирует и считает колво
			return result;
			
			
		}
	
	}
