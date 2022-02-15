package varChapter4;

import java.util.ArrayList;

public class VarWithT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(add1(52));
 System.out.println(add2(105));
	}
	
	
	
	public static <T extends Number> T add1(T t){
		 var temp=t;
		 return temp;
		 
	 }
	public static <XXX extends Number>XXX add2(XXX t){
		var numList=new ArrayList<XXX>();
		numList.add(t);
		numList.add((XXX)Integer.valueOf(10));
		numList.add((XXX)Double.valueOf(10.1));
		return numList.get(1);
		
	}
}
