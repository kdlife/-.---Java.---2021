package forEPAM;

public class Task7Method {
// сумма факториалов нечетных чисел
	public static void sumFac(int num) {
		
		for (int i=1;i<=num; i=i+2) {
			calculateFactorial(i);
			}
		}

private static void calculateFactorial(int x) {
	// TODO Auto-generated method stub
	int result =1;
	for (int i=1;i<=x;i++) {
		result=result*i;
	}
	System.out.println("Factorial num"+x+"="+result);
		}
	}

