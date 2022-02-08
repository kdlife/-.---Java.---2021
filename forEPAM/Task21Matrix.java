package forEPAM;

public class Task21Matrix {

	public static void main(String[]args) {
		System.out.println("Введите размер матрицы n*k");
		System.out.println("Введите размер матрицы n");
		int n=HelpS.getNum();
		System.out.println("Введите размер матрицы k");
		int k=HelpS.getNum();
		int [][] test=new int[n][k];
		System.out.println("Создана матрица:");
		HelpS.Fill(test);
		FindNum(test);
	}

	private static void FindNum(int[][] mass) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("номера строк гдк 5 встречается 3 и более раза");
		for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass[i].length;j++) {
				if(mass[i][j]==5) {count++;}
								}
			if(count>=3) {System.out.print(i+" , ");}
			count=0;
			
			}
	}
}
