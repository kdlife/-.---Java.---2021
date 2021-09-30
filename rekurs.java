package firstChapter;

import java.util.HashSet;
import java.util.Set;

public class rekurs {
public static  void rekursPrint (String str) {
	rekurss("",str);
	
}

private static void rekurss(String rekur, String str) { // рекурсивная хрень ,
	int n =str.length();
	if(n==0) {// выход их цикла и  печать 
		System.out.print(rekur+" ");
	}
	else {for(int i =0; i<n;i++) {
		rekurss(rekur+str.charAt(i),str.substring(i+1,n)+str.substring(0,i));// тут вообще жопа, мпло понятно как происходит перестановка
	}
   }
	/*rekur+str.charAt(i) при i =0 первая буква в строке при i =1 вторая буква в строке ... итд
	 * 
	 * 
	 * 
	 * 
	 * */
}
// сделаем тоже самое только с использованием множества SET
public static Set <String> rekursSet(String str){
	
    return	rekursSer1("",str);}

	private static Set<String> rekursSer1(String rec, String str){
		int n=str.length();
		Set <String> store=new HashSet<>();
		
		if(n==0) {
			store.add(rec);
					}
		else {
			for(int i=0;i<n;i++) {
				store.addAll(rekursSer1(rec+str.charAt(i),str.substring(i+1,n)+str.substring(0,i)));
			}
		}
		
	
	return store;	
}

}
