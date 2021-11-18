package SecondChapter;

import java.util.Objects;

public class Function {
	private static final int X_MAX=15;
	private static final int Y_MAX=16;
	private int x;
	Function (int x){
		if(x<0||x>=X_MAX) {
			throw new IndexOutOfBoundsException("Not in range");
		}
		this.x=x;
	}
	public int xMinusY(int y) {
		if(y<0||y>x) {
			throw new IndexOutOfBoundsException("Not in range");
		}
		return x-y;
	}
	public static int oneMinusY(int y) {
	Objects.checkIndex(y, Y_MAX); // или так, по современному
		//(y<0||y>=Y_MAX) {
	//		throw new IndexOutOfBoundsException("Not in range");
	//	}
		return 1-y;
	}
}
