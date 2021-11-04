package SecondChapter;

import java.util.Arrays;
import java.util.List;
import java.awt.Color;
import java.awt.Point;

public class test {
 
	public static void main(String[] args) {
		List<Integer> test=Arrays.asList(15,68,669,448,699,66);
		// TODO Auto-generated method stub
 List <Integer> evens=CheckNull.evenList(test);
 System.out.println("Проверяем лист на Нулл + только четные" + evens);
 int sum = CheckNull.evenList3(test);
 System.out.println("пробуем сумму листа + проверка на нулл" +sum);
 boolean isNull=CheckNull.haveNull(test);
 System.out.println("есть ли значение null" + isNull);
 //CarNull car1= new CarNull("BMW", null); // специально  делаем искоючение
 //CarNull car2= new CarNull(null, new Color(123, 123, 223));// специально  делаем искоючение
 //CarNull.assignDriver(null, new Point(1, 1));// специально  делаем искоючение
//CarNull.assignDriver("Transport", null);// специально  делаем искоючение
 CarNull car=new CarNull("BMW",new Color(123, 123, 223),null,null);// при ссылке нулл выводится необход занчение
 System.out.println("Number: " + car.getNumber());
 System.out.println("ColorWheel"+ car.getColorWheel());
 
 Car car22 = new Car("Mazda", new Color(123, 123, 123));
 car22.assignDriver(null, null);
 	}

}
