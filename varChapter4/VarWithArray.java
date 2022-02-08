package varChapter4;

public class VarWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // using explicit type
        int[] numbers = new int[10];
        
        // using var // только так и никак иначче
        var numberArray = new int[10]; // inferred as array of int, int[]
	}

}
