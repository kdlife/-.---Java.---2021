package forEPAM;

import java.util.Arrays;

public class Test5Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("введите размер первого массива");
		int n=HelpS.getNum();
		int [] array1=new int [n];
		HelpS.fillRandomMassiv(array1);
		sortInsert(array1);
	System.out.println(Arrays.toString(array1));
	}

	private static void sortInsert(int[] array1) {
		for(int i =0; i<array1.length;i++) {
			int temp=array1[i];// помещаем в буфер i элмент массива
			int j=i-1;//место вставки
			while (j>=0&&temp>array1[j]) {//сдвигаем пока до J
				array1[j+1]=array1[j];// сдвигаем на 1 все по очереди 
				j--;
			}
			array1[j+1]=temp;// встовляем на пустое мето
		
	

		}
	}
}
