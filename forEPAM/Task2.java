package forEPAM;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	

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
		System.out.println("Введите число Z ");
		int Z=getNumber();
		System.out.println("Введите число n, размер последовательноти");
		int n=getNumber();
		int count=0;
		int [] massiv= new int[n];
		for (int i=0;i<massiv.length;i++) {
			massiv[i]=i;
			System.out.print(massiv[i]+",");
		}
		System.out.println();
		for (int i=0; i<massiv.length;i++) {
			if(Z<massiv[i]) {
				massiv[i]=Z;
				count++;
			}
		}
		System.out.println("Произведено замен "+ count);
		System.out.println(Arrays.toString(massiv));
		

	}

}
