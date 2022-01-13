package forEPAM;

import java.util.Arrays;

public class Task22Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите размер матрицы n*k");
		System.out.println("Введите размер матрицы n");
		int n=HelpS.getNum();
		System.out.println("Введите размер матрицы k");
		int k=HelpS.getNum();
		int [][] test=new int[n][k];
		System.out.println("Создана матрица:");
		HelpS.Fill(test);
		for(int i=0;i<test.length;i++) {
			Arrays.sort(test[i]);
		}
		System.out.println("После сортировеи в строке");
		Arrays.stream(test).map(Arrays::toString).forEach(System.out::println);
	}

}
