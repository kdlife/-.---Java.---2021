package forEPAM;

public class Task12Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=HelpS.getNum();
int [][] test=new int[n][n];
HelpS.Fill(test);
String diag=HelpS.Diag(test);
System.out.println("Диагональ"+diag);
	}

}
