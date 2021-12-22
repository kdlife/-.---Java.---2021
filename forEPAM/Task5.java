package forEPAM;

import java.util.Scanner;

public class Task5 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите число N");
		 int n=getNumber();
		 int [] A=new int[n];
		 for (int i=0;i<A.length; i++) {
		 	 A[i]=(int) Math.round((Math.random()*100)-50);
		 	 System.out.print(A[i]+", ");
		  }
		 System.out.println();
		 for (int i=0;i<A.length; i++) {
		 	 if(i<A[i]) {
		 	 System.out.print(A[i]+", ");}
		  }
	}

}
