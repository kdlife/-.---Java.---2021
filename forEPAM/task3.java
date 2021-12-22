package forEPAM;

import java.util.Scanner;

public class task3 {
	private static int getNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("введите число");
		int temp;
		if(scan.hasNextInt()) {
		temp=scan.nextInt();
		return temp;}
		else {
			System.out.println("вы ввели не целое число");
			return getNumber();
		}
	}
 public static void main(String []args) {
	 System.out.println("Введите число N");
	 int n=getNumber();
	 int [] A=new int[n];
	 int countZero=0;
	 int countPossitive=0;
	 int countNegative=0;
	  for (int i=0;i<A.length; i++) {
	 	 A[i]=(int) Math.round((Math.random()*100)-50);
	 	 System.out.print(A[i]+", ");
	  }
	  for(int i=0; i<A.length;i++) {
		  if(A[i]==0) {
			  countZero++;
		  }
		  if(A[i]>0) {
			  countPossitive++;
		  }
		  if(A[i]<0) {
			  countNegative++;
		  }
	  }
	  System.out.println();
	  System.out.println("Zero count :"+ countZero);
	  System.out.println("Possitive count :"+ countPossitive);
	  System.out.println("Negative count :"+ countNegative);
 }
}
