package forEPAM;

public class Task20matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите размер матрицы n*n");
		int n=HelpS.getNum();
		int [][] test=new int[n][n];
		System.out.println("Создана матрица:");
		HelpS.Fill(test);
		for (int i=0; i<test.length;i++) {
			for(int j=0; j<test.length;j++) {
				if (i==j&&test[i][j]>0)
					System.out.print(test[i][j]+"  ");
				}
			}
	}

}
