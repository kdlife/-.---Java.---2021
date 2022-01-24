package forEPAM;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HelpS {
	public static void printMass(int[][]mass) {
		Arrays.stream(mass).map(Arrays::toString).forEach(System.out::println);
	}
	public static void sortBuble(int[][] mass) {
		int temp;
		 for (int i=0; i<mass.length;i++) {
				for(int j=0; j<mass[i].length;j++) {
					for (int k = 0; k < mass.length; k++) {
	                    for (int l = 0; l < mass[k].length; l++) {
	                        if (mass[i][j] <= mass[k][l]) {
	                            temp = mass[i][j];
	                            mass[i][j] = mass[k][l];
	                            mass[k][l] = temp;
					}
				}
			}
	 }
   }
}
	
	public static int[][] sortBubleOnCollumnUp(int[][] mass) {
		int temp;
		 for (int i=0; i<mass.length;i++) {
				for(int j=0; j<mass[i].length;j++) {
					for (int k = 0; k < mass.length; k++) {
	                      if (mass[i][j] <= mass[k][j]) {
	                            temp = mass[i][j];
	                            mass[i][j] = mass[k][j];
	                            mass[k][j] = temp;
					}
				
			}
	 }
   }
return mass;}
	public static int[][] sortBubleOnCollumnDown(int[][] mass) {
		int temp;
		 for (int i=0; i<mass.length;i++) {
				for(int j=0; j<mass[i].length;j++) {
					for (int k = 0; k < mass.length; k++) {
	                      if (mass[i][j] >= mass[k][j]) {
	                            temp = mass[i][j];
	                            mass[i][j] = mass[k][j];
	                            mass[k][j] = temp;
					}
				
			}
	 }
   }
return mass;}
	public static void sortBubleOnStringDown(int[]mass ) {
		int temp;
		int count=0;
		 for (int i=0; i<mass.length;i++) {
				for(int j=0; j<mass.length;j++) {
					    if (mass[i] >= mass[j]) {
	                            temp = mass[i];
	                            mass[i] = mass[j];
	                            mass[j] = temp;
	                            count++;
					}
				
			}
				
   }
		 System.out.println("произведино замен "+ count);	
}
	public static void sortBubleOnStringUp(int[] mass) {
		int temp;
		int count=0;
		 for (int i=0; i<mass.length;i++) {
				for(int j=0; j<mass.length;j++) {
					if (mass[i] <= mass[j]) {
                        temp = mass[i];
                        mass[i] = mass[j];
                        mass[j] = temp;
                        count++;
						}
					}
				
			}
		 System.out.println("произведино замен "+ count);
	 
   }

	
 public static int [][] sortColumnSqare(int[][]column) {
	 int [][]sorted=new int[column.length][column[0].length];
	 for(int i=0;i<column.length;i++) {
		 int [] temp=new int[column[0].length];
		 for(int j=0;j<column[0].length;j++) {
			 temp[j]=column[j][i];
			 		 }
		 Arrays.sort(temp);
		 for(int j=0; j<temp.length;j++) {
			 sorted[j][i]=temp[j];
		 }
	 }
	 return sorted;
 }
 public static int getNum() {
	 System.out.println("input num");
	 Scanner scan=new Scanner(System.in);
	 int temp;
		if(scan.hasNextInt()) {
		temp=scan.nextInt();
		return temp;}
		else {
			System.out.println("Not int, repeat");
			return getNum();
		}
 	}
 public static int getNumRandom() {
	 int num=(int)(Math.random()*15)+1;
	 
			System.out.println("Generate NUM"+num);
			return num;
		}
 	
 public static int [][]Fill(int [][]mass){
	 for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass[i].length;j++) {
				mass[i][j]=(int)(Math.random()*15);
			}
		}
		Arrays.stream(mass).map(Arrays::toString).forEach(System.out::println);
		return mass;
 }
 public static String Diag(int[][] mass) {
	 int []diag= new int [mass.length];
	 for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass[i].length;j++) {
				if(i==j) {
					diag[i]=mass[i][j];
				}
				}
			}
	 return Arrays.toString(diag);
 }
 public static String Kline(int[][] mass, int k) {
	 int []diag= new int [mass.length];
	 for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass[i].length;j++) {
				if(i==k)	 {
					diag[j]=mass[i][j];
				}
				}
			}
	 return Arrays.toString(diag);
 }
 public static String RKolum(int[][] mass, int r) {
	 int []diag= new int [mass[0].length];
	 for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass[i].length;j++) {
				if(j==r) {
					diag[i]=mass[i][j];
				}
				}
			}
	 return Arrays.toString(diag);
 }
 //из итернера , но сам бы я такой пока не сдеал
 public static void sortbyColumn(int arr[][], int col) 
 { 
     // Using built-in sort function Arrays.sort 
     Arrays.sort(arr, new Comparator<int[]>() { 
         
       @Override              
       // Compare values according to columns 
       public int compare(final int[] entry1,  
                          final int[] entry2) { 

         // To sort in descending order revert  
         // the '>' Operator 
         if (entry1[col] > entry2[col]) 
             return 1; 
         else
             return -1; 
       } 
     });  // End of function call sort(). 
 }
public static int[] fillRandomMassiv(int[] mass) {
	 for (int i=0; i<mass.length;i++) {
		mass[i]=(int)(Math.random()*15);
	 }
		System.out.println(Arrays.toString(mass));
		return mass;
	
}
 
 
 
 
}
