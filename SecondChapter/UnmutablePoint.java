package SecondChapter;

public class UnmutablePoint {
private final double x;
private final double y;
private final Radius radius;
 	
public UnmutablePoint(double x, double y, Radius radius) {
	this.x=x;
	this.y=y;
	Radius cloneRadius=new Radius();
	cloneRadius.setStart(radius.getStart());
	cloneRadius.setEnd(radius.getEnd());
	this.radius=cloneRadius;
}
public double getX() {
	return x;
}
public double getY() {
	return y;
}
public Radius getRadius() {
	Radius cloneRadius=new Radius();
	cloneRadius.setStart(this.radius.getStart());
	cloneRadius.setEnd(this.radius.getEnd());
	return cloneRadius;
}
}
