package forEPAM;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
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
		int  n=getNumber();
		double [] A=new double[n];
		 for (int i=0;i<A.length; i++) {
			 A[i]= Math.round((Math.random()*100)-50);
			 System.out.print(A[i]+", ");
		 }
		 int indexMin=0;
		 int indexMax=0;
		 double min=A[0];
		 double max=A[0];
		 for (int i=0; i <A.length; i++) {
			 
			if(min>A[i]) {
				 min=A[i];
				 indexMin=i;
			 }
			 
			if(max<A[i]) {
				max=A[i];
				 indexMax=i;
			 }
		 }
		 double temp;
		 temp=A[indexMin];
		 A[indexMin]=A[indexMax];
		 A[indexMax]=temp;
		 System.out.println();
		 System.out.println(Arrays.toString(A));
	}

}
