package forEPAM;

import java.util.Arrays;

public class Task2Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("введите размер первого массива");
		int n=HelpS.getNum();
		System.out.println("введите размер второго массива");
		int n2=HelpS.getNum();
		int [] array1=new int [n];
		int[]array2=new int[n2];
		fill(array1);
		fill2(array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		int[]arrayFull=connect(array1, array2);
		System.out.println(Arrays.toString(arrayFull));
	}

	private static int[] connect(int[] array1, int[] array2) {
		int []temp=new int[array1.length+array2.length];
		int flag=0;
		int flag2=0;
		for(int i = 0; i<temp.length;i++) {
			if(flag!=array1.length&&flag2!=array2.length) {
				
			if(array1[flag]>=array2[flag2]) {
				temp[i]=array2[flag2];
				flag2++;}	
			
			else { temp[i]=array1[flag];flag++;
			}}
		else {temp[i]=array2[flag2];
		flag2++;
			}
			}
		
		return temp;
	}

	private static void fill2(int[] array2) {
		for(int i = 0; i<array2.length;i++) {
			array2[i]=i*2;
		}
	}

	private static void fill(int[] array1) {
	for(int i = 0; i<array1.length;i++) {
		array1[i]=i;
	}
		
	}

}
