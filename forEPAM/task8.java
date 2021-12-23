package forEPAM;

import java.util.ArrayList;
import java.util.Scanner;

public class task8 {
	private static final String LS=System.lineSeparator();
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
		 double [] A=new double[n];
		ArrayList<Double> arr=new ArrayList<>();
		
		 for (int i=0;i<A.length; i++) {
		 	 A[i]= Math.round((Math.random()*100)-50);
		 	 System.out.print(A[i]+", ");
		  }
		 System.out.println();
		 double min=Double.MAX_VALUE;
		 for(int i=0;i<A.length; i++) {
			 if(min>A[i]) {
				 min=A[i];
			 }
		 }
		 System.out.println("min"+min);
		 for(int i=0;i<A.length;i++) {
			 if(A[i]!=min) {
				 arr.add(A[i]);
			 }
		 }
		 System.out.println(arr.toString()+LS+"Size " + arr.size());
	}

}
