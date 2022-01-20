package forEPAM;

import java.util.Arrays;

public class Task1SortIncludeMassiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("введите размер первого массива");
		int n=HelpS.getNum();
		System.out.println("введите размер второго массива");
		int n2=HelpS.getNum();
		int [] array1=new int[n];
		int[] array2=new int[n2];
		System.out.println("введите номер K  номер эл мента куда вствыить массиы 1");
		int k= getNum(array2.length);
		HelpS.fillRandomMassiv(array1);
		HelpS.fillRandomMassiv(array2);
		int [] arr=IncludeArray(array1,array2,k);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] IncludeArray(int[] array1, int[] array2, int k) {
		int [] temp=new int[array1.length+array2.length];
		for(int i=0; i<k;i++) {
			temp[i]=array1[i];
			
		}
		for(int i=0; i<array2.length;i++) {
			temp[k+i]=array2[i];
		}
		for(int i=k+array2.length;i<temp.length;i++) {
			temp[i]=array1[k];
			k++;
		}
		return temp;
		
	}

	private static int getNum( int size) {
		int temp=HelpS.getNum();
		if (temp>size&&temp<0) { System.out.println("число К должно входить в размер от n  до n+n2, повторите" );
		return getNum(size); }
		
		return temp;
	}

}
