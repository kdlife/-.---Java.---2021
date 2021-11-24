package firstChapter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstCharacter {// Будем писать класс для поиска первого не повторяющего символа в строке

	private static final int MAX_CODE=256;//  все символы латинского алфавита 
	
	public static char nonRepeatFirstCharacter (String str) {
	int [] flag= new int [MAX_CODE];// создаем массив ИНт длинной макс коде
	 for(int i =0; i<flag.length; i++) {// проходим все значения  массива
		 flag[i]=-30;//   заполняем массив значением -30
			 
	 }
	 for  (int i=0; i<str.length();i++) {// перебераем все символы в строке
		 char ch = str.charAt(i);//  charAt() возвращает символ из массива строки по указанному индексу.
		
		 if (flag[ch]==-30) {flag[ch]=i;} //System.out.println("сработал код if (flag[ch]==-1)" + flag[ch] );}
		// условие предпологает  что значение символа по таблице аиси в случае первого совпадения  запишет в массив позицию в строке(i)
		 // так как изналачно массив звполнен и совпадает со всеми симвалами то пропустить не получится и первый раз в любом случае хначени массива примет (i)
		 //в случае повторного попадания симвала он уже не будет == -30,  и поэтому в ячейку запишется значение ниже
		 //в итоге цикла мы плдучим символы которых нету -30, символы которые повтаряются -200,  символы кторые встречаются 1 раз будут иметь положительное значение в массиве флаг
		 
		 else {flag[ch]=-200;}//System.out.println("сработал код else flag[ch]==-2" + flag[ch] );} //  присваиваем любое отрийатльное значение меньше -1, для того что бы первое услвие не выполнялось, а так же последуеющее flag[i]>=0
		 //System.out.println(flag[ch]);
		 	 }
	// for ( int i:flag) { System.out.println("flag = "+i);}
	int position =Integer.MAX_VALUE;
	
	for (int i =0; i<MAX_CODE;i++) {
		if (flag[i]>=0) { position=Math.min(position, flag[i]);}// ноходим минимальное значение в массиве, оно же является минимальной позицией  не повторяющего символа
		
	}
	//System.out.println("позиция "+ position);
	return position==Integer.MAX_VALUE?Character.MIN_VALUE:str.charAt(position);
	}
	// напищем другой вариант рещения данной задачи и используя обыный цикл и счетчик
	public static char nonRepeat2(String str) {
		
		for (int i = 0; i<str.length(); i++) {// проходим все символы
			char ch=str.charAt(i);
			int count=0;
			for (int j=0;j<str.length();j++) {// второй раз проходим все симвлы
				if(ch==str.charAt(j)&&i!=j) {// если совпадают то счетчик вверх
					count++;
					break;
				}
				} 
			if (count==0) {return ch;}
		}
		
		
		return Character.MIN_VALUE; 
	}
	// попробуем через map и .compute	
	public static char nonRepMap(String str) {
	
	Map<Character, Integer> chars = new LinkedHashMap<>();//  упорядоченный 
	
	for (int i=0; i<str.length();i++) {//перебераем символы	
		char ch = str.charAt(i);//переводим в чар
		chars.compute(ch,(k,v)->(v==null)?1:++v);// ВАЖНО именно ++v , а не v++ // делаем ремар по ключу Ch ,если  нет то 1 иначе ++
	}
	
	for (Map.Entry<Character, Integer> entry:chars.entrySet()) {// перебериваем все ключи
		if(entry.getValue()==1) {return entry.getKey();} //если значение ключа 1 
		}
		return Character.MIN_VALUE;	
	
	}
	// теперь через мар и java 8 
	public static char nonRepMap2(String str) {
		Map <Integer, Long> result =str.chars()
				.mapToObj(c->c)
				.collect(Collectors.groupingBy(Function.identity(),// в ява 8 метотд колллект, Function.identity() тоже самое что и c->c
						LinkedHashMap::new, Collectors.counting())); //Метод Collectors.counting применяется в Collectors.groupingBy() для вычисления количества элементов в каждой группе:
		//LinkedHashMap::new Мы создаем ссылку на конструктор с помощью LinkedHashMap::new. Компилятор автоматически выбирает подходящий конструктор
		return  (char)(int)result.entrySet().stream()// создает поток  
				.filter(e->e.getValue()==1L)// равно  1(L это логн)
				.findFirst()//Метод findFirst() возвращает первый элемент по порядку из Stream-a, в виде обертки Optional.
				.map(Map.Entry::getKey)// возвращает ключ
				.orElse(Integer.valueOf(Character.MIN_VALUE));
				
	}
			}
	
	

