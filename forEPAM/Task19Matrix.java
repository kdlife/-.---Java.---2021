package forEPAM;

public class Task19Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите размер матрицы n*n");
		int n=HelpS.getNum();
		int [][] test=new int[n][n];
		System.out.println("Создана матрица:");
		HelpS.Fill(test);
		summCollumn(test);
	//	int maxSum=findMaxSum();
	}

	private static int findMaxSum() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void summCollumn(int[][] test) {
		// TODO Auto-generated method stub
		int sum=Integer.MIN_VALUE;
		for (int i=0; i<test.length;i++) {
			int sums=0;
			for(int j=0; j<test.length;j++) {
				
				sums=sums+test[j][i];
		//	System.out.print(test[j][i]);
				if(sum<sums) {sum=sums;}
			}
			System.out.println("сумма j-"+ i+": "+ sums);
	}
System.out.println("Максимальная сумма "+sum);
}
}