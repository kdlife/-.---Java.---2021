package TestFirst;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class StringToMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//long startTime=System.nanoTime();// начальное время
String matrix = scanString();
//String matrix ="QLGNAEKIRLRNGEAE";
int sizeMatrix= findSize(matrix);
System.out.println(sizeMatrix);
char[][] table=new char [sizeMatrix][sizeMatrix];
fill(table, matrix);
String word = scanWord();
//String word ="KING";
boolean check= checkWord(matrix, word);
findChar(word,table,check);
//displayExecutionTime(System.nanoTime()-startTime);
	}
	public static String deleteRep(String str) { // удаляем повторяющиеся символы
		StringBuilder xxx=new StringBuilder();
		Set<Character> test=new HashSet<>();
		for (int i=0; i<str.length();i++) {
			int n=test.size();
			test.add(str.charAt(i));
			if (n!=test.size()) {
				xxx.append(str.charAt(i));}
			}
		return xxx.toString();
	}
	
	private static boolean checkWord(String matrixDel, String wordDel) {
		StringBuilder xxx=new StringBuilder();
		Set<Character> test=new HashSet<>();
		for (int i=0; i<matrixDel.length();i++) {
			test.add(matrixDel.charAt(i));
			xxx.append(matrixDel.charAt(i));}
		int n=test.size();
		for (int i=0; i<wordDel.length();i++) {
			test.add(wordDel.charAt(i));
			if (n!=test.size()) return false;}
		return true;
		}
		
	

	private static void  findChar(String word, char[][] table, boolean check) {
		int index=0;
		if (check) {
			while (index!=word.length()){
			for (int i =0; i<table.length;i++) {
			 for (int j =0; j<table[i].length; j++) {
				if (table[i][j]==word.charAt(index)&&index<word.length()) {
					index++;
					if (index==word.length())System.out.print("["+i+","+j+"]");
					else System.out.print("["+i+","+j+"]"+"->");
					i=-1;
					j=-1;
					break;
					}
				}
			if (index==word.length()) break;
			}
		}
			
	}
		else System.out.println("В слове содержатся символы которых нет в матирице");
   }
	

	private static String scanWord() {
		System.out.println("Enter word ");
		Scanner scan =new Scanner(System.in);
		String word = scan.nextLine().toUpperCase();
		return word;
	}

	private static void fill(char[][] table, String matrix) {// заполнение матрицы
		// TODO Auto-generated method stub 
		int index=0;
		for (int i =0; i<table.length;i++) {
			for (int j =0; j<table[i].length; j++) {
				if (index<matrix.length())// сделано специально ,  для работы при исходной строке  не позволяющей полностью заполнить массив.
					// с другой стороны можно добавить проверку  в метод scanString
					//  Math.sqrt(matrix.length()) % 1 == 0 //%	Делит левый операнд на правый операнд и возвращает остаток	B % A даст 0
				table[i][j]=matrix.charAt(index);
				index++;
				
			}
		}
		
	//	Arrays.stream(table).map(Arrays::toString).forEach(System.out::println); // для отладки удобно
	}

	private static int findSize(String str) {// вычисляем min подходящий размер матрицы
		// TODO Auto-generated method stub
		int sizeM=str.length();
		
		return (int) Math.ceil(Math.sqrt(sizeM));
	}

	public static String scanString() {// сканируем  строку 
		System.out.println("Enter String to be converted to matrix");
		Scanner scan =new Scanner(System.in);
		String matrix = scan.nextLine().toUpperCase();
		if (matrix.length()<=3) {
			System.out.println("it is ton possible, the length <4, try again");
			return scanString(); 
				}
		else return matrix;
	}
	private static void displayExecutionTime(long Time) {// метод для отображения времени работы прогррамм
		// TODO Auto-generated method stub
		System.out.println("Execution Time:" + Time + "ns"+"("+TimeUnit.MILLISECONDS.convert(Time, TimeUnit.NANOSECONDS)+"ms)"+"second"+TimeUnit.SECONDS.convert(Time, TimeUnit.NANOSECONDS));// конвертируем в миселек
	}

}
