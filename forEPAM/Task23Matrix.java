package forEPAM;

import java.util.Arrays;
import testClone.Matrices;

public class Task23Matrix {

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
	//	int[][] test2=HelpS.sortColumnSqare(test);// Хороший метод, но будет работать только на квадратной матрице// Можно конечно сделать поворот матрицы , отсортировать и назад но это слишком...
	//	System.out.println("После сортировеи в строке");
	//	Arrays.stream(test2).map(Arrays::toString).forEach(System.out::println);
	//	for(int i=0;i<test.length;i++) {
	//		HelpS.sortbyColumn(test, i);
	//	}
		System.out.println("Сорт:");
		HelpS.sortBuble(test);/// сортировка всей матрицы
		//наверное зря вынес все методы сортировки в спомогательый класс, но кто знает....
		int test2[][]=HelpS.sortBubleOnCollumnUp(test);
		System.out.println("Сорт sortBubleOnCollumnUp:");
		Arrays.stream(test2).map(Arrays::toString).forEach(System.out::println);
		int test3[][]=HelpS.sortBubleOnCollumnDown(test);
		System.out.println("Сорт sortBubleOnCollumnDown:");
		HelpS.printMass(test3);// вынесем печать в отдельный метод)
		int test4[][]=Matrices.cloneArrayOfInt2(test);
		for(int i=0;i<test4.length;i++) {
			HelpS.sortBubleOnStringDown(test4[i]);
		}
		System.out.println("Сорт sortBubleOnStringDown:");
		HelpS.printMass(test4);
		int test5[][]=Matrices.cloneArrayOfInt2(test);
		for(int i=0;i<test5.length;i++) {
			HelpS.sortBubleOnStringUp(test5[i]);
		}
		System.out.println("Сорт sortBubleOnStringUp:");
		HelpS.printMass(test5);
	}

}
