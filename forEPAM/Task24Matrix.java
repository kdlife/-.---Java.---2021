package forEPAM;

public class Task24Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n=HelpS.getNumRandom();
		int k=HelpS.getNumRandom();
		int [][] test=new int[n][k];
		System.out.println("Создана матрица:n*k" +n +" * " +k);
		fillOne(test);
		HelpS.printMass(test);
	}

	private static void fillOne(int[][] test) {
		for (int i=0;i<test.length;i++) {
			for(int j=0;j<test[0].length;j++) {
				if(i<j) {
					test[i][j]=1;
				}
			}
		}
		
	}

}
