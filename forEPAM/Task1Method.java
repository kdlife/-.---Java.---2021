package forEPAM;

public class Task1Method {
	
	public static int nod(int a,int b){// наибольший общий делидеь
	    return b == 0 ? a : nod(b,a % b);
	}
	public static int nok(int a,int b){// наименьшее кратное
	    return a / nod(a,b) * b;
	}

}
