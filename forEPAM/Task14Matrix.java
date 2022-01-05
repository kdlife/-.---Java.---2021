package forEPAM;

import java.util.Arrays;

public class Task14Matrix {

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
			for(int j=0; j<mass[i].length;j++) {
				if(i%2==0) { 
					if (i<1) {mass[i][j]=i+j+1;}
				else {mass[i][j]=mass[0][j];}
				}
				else {mass[i][j]=mass.length-j;}
				}
			}
		Arrays.stream(mass).map(Arrays::toString).forEach(System.out::println);
	}

}
