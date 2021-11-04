package SecondChapter;

import java.awt.Color;
import java.awt.Point;
import java.util.Objects;

public class CarNull {
 private final Color color;
 private  Color colorWheel;
 private final String name;
 private  String number;
  public CarNull (String name, Color color) {
	  if (name==null) {
		  throw new NullPointerException("name can non be Null");
	  }
	  if (color==null) {
		  throw new NullPointerException("color can not be Null");
	  }
	  this.color=color;
	  this.name=name;
  }
  public CarNull (String name, Color color, String number, Color colorWheel) {
	  if (name==null) {
		  throw new NullPointerException("name can non be Null");
	  }
	  if (color==null) {
		  throw new NullPointerException("color can not be Null");
	  }
	  this.color=color;
	  this.name=name;
	  this.number=Objects.requireNonNullElse(number, "no number");//  если значение нулл, то не выбрачывемт искочение а выводит значени
	  this.colorWheel=Objects.requireNonNullElseGet(colorWheel,()->new Color(0, 0, 0));// тоже
	  
  }
  public String getNumber() {
      return number;
  }

  public Color getColorWheel() {
      return colorWheel;
  }   
  public static void assignDriver (String license, Point Location) {
	  
	  Objects.requireNonNull(license,"License can not be null");//  оба варианита правильны , но так современнее
	  Objects.requireNonNull(Location, "Location can not be nul");
//	  if(license==null) {
//		  throw new NullPointerException("License can not be null");
////	  }
//	  if(Location ==null) {
//		  throw new NullPointerException("Location can not be null");
//	  }
  }
}
