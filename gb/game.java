package gb;
import java.util.Scanner;

public class game {
	 static int numComp;
	 static int numChel;
	 static int count=0;
	 static String result;
	
	public static int  getNum() {
		 System.out.println("введите число 0-9");
		 Scanner scan= new Scanner(System.in);
		 if (scan.hasNextInt() ) {int temp=scan.nextInt(); 
		
		 if(temp>=10) {System.out.println("Вы Ввкли не верно, повторите"); return getNum();}
		
		 else if(temp <=0) 
		
		 {System.out.println("Вы Ввкли не верно, повторите"); return getNum();}
		
		else return temp;
		 }
		 else return getNum();
		
	} 
public static String getResult(int numComp, int numChel) {
	//String temp;
	
	if (numComp>numChel) return "You a Lose число компа больше";
	else return "You a Lose число компа меньше";
	
}
	
	

		public static void main(String[] agrs) { 
			numComp = ((int) (Math.random()*10));
			numChel =getNum();
			
		//	String str;
			System.out.println("вы ввели число ---"+numChel);
			while ((numComp!=numChel)&(count<=5)) {
				result=getResult(numComp, numChel);
			System.out.println(result);
			count++;
			System.out.println("вы сделали попуток" + count);
			numChel =getNum();	}	
						
			System.out.println(" вы выграли число сомпа ---"+ numComp);
			
		}
		
			
			
			
			
			
}
