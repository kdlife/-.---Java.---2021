package forEPAM;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10 {
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
		 	 A[i]= ((int)(Math.random()*10));
		 	 System.out.print(A[i]+", ");
		  }
		 System.out.println();
		 for( int i =2; i<A.length;i++) {
			 if (i%2==0) {
				 A[i]=0;
			 }
			
			
		 }
		 System.out.println(Arrays.toString(A));
		 int temp;// любое 
	        int count = 0;// индекс последнего элемнета не 0
	        for (int i = 0; i < A.length; i++) {
	            if (A[i] != 0) {
	                temp = A[count];
	                A[count] = A[i];
	                A[i] = temp;
	                count = count + 1;
	            }
	        }
	        System.out.println(Arrays.toString(A));
		int []a2= TrimMassiv(A);
	
	System.out.println(Arrays.toString(a2));
	}


	private static int[] TrimMassiv(int[] a) {
		int count = 0;
		for(int i =0;i<a.length;i++) {
			if(a[i]!=0)count++;
		}
		int []a1=new int[count];
		System.arraycopy(a, 0, a1, 0, count);
	// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a1));
	return a1;
			
	}


	
	

}
