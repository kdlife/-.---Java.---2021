package firstChapter;

public class countCharacter {

	public static int countCh(String str, char symbol) {
		int count = 0;
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch==symbol) count++;
		}
		return count;
	}
	public static int countCh2 (String str, char symbol) {
		int x1=str.length();
		int x2=str.replace(String.valueOf(symbol),"").length();
		return x1-x2;
		
	}
/// попробуем в java 8  
	public static long countCh3(String str, char symbol) {
		long result = str.chars()
				.filter(c->c==symbol)
				.count();
		return result;
	}


}
