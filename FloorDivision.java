package firstChapter;

public class FloorDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int x = -222;
	        int y = 14;

	        System.out.println("Dividend: " + x + " Divisor: " + y);
	        
	        System.out.println();
	        int z = Math.floorDiv(x, y); // -222/14 = -15.85, so output is -16
	        System.out.println("Floor division via '/' is: " + (x / y));
	        System.out.println("Floor division via 'floorDiv()' is: " + z);

	        System.out.println();
	        int m = Math.floorMod(x, y); /*
	        После метода Math.floorDiv() среда разработки JDK 8
	         предоставила метод Math.floorModO, который возвращает целую часть
	          остатка от деления заданных аргументов. Она вычисляется как
	           результат выражения х - (floorDiv (х, у) * у), и поэтому этот метод
	            вернет тот же результат, что и оператор % для аргументов
	             с одинаковым знаком и другой результат для аргументов, 
	             которые не имеют одинакового знака. 
	        
	        
	        */
	        System.out.println("Floor modulus vis '%' is: " + (x % y));
	        System.out.println("Floor modulus via 'floorMod()' is: " + m);
	}

}
