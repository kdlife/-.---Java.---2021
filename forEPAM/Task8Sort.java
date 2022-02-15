package forEPAM;

import java.util.Arrays;
import java.util.Comparator;

public class Task8Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Fraction [] mass= new Fraction[HelpS.getNum()];
			
		for(int i=0;i<mass.length;i++) {
		mass[i]=new Fraction(HelpS.getNumRandom(),HelpS.getNumRandom());
			
		}
		System.out.println(Arrays.toString(mass));
		Fraction.solveDen(mass);

		System.out.println(Arrays.toString(mass));
		Arrays.sort(mass, Comparator.comparing(Fraction::getNum));// можно так по современному
	
		System.out.println(Arrays.toString(mass));
	}

}
