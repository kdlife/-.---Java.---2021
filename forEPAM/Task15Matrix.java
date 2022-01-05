package forEPAM;

import java.util.Arrays;

public class Task15Matrix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите размер матрицы n*n");
		int n=HelpS.getNum();
		int [][] test=new int[n][n];
		System.out.println("Создана матрица:");
		fill(test);
		
	}
	private static void fill(int[][] mass) {
		// TODO Auto-generated method stub
		for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass.length-i;j++) {
				
				mass[i][j]=i+1;
				
			}
		}
		Arrays.stream(mass).map(Arrays::toString).forEach(System.out::println);
	}

}

