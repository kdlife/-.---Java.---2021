package forEPAM;

import java.util.Arrays;
import java.util.Scanner;
//Даны действительные числа a1,a2,,an . Найти max( a1 + a2n,a2 + a2n−1,,an + an+1)
public class task7 {
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
		System.out.println("Введите число N");
		 int n=getNumber();
		 double [] A=new double[n*2];
		 double[]Afirst=new double[A.length/2];
		 double[]ASecond=new double[A.length/2];
		 for (int i=0;i<A.length; i++) {
		 	 A[i]= Math.round((Math.random()*100)-50);
		 	 System.out.print(A[i]+", ");
		  }
		 System.out.println();
		 for (int i = 0; i<A.length; i++) {
			 if(i<A.length/2) {
				 Afirst[i]=A[i];
			 }
			 else {
				 ASecond[A.length-i-1]=A[i];
			 }
		 }
		 System.out.println(Arrays.toString(Afirst));
		 System.out.println(Arrays.toString(ASecond));
		 double max=Double.MIN_VALUE;
		 for (int i=0;i<Afirst.length;i++) {
			 if((Afirst[i]+ASecond[i])>max) {
				 max=Afirst[i]+ASecond[i];
			 }
		 }
		 System.out.println("Max "+ max);
	}

}
