package forEPAM;

public class Task25Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=HelpS.getNumRandom();
		int k=HelpS.getNumRandom();
		int [][] test=new int[n][k];
		System.out.println("Создана матрица:n*k" +n +" * " +k);
		HelpS.Fill(test);
		int max=findMax(test);
		changeToMax(test, max);
		HelpS.printMass(test);
		
	}

	private static void changeToMax(int[][] test, int max) {
		// TODO Auto-generated method stub
		for (int i =0;i<test.length;i++) {
			for(int j =0; j<test[0].length;j++) {
				if(test[i][j]%2!=0) test[i][j]=max;
				}
			}
		
	}

	private static int findMax(int[][] test) {
		int temp=Integer.MIN_VALUE;
		for (int i =0;i<test.length;i++) {
			for(int j =0; j<test[0].length;j++) {
				if(temp<test[i][j])temp=test[i][j];
			}
		}
		System.out.println("максимальный элемент массива"+ temp);
		return temp;
	}

}
