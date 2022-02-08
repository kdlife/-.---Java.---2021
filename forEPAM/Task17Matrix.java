package forEPAM;

import java.util.Arrays;

public class Task17Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите размер матрицы n*n");
		int n=HelpS.getNum();
		double [][] test=new double[n][n];
		System.out.println("Создана матрица:");
		fill(test);
		int count=0;
		for (int i=0; i<test.length;i++) {
			for(int j=0; j<test.length-i;j++) {
				if(test[i][j]>0)count++;
				}
			}
				
		System.out.println("Положительных чисел" + count);
	}
	private static void fill(double[][] mass) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass.length-i;j++) {
				mass[i][j]=Math.sin((Math.pow(i, 2)-Math.pow(j, 2))/mass.length);
			}
				
			
		}
		Arrays.stream(mass).map(Arrays::toString).forEach(System.out::println);
	}
}
		
		
	


