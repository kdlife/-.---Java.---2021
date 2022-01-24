package forEPAM;

import java.util.Arrays;

public class Task3Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("введите размер первого массива");
		int n=HelpS.getNum();
		int [] array1=new int [n];
		System.out.println("введите размер  несортировонного  массива");
		int n2=HelpS.getNum();
		int []array2=new int [n2];
		fill(array1);
		
		System.out.println(Arrays.toString(array1));
		reverseArray(array1);
		System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.toString(array2));
		HelpS.fillRandomMassiv(array2);
		SortedArray(array2);
		System.out.println(Arrays.toString(array2));
	}
	
	
	
	
	
	private static void SortedArray(int[] array1) {
		// TODO Auto-generated method stub
		for (int i =0; i<array1.length;i++) {
			int position=0;
			int max=Integer.MIN_VALUE;
			for(int j=0+i;j<array1.length;j++){
				if(max<=array1[j]) {
					max=array1[j];
					position=j;
			}
			}
			int temp=array1[i];
			array1[i]=array1[position];
			array1[position]=temp;
	 }
	}




	private static void reverseArray(int[] array1) {
		// TODO Auto-generated method stub
		//Сортировка выбором , в данном случае просто реверс, так как изначально массив отсартировон в последовательсти
		//Дана последовательность чисел a1<a2<an
		for (int i =0; i<array1.length/2;i++) {
			int temp=array1[i];
			array1[i]=array1[array1.length-i-1];
			array1[array1.length-i-1]=temp;
			
		}
	}





	private static void fill(int[] array1) {
		for(int i = 0; i<array1.length;i++) {
			array1[i]=i;
		}

}
}