package forEPAM;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Task9 {
	private static int getNumber() {
		Scanner scan=new Scanner(System.in);
		System.out.println("введите число");
		int temp;
		if(scan.hasNextInt()) {
		temp=scan.nextInt();
		return temp;}
		else {
			System.out.println("вы ввели не целое число");
			return getNumber();
		}
	}
	public static Pair<Double , Integer> maxOcc (double [] mass) {
		Map<Double, Integer> massiv=new HashMap<>();
		double key = Double.MAX_VALUE;
		for(int i =0; i<mass.length; i++) {
			massiv.compute(mass[i],(a,b)->(b==null)?1:++b);
		}
		int maxVol=Collections.max(massiv.values());
			for(Entry<Double, Integer> entry: massiv.entrySet()) {
				if(entry.getValue()==maxVol&&key>entry.getKey()) {
					key=entry.getKey();
				}
				
			}
			
		
		return Pair.of(key,maxVol);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите число N");
		 int n=getNumber();
		 double [] A=new double[n];
		for (int i=0;i<A.length; i++) {
		 	 A[i]= Math.round((Math.random()*10));
		 	 System.out.print(A[i]+", ");
		  }
		 System.out.println();
	Pair<Double, Integer> test1=maxOcc(A);
	System.out.println("Максимальное число повторений в массиве:"+test1.var2 +", число:  "+ test1.var1);
		
	}

}
