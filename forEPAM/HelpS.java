package forEPAM;

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
}
