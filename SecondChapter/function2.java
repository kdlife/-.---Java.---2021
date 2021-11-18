package SecondChapter;

import java.util.Objects;

public class function2 {

	private static final int N_MAXBOUND=200;
	private final int n;
	
	public function2(int n) {
		this.n=Objects.checkIndex(n, N_MAXBOUND);// проверяем что бы n входилов в интервад N_MAXBOUND
	}
	public int YMinusX(int x, int y) {
		Objects.checkFromToIndex(x, y, n);/*
		(int start, int end, int length), который Проверяет, 
		чтобы заданный подынтервал [заданное начало; заданный конец] 
		находился внутри интервала [0; заданная длина]. Таким образом,
		 этот метод можно применить к методу yMinusxo, чтобы проверить,
		  что интервал, ограниченный значениями х и у, [х; у)
		   является подынтервалом интервала [0; п]: 
				*/
		return y-x;
	}
}
