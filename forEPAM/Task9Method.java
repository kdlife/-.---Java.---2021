package forEPAM;

public class Task9Method {
	
	
	public static double areaFourAngle(int a, int b, int c, int d ) {
	
	int p= (a+b+c+d)/2;
	return Math.sqrt((p-a)*(p-b)*(p-c)*(p-d));
	}

}
