package firstChapter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class maxOccurenceCharacter {
	
	public static Pair<Character, Integer> maxCountCharacter(String str){ // используем метот паир от зачаси с гласными
		Map<Character,Integer>result=new HashMap<>();
		for (int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			
			if(!Character.isWhitespace(ch))//удаляем пробелы
				result.compute(ch, (a,b)->(b==null)?1:++b);// 
			}
	int maxOcc=Collections.max(result.values());// встроенный метод находит максимальное значение в коллекци
	char maxCh=Character.MIN_VALUE;
	for (Entry<Character, Integer> entry:result.entrySet()) {// перебор хашмам
		if (entry.getValue()==maxOcc) {maxCh=entry.getKey();}// находим нашего значение и запиминаем ключ
	}
	return Pair.of(maxCh, maxOcc);
	}
// попробуем тоже самое в ява 8
	public static Pair<Character,Long> maxCountCharacter2(String str){
		return str.chars()
				.filter(c->Character.isWhitespace(c)==false)
				.mapToObj(c->(char)c)
				.collect(groupingBy(c->c,counting()))
				.entrySet()
				.stream()
				.max(comparingByValue())
				.map(p->Pair.of(p.getKey(),p.getValue()))
				.orElse(Pair.of(Character.MIN_VALUE,-1L));
	}
	
	
}
