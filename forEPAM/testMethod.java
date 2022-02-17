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
		// find second element
		var test5Max= new int[HelpS.getNumRandom()];
		HelpS.fillRandomMassiv(test5Max);
		int testSecondMax=Task5MaxSecondMethod.secondMax(test5Max);
		System.out.println(Arrays.toString(test5Max)+"Second element"+testSecondMax);
		int []test6Nod=new int [3];
		// 3numPrime
		HelpS.fillRandomMassiv(test6Nod);
		System.out.print(Task6Method.checkNODPrime(test6Nod)+" эти числа "+Task6Method.checkNODPrime(10,20,5,10));
	//find factorial
		System.out.println();
		int fact=9;
		Task7Method.sumFac(fact);
		//
		int[]massiv=new int[10];
		HelpS.fillRandomMassiv(massiv);
		// сумма 3хпоследовательных эл от k -n
		var task8=Task8Method.sum3kn(massiv, 5, massiv.length-1);
		System.out.println(task8);
		// площадь 4-х угольника в которого можно вписать окружность
		double area=Task9Method.areaFourAngle(5, 4, 3, 6);
		System.out.println(area);
		// расскладываем число по цифрам
		int numChar=1269587953;
		char[] num=Task10Method.charNum(numChar);
		System.out.println("Number"+numChar+"include"+Arrays.toString(num));
	}

}
