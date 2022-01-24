package forEPAM;

import java.util.Arrays;

public class Task4Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("введите размер первого массива");
		int n=HelpS.getNum();
		int [] array1=new int [n];
		HelpS.fillRandomMassiv(array1);
		HelpS.sortBubleOnStringUp(array1);
		System.out.println(Arrays.toString(array1));
		HelpS.sortBubleOnStringDown(array1);
		System.out.println(Arrays.toString(array1));
	}

}
