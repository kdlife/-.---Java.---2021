package gbkrest;
import java.util.Scanner;
import java.util.Random;

public class gamekr {
          final char SINGX='X';  
		  final char SING0='0';
		  final char EMPTY= '_';
		  char [][] table; // массив символ
		  Random ram;
		  Scanner scan;
		
		  
		  gamekr ()  {// конструктор класса , не совсем понятно зачем имменно в нем инициализировать  сканнер, таблицы, и рандом. потом поверим
				ram = new Random();
				scan = new Scanner(System.in);
				table =  new char[3][3];
							
			}
		  
		  void game () {
			  iTable();
			  while(true) {
				
				turnHum();
				if (checkWin(SINGX)) {System.out.println("Выграли крестики"); break;}
				if (isFull()) {System.out.println("ничя"); break;}
				turnAI();
				printTable();	
				if (checkWin(SING0)) {System.out.println("Выграли нолики"); break;}
				if (isFull()) {System.out.println("ничя"); break;}	
				}
			System.out.println("Gameower");  
			printTable();	
		  	  }
		  
	
		  
		  private void turnHum() {
			  int x;
			  int y;
			  System.out.println("Введите координаты (0-2) куда хотите поставить Х");
			  do {
				  x =scan.nextInt();
				  y= scan.nextInt();
			  }
			  
			  while(!isEmpty( x, y));
			  table[x][y]=SINGX;
		  }
		  
		  
		  private boolean isEmpty(int x, int y) {// проверяем на свободу ячейки и на правильрость ввода, НЕТ ПРОВЕРКИ НА ТИП(
			if (x>=3||x<0||y>=3||y<0) { System.out.println("Вы ввели не верно"); return false;}
			return table [x][y] == EMPTY;
			
		}

		private void printTable() { // метод для вывода на экран массива
			// TODO Auto-generated method stub
			  for (int i=0; i<3; i++) {
					for (int j=0; j <3; j++ ) {
					System.out.print(table[i][j] + " ");	
					
					}
					System.out.println();
					}
						
					
		}

		private void turnAI() {
			int x;
			  int y;
			  System.out.println("ХОд КОМПА");
			  do {
				  x =ram.nextInt(3);
				  y= ram.nextInt(3);
			  }
			  
			  while(!isEmpty( x, y));
			  table[x][y]=SING0;
			
		}

		

		private boolean isFull() {
			  for (int i=0; i<3; i++) 
					for (int j=0; j <3; j++ ) if(table[i][j]==EMPTY) return false;
					
			return true;
		}

		private boolean checkWin(char dot) {
			for (int i = 0; i < 3; i++)
		        if ((table[i][0] == dot && table[i][1] == dot &&
		                         table[i][2] == dot) ||
		                (table[0][i] == dot && table[1][i] == dot &&
		                                  table[2][i] == dot))
		            return true;
		        if ((table[0][0] == dot && table[1][1] == dot &&
		                  table[2][2] == dot) ||
		                    (table[2][0] == dot && table[1][1] == dot &&
		                      table[0][2] == dot))
		            return true;
		    return false;
		}

		private void iTable() { //  заполняем весь массив  переменной емпу
			// TODO Auto-generated method stub
			for (int i=0; i<3; i++) {
				for (int j=0; j <3; j++ ) {
					table[i][j]=EMPTY;
				}
			}
		}

		
		
		
		
		
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	 new gamekr().game();
		
		
		
		
		
		
		
		
	}

}
