package firstChapterMath;

import java.util.function.BinaryOperator;

public class SumBigInteger {
	private  static final int I1= Integer.MAX_VALUE;
	private  static final int I2= Integer.MAX_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int  sum1 = I1+I2;
 int  sum2 = Integer.sum(I1,I2);
 System.out.println(sum1+"    sum 2: "+sum2); // ???????????????????? -2  ???????????????????????? 
 try {
 int sum3=Math.addExact(I1, I2);
 System.out.println(sum3);
 }
 catch ( ArithmeticException XXX) {System.err.print("Overflow");}
//throw ArithmeticException
 try {
 BinaryOperator<Integer> operator = Math::addExact;
 int zExactBo = operator.apply(I1, I2);
 System.out.println(I1 + " + " + I2 + " via BinaryOperator is: " + zExactBo);
 }
 catch ( ArithmeticException XXX) {System.err.print("Overflow");}
 
	}

}
