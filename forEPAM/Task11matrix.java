package forEPAM;

import java.util.Arrays;

public class Task11matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=HelpS.getNum();
		int [][]test=new int[n][n];
		for (int i=0; i<test.length;i++) {
			for(int j=0; j<test[i].length;j++) {
				test[i][j]=(int)(Math.random()*20);
			}
		}
		Arrays.stream(test).map(Arrays::toString).forEach(System.out::println);
		for (int i=0; i<test.length;i++) {
			for(int j=1; j<test[i].length;j++) {
				if(j%2!=0&&test[0][j]>test[test.length-1][j]) {
					System.out.print(test[i][j]+"   ");
				}
			}
			System.out.println("   ");
		}
	}

}
