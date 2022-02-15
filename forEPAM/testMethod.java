package forEPAM;

import java.util.Arrays;

public class testMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=HelpS.getNumRandom();
		int secondNum=HelpS.getNumRandom();
		int nok=Task1Method.nok(firstNum, secondNum);
		int nod = Task1Method.nod(secondNum, firstNum);
		System.out.println ("firstnum"+ firstNum+"secondNum"+secondNum+"Nok"+nok+"nod"+nod);
		int num3=HelpS.getNumRandom();
		int num4=HelpS.getNumRandom();
		int nod4=Task2Method.nod4(firstNum, secondNum, num3, num4);
		System.out.println("num1="+firstNum+"num2="+secondNum+"num3="+num3+"num4="+num4+"NOD4="+nod4);
		double hexagonArea=Task3Method.hexagonTryArea(firstNum);
		System.out.println("HexagonArea with button="+firstNum+" Area = "+hexagonArea);
		
		// Находим макс расстояние на плосткости между двумя точками
		Point []mass=new Point[HelpS.getNumRandom()];
		for(int i=0;i<mass.length;i++) {
			mass[i]=new Point(HelpS.getNumRandom(),HelpS.getNumRandom());
		}
		System.out.println(Arrays.toString(mass));
		Point.findMaxDistance(mass);
	//	double distance=Point.Distance(mass[0], mass[1]);
		//System.out.println("Максимальное расстояние"+distance );
	}

}
