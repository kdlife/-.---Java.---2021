package forEPAM;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
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
		 int sum=0;
		 ArrayList<Integer> arr=new ArrayList<Integer>();// используем лист, что бы не вычислять  размер массива
		
		 for (int i=2; i<A.length;i++) {//  находим простые индексы
				boolean stop=true;
				for (int j=2; j<i; j++) {
					if (i%j==0) {stop=false;
					
					break;}}
				if(stop) {arr.add(A[i]);}
				
				}
		  for(int i =0; i<arr.size();i++) {
			  sum=sum+arr.get(i);
		  }
		  
		  System.out.println(arr.toString());
		  System.out.println("сумма чисел с  простыми индексами "+ sum);
	}
}
