package forEPAM;

import java.util.Arrays;
import java.util.Scanner;

public class HelpS {
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
 public static int [][]Fill(int [][]mass){
	 for (int i=0; i<mass.length;i++) {
			for(int j=0; j<mass[i].length;j++) {
				mass[i][j]=(int)(Math.random()*20);
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
}
