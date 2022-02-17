package forEPAM;

import java.util.Arrays;

public class Task5MaxSecondMethod {
	public static int secondMax(int[]mass) {
		if(mass.length<=1)return mass[0];
		Arrays.sort(mass);// если нужно сохранить то исходный массив, то сделаем копию
		int x=1;
		while(mass[mass.length-x-1]==mass[mass.length-x]) {
			x++;
		};
		return mass[mass.length-1-x];
	}
}
