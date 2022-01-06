package forEPAM;

import java.util.Arrays;

public class Task18Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите размер матрицы n*n");
		int n=HelpS.getNum();
		int [][] test=new int[n][n];
		System.out.println("Создана матрица:");
		HelpS.Fill(test);
		System.out.println("Введите K какой столбец поменять");
		int k=HelpS.getNum();
		System.out.println("Введите P на какой столбец ");
		int p=HelpS.getNum();
		ChangeColum(test, k, p);
		Arrays.stream(test).map(Arrays::toString).forEach(System.out::println);
	}

	private static void ChangeColum(int[][] mass, int k, int p) {
		// TODO Auto-generated method stub
		for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass[i].length;j++) {
				if(j==k) {
					int temp=mass[i][p];
					mass[i][p]=mass[i][k];
					mass[i][k]=temp;
				}
				}
			}
	}

}
