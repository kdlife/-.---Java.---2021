package SecondChapter;

import java.util.Arrays;
import static SecondChapter.UserBuilder.getBuilders;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.awt.Color;
//import java.awt.Point;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

//import SecondChapter.UserBuilder.UserBuilders;

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
 
 //Car car22 = new Car("Mazda", new Color(123, 123, 123)); // 
 //car22.assignDriver(null, null);
 int TestException=Function.oneMinusY(10);
 System.out.println(TestException+ "проверка срабатываеняи исключаения заданного интревала");
 Function f=new Function(10);
 int f2=f.xMinusY(5);
 System.out.println(f2+ "проверка срабатываеняи исключаения заданного интревала");
 
 function2 f21=new function2(199);
 int f211=f21.YMinusX(10, 199);
 System.out.println(f211+ "проверка срабатываеняи исключаения заданного интревала");
 PlayerEquals player1=new PlayerEquals(1,"Dima");
 PlayerEquals player2=new PlayerEquals(1,"Dima");
 System.out.println("проверяем идентичность "+ player1.equals(player2));
 System.out.println(Objects.equals(player1, player2));
 System.out.println("Hash cod player 1   " + player1.hashCode());
 System.out.println("Hash cod player 2   " + player2.hashCode());
 Set<PlayerEquals> players=new HashSet<>();
 players.add(player1);
 players.add(player2);
 System.out.println("Size"+ players.size());
 Radius radius1=new Radius();
 radius1.setStart(0);
 radius1.setEnd(120);
 UnmutablePoint p = new UnmutablePoint(1.2, 33.4, radius1);
 
 System.out.println("X: " + p.getX());
 System.out.println("Y: " + p.getY());
 
 System.out.println("Radius start: " + p.getRadius().getStart());
 radius1.setStart(5);
 p.getRadius().setStart(5);
 System.out.println("Radius start: " + p.getRadius().getStart());
 
 UserBuilder user1= getBuilders("kdlife","dddd").build();// создаем обьект через строитель
 System.out.println("User 1 successfully created on:"+ user1.getCreated());
 UserBuilder user2= getBuilders("kdlife","dddd")
		 .FirstName("dim")
		 .Email("kdligerer.df")
		 .build();
 System.out.println("User 2 successfully created on:"+ user2.getCreated());
 Validator validator=Validation.buildDefaultValidatorFactory().getValidator();// cоздаем стандартный валидатор // для этого необходимо преобразовать проект в maven
 UserBuilder.UserBuilders userbild1= new UserBuilder.UserBuilders("Dima", "passw")// передаем данные в строитель но не строим. отсутствует метот build().
		 .FirstName("karpo")
		 .LastName("DFFs")
		 .Email("EErrr@eerr.df");
 final Set<ConstraintViolation<UserBuilder.UserBuilders>> violations= validator.validate(userbild1);
 if(violations.isEmpty()) {
	 userbild1.build();
	 System.out.println("All is OK, User created");
 		}
 else printConstraintViolations("Violations : ", violations);
 	}

	private static<T> void printConstraintViolations(String caption, Set<ConstraintViolation<T>> violations) {

		System.out.println(caption);
		violations.forEach((v)->{System.out.println("\t"+v.getPropertyPath()+" "+v.getMessage());});// getPropertyPath() 
	}

}
