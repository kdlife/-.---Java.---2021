package firstChapter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Test {
private static final String TEXT="d d ! q q wwe3e9"; // тестовый текст
private static final String TEXT2="Dima"; // тестовый текст
private static final String TEXT3="VANAYA"; // тестовый текст
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("text ----" + TEXT);
long startTime=System.nanoTime();// начальное время
Map <Character, Integer> dublicate=findSeemChar.countDublicateCharacters(TEXT);// создаем Мап вызывая метод для поиска дубликата, передаем в него тетст


System.out.println(Arrays.toString(dublicate.entrySet().toArray()));//dublicate.entrySet().toArray()) переводим мап в обычный массив //Arrays.toString затем выводим массив методом то стрринш
System.out.println("-----------------------------------------------");
System.out.println("Используя java8");
Map <Character, Long> dub2=findSeemChar.countDublicateCharacters2(TEXT);
System.out.println(Arrays.toString(dub2.entrySet().toArray()));
char testch=FirstCharacter.nonRepeatFirstCharacter(TEXT);
System.out.println("первый не повторяющийся символ " + testch);
displayExecutionTime(System.nanoTime()-startTime);// вызвываем метод для отображения время выплнения
char testch2=FirstCharacter.nonRepeat2(TEXT);
System.out.println("Второй метод  более простой и понятный с использованием фор");
System.out.println("первый не повторяющийся символ " + testch2);
char testch3=FirstCharacter.nonRepMap(TEXT);
System.out.println("Второй метод  более простой и понятный с использованием MAP");
System.out.println("первый не повторяющийся символ " + testch3);
displayExecutionTime(System.nanoTime()-startTime);// вызвываем метод для отображения время выплнения
char testch4=FirstCharacter.nonRepMap2(TEXT);
System.out.println("3 метод   с  ява 8 использованием MAP");
System.out.println("первый не повторяющийся символ " + testch4);
displayExecutionTime(System.nanoTime()-startTime);
boolean noDig=onlyDigits.onlyDigit(TEXT);
System.out.println("проверяем меттод на проверку цифр" + noDig);
displayExecutionTime(System.nanoTime()-startTime);
boolean noDig2=onlyDigits.onlyDigit2(TEXT);
System.out.println("проверяем меттод на проверку цифр" + noDig2);
displayExecutionTime(System.nanoTime()-startTime);	
Pair pair1=countVowelsAndConsonants.countVC(TEXT);// создаем  обьект пару, и передаем в метод наш текст
System.out.println("Шластные"+pair1.vowels);
System.out.println("Согласные"+pair1.consonants);
displayExecutionTime(System.nanoTime()-startTime);
Pair pair2=countVowelsAndConsonants.countVC2(TEXT);// создаем  обьект пару, и передаем в метод наш текст
System.out.println("Шластные2"+pair2.vowels);
System.out.println("Согласные2"+pair2.consonants);
displayExecutionTime(System.nanoTime()-startTime);	
Pair pair3=countVowelsAndConsonants.countVC3(TEXT);// создаем  обьект пару, и передаем в метод наш текст
System.out.println("Шластные3  "+pair3.vowels);
System.out.println("Согласные3  "+pair3.consonants);
displayExecutionTime(System.nanoTime()-startTime);	
int countSymbol=countCharacter.countCh(TEXT, 'd');
System.out.println(TEXT + "Содержит символов d" + countSymbol);
displayExecutionTime(System.nanoTime()-startTime);	
int countSymbol2=countCharacter.countCh2(TEXT, 'd');
System.out.println(TEXT + "Содержит символов через другой метод d " + countSymbol2);
displayExecutionTime(System.nanoTime()-startTime);		
long countSymbol3=countCharacter.countCh3(TEXT, 'd');
System.out.println(TEXT + "Содержит символов через другой2 метод d " + countSymbol3);
displayExecutionTime(System.nanoTime()-startTime);	
String test=deleteSpace.deleteSp(TEXT);
System.out.println(TEXT+" удаляем пробеллы испльзуя замену \\s  "+test);
String joins=joinString.joinStringV1('/', TEXT,TEXT2,TEXT3);
System.out.println("Соедтяем строки"  +joins);
String joins2=joinString.joinStringV2('/', TEXT,TEXT2,TEXT3);
System.out.println("Соедтяем строки"  +joins2);
String join3=String.join("//", TEXT,TEXT2,TEXT3);//  как по мне самый удобный способ соединять строки
System.out.println("Соедтяем строки"  +join3);



	}

	private static void displayExecutionTime(long Time) {// метод для отображения времени работы прогррамм
		// TODO Auto-generated method stub
		System.out.println("Execution Time:" + Time + "ns"+"("+TimeUnit.MILLISECONDS.convert(Time, TimeUnit.NANOSECONDS)+"ms)"+"second"+TimeUnit.SECONDS.convert(Time, TimeUnit.NANOSECONDS));// конвертируем в миселек
	}

}
