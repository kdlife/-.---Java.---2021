package forEPAM;

public class Task2Method {
	public static int nod4(int a, int b, int c, int d) {
		int x1=Task1Method.nod(a, b);
		int x2=Task1Method.nod(c, d);
		int result=Task1Method.nod(x1, x2);
		return result;
		}

}
