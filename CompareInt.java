package firstChapterMath;

public class CompareInt {
public static int CompareIntV1(int num1, int num2) {
	return Integer.compare(num1, num2);
}
public static int CompareIntV2(int num1, int num2) {
	return Integer.compareUnsigned(num1, num2);
}
}
