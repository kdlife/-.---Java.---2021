package varChapter4;

public class Var2int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// пробуем обьявить  примитивные типы через var
		var isValid=true;
		var symbol='X';
		var intNum=10;
		var longNum=10L;
		var floatNum=10F;
		var doubleNum=10D;
		
		System.out.println("переменная isValid имеет тип "+type(isValid));
		System.out.println("переменная intNum имеет тип "+type(intNum));
		System.out.println("переменная symbol имеет тип "+type(symbol));
		System.out.println("переменная longNum имеет тип "+type(longNum));
		System.out.println("переменная doubleNum имеет тип "+type(doubleNum));
		System.out.println("переменная floatNum имеет тип "+type(floatNum));
	}
// не знал что так можно)
	private static Class<Boolean> type(boolean isValid) {
		// TODO Auto-generated method stub
		return Boolean.TYPE;
	}
	private static Class<Integer> type(int integer) {
		// TODO Auto-generated method stub
		return Integer.TYPE;
	}
	private static Class<Character> type(char ch) {
		// TODO Auto-generated method stub
		return Character.TYPE;
	}
	private static Class<Long> type(long longNum) {
		// TODO Auto-generated method stub
		return Long.TYPE;
	}
	private static Class<Double> type(Double longNum) {
		// TODO Auto-generated method stub
		return Double.TYPE;
	}
	private static Class<Float> type(float floatNum) {
		// TODO Auto-generated method stub
		return Float.TYPE;
	}
}
