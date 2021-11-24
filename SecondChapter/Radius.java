package SecondChapter;

import java.io.Serializable;

public class Radius implements Serializable {

    private static final long serialVersionUID = 1L;
private int start;
private int end;

//public Radius(int start, int end) {
//	this.end=end;
//	this.start=start;
//}
public void setStart(int start) {
	this.start=start;
}
public void setEnd(int end) {
	this.end=end;
}
public int getStart() {
	return start;
}
public int getEnd() {
	return end;
}
}
