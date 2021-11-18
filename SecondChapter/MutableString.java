package SecondChapter;

import java.lang.reflect.Field;

public class MutableString { // работала в ява 8, уже не работает 
// выдает исключение   java.lang.reflect.InaccessibleObjectException: Unable to make field private final byte[] java.lang.String.value
	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		// TODO Auto-generated method stub
		   String user = "guest";
	        System.out.println("User is of type: " + user);

	        Class<String> type = String.class;
	        Field field = type.getDeclaredField("value");
	        field.setAccessible(true);

	        char[] chars = (char[]) field.get(user);

	        chars[0] = 'a';
	        chars[1] = 'd';
	        chars[2] = 'm';
	        chars[3] = 'i';
	        chars[4] = 'n';

	        System.out.println("User is of type: " + user);
	}

}
