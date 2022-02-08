package forEPAM;

import java.util.Arrays;

public class Task16Matrix {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Введите размер матрицы n*n");
			int n=HelpS.getNum();
			int [][] test=new int[n][n];
			System.out.println("Создана матрица:");
			fill(test);
			
		}
		private static void fill(int[][] mass) {
			// TODO Auto-generated method stub
			
			for (int i=0; i<mass.length;i++) {
				for(int j=0; j<mass.length-i;j++) {
				//	if(j<i) {mass[i][j]=7;}
				//	else	{mass[i][j]=1;
				//	mass[mass.length-i-1][mass.length-j-1]=9;}
					if (j>=i) {mass[i][j]=1;
						mass[mass.length-i-1][mass.length-j-1]=1;}
					else if (i<mass.length/2){mass[i][j]=0;}
				}
			}
			Arrays.stream(mass).map(Arrays::toString).forEach(System.out::println);
		}

	}


