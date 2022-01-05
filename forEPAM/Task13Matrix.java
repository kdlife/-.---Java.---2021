package forEPAM;

public class Task13Matrix {
	
	
	public static void main(String[] args) {
		System.out.println("Введите размер матрицы n*n");
		int n=HelpS.getNum();
		int [][] test=new int[n][n];
		System.out.println("Создана матрица:");
		HelpS.Fill(test);
		System.out.println("Введите K какую строку вывести");
		int k=HelpS.getNum();
		String kline=HelpS.Kline(test, k);
		System.out.println(kline);
		System.out.println("Введите P какой столбец вывести");
		int p=HelpS.getNum();
		String Pcolum=HelpS.RKolum(test, p);
		System.out.println(Pcolum);
		
		
	}
}
