package varChapter4;

import java.util.Stack;

public class VarAndCleanCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
var stack=new Stack<String>();
 stack.push("Dima");
 stack.push("Vasia");
 stack.push("Igor");
 
 stack.forEach(System.out::println);
	}

}
