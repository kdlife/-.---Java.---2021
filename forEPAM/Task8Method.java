package forEPAM;

import java.util.ArrayList;
import java.util.List;

public class Task8Method {
	public static List <Integer> sum3kn(int[]mass, int k, int n) {
		List <Integer> sum=new ArrayList<>();
		int count=0;
		int sums=0;
		for (int i=k; i<=n; i++) {
			sums=sums+mass[i];
			count++;
			if(count==3) {
				sum.add(sums);
				count=0;
				sums=0;
				i=i-2;
			}
		}
		return sum;
	}
	
}
