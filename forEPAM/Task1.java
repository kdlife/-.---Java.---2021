package forEPAM;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите число K");
int k=getNumber();
System.out.println("Введите число N");
int n=getNumber();
int [] A=new int[n];
 for (int i=0;i<A.length; i++) {
	 A[i]=(int) Math.round((Math.random()*100));
	 System.out.print(A[i]+", ");
 }
 int sum=0;
 for (int i=0; i<A.length; i++) {
	 if(A[i]%k==0) {
		 sum=sum+A[i];
	 }
 }
System.out.println("Cумма чисел кратных K" + sum);
	}

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

}
