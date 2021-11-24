package testClone;

import java.io.Serializable;

import SecondChapter.Radius;

public class PointM implements Cloneable,  Serializable  {//  наследуем интерфейс implements Cloneable , через него можно кланировать обьекты

    private static final long serialVersionUID = 1L;
	private double x;
 private double y;
 private Radius radius;
 public PointM() {
	 
 }
 public PointM (double x, double y, Radius radius) {
	 this.x=x;
	 this.y=y;
	 this.radius=radius;
 }
 public PointM copyPointM() {
	 PointM copy=new PointM();
	 copy.setX(this.x);
	 copy.setY(this.y);
	 return copy;
 }
 public PointM (PointM other) {
	 this.x=other.x;
	 this.y=other.y;
 }
 public void setX(double x) {
	 this.x=x;
 }
 public void setY(double y) {
	 this.y=y;
 }
 public double getX() {
	 return x;
 }
 public double getY() {
	 return y;
	 
 }
 public Radius getRadius() {
     return radius;
 }

 public void setRadius(Radius radius) {
     this.radius = radius;
 }   
	@Override
	public PointM clone() throws CloneNotSupportedException{// обязвтельно нужно переопределить метот Clone
		return (PointM) super.clone();// клонируем обьект(PointM) - обьект super.clone()- клионируем
	}
}
