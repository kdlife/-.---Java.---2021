package firstChapter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import firstChapter.SortArrayOfStringsByLength.Sort;

public class Test {
private static final String TEXT="dd ! q q  w    e      e   e  e  e3e9"; // тестовый текст
private static final String TEXT2="Dimaddfa"; // тестовый текст
private static final String TEXT3="VANAYA"; 
private static final String TEXT4="ada"; // тестовый текст
private static final String TEXT5="111111";
private static final String TEXT6="11";
private static final String TEXT7="daad";
private static final String TEXT8="adda";
public static String[] masText= {"Dima","Vasha","Igor", "Andreu","Tolic","Paha"};
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
rekurs.rekursPrint(TEXT3);
System.out.println("-----------------------");
Set <String> test2=rekurs.rekursSet(TEXT3);
System.out.println("-----------------------");
System.out.print(test2);
displayExecutionTime(System.nanoTime()-startTime);	

boolean checkPalindrome=isPalindrome.checkPalindrome(TEXT4);
System.out.println("Проверяем на палиндром"+checkPalindrome);
boolean checkPalindrome2=isPalindrome.checkPalindrome2(TEXT3);
System.out.println("Проверяем на палиндром"+checkPalindrome2);
boolean checkPalindrome3=isPalindrome.checkPalindrome3(TEXT4);
System.out.println("Проверяем на палиндром"+checkPalindrome3);
String deleteRep=deleteRepeatSymbol.deleteRep(TEXT);
System.out.println("Пробуем удалить повторяющиеся символы в строке через сет"+deleteRep);
String deleteRep2=deleteRepeatSymbol.removeDublicate(TEXT);
System.out.println("Пробуем удалить повторяющиеся символы в строке через сет"+deleteRep2);
String deleteRep3=deleteRepeatSymbol.removeDublicateV2(TEXT);
System.out.println("Пробуем удалить повторяющиеся символы в строке через сет"+deleteRep3);
displayExecutionTime(System.nanoTime()-startTime);	
String deleteChar=deleteSymbol.deleteV1(TEXT, 'd');
System.out.println("Удаляем заданый символ из  строки" + deleteChar);
String deleteChar2=deleteSymbol.deleteV2(TEXT, 'd');
System.out.println("Удаляем заданый символ из  строки" + deleteChar2);
displayExecutionTime(System.nanoTime()-startTime);
String deleteChar3=deleteSymbol.deleteV3(TEXT, 'd');
System.out.println("Удаляем заданый символ из  строки" + deleteChar3);
Pair count1=maxOccurenceCharacter.maxCountCharacter(TEXT);
System.out.println(count1.consonants +"     " +count1.vowels );
System.out.println("Исходный массисв строк"+Arrays.toString(masText));
SortArrayOfStringsByLength.SortString(masText, Sort.ASC);
System.out.println("после сортировки "+ Arrays.toString(masText));
System.out.println("проверяем есть ли в строке подсстрока" + SubText.SubTextCheck(TEXT2, TEXT3));
int counttext=CountSubText.CountText(TEXT5, TEXT6);
System.out.println("подсчет колва совпадений в тексте все включения"+counttext);
int counttext2=CountSubText.CountText2(TEXT5, TEXT6);
System.out.println("подсчет колва совпадений в тексте"+counttext2);	
int counttext3=CountSubText.CountText3(TEXT5, TEXT6);
System.out.println("подсчет колва совпадений в тексте"+counttext3);		
System.out.println("проверка на аттаграмму"+IsAnagram.anagramV1(TEXT7, TEXT8));		
	}

	private static void displayExecutionTime(long Time) {// метод для отображения времени работы прогррамм
		// TODO Auto-generated method stub
		System.out.println("Execution Time:" + Time + "ns"+"("+TimeUnit.MILLISECONDS.convert(Time, TimeUnit.NANOSECONDS)+"ms)"+"second"+TimeUnit.SECONDS.convert(Time, TimeUnit.NANOSECONDS));// конвертируем в миселек
	}

}
