package varChapter4;

import java.util.function.Function;
import java.util.function.Supplier;

public class VarWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function <Double, Double> increment = x->x+1;
		Supplier<IllegalArgumentException> exception=IllegalArgumentException::new;
		Square square=(var x)->x*x;// var= double
	}

}
