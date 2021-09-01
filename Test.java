package firstChapter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Test {
private static final String TEXT="ddddaaaaaaaddsdddd   aaadeff"; // тестовый текст

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("text ----" + TEXT);
long startTime=System.nanoTime();// начальное время
Map <Character, Integer> dublicate=findSeemChar.countDublicateCharacters(TEXT);// создаем Мап вызывая метод для поиска дубликата, передаем в него тетст

displayExecutionTime(System.nanoTime()-startTime);// вызвываем метод для отображения время выплнения
System.out.println(Arrays.toString(dublicate.entrySet().toArray()));//dublicate.entrySet().toArray()) переводим мап в обычный массив //Arrays.toString затем выводим массив методом то стрринш
System.out.println("-----------------------------------------------");
System.out.println("Используя java8");
Map <Character, Long> dub2=findSeemChar.countDublicateCharacters2(TEXT);
System.out.println(Arrays.toString(dub2.entrySet().toArray()));

	
	}

	private static void displayExecutionTime(long Time) {// метод для отображения времени работы прогррамм
		// TODO Auto-generated method stub
		System.out.println("Execution Time:" + Time + "ns"+"("+TimeUnit.MILLISECONDS.convert(Time, TimeUnit.NANOSECONDS)+"ms)"+"second"+TimeUnit.SECONDS.convert(Time, TimeUnit.NANOSECONDS));// конвертируем в миселек
	}

}
