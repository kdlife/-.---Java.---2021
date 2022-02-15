package forEPAM;

public class Point {
	
	private int x;
	private int y;
	
	Point (int x, int y){
		this.x=x;
		this.y=y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	private static  double Distance(Point p1, Point p2) {
		double AC=Math.abs(((p2.getX()-p1.getX())));
		double BC=Math.abs(((p2.getY()-p1.getY())));
		double d=Math.pow(AC, 2)+Math.pow(BC, 2);
		return Math.sqrt(d);
	}
	public static void findMaxDistance(Point [] mass) {
		double max=Double.MIN_VALUE;
		int indexPoint1=0;
		int indexPoint2=0;
		for(int i =0;i<mass.length;i++) {
			for(int j=0;j<i;j++) {
				if((Distance(mass[i],mass[j])>max)){
					max=Distance(mass[i],mass[j]);
					indexPoint1=i;
					indexPoint2=j;
				}
			}
		}
		System.out.println("Max distance="+max+"Point1#"+indexPoint1+"X="+mass[indexPoint1].getX()+"Y="+mass[indexPoint1].getY()+"Point2#"+indexPoint2+"X="+mass[indexPoint2].getX()+"Y="+mass[indexPoint2].getY());
	}
	@Override
	public String toString() {
		return "X="+x+"Y="+y;
	}
}
