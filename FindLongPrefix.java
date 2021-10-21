package firstChapter;

public class FindLongPrefix {
	// это пример из книг, мне туту пока не совсем понятнро
public static String FindLongPrefixV1(String [] args) { // поиск максимально одинакового префикса
	if (args.length==1) {return args[0];}
	int first = args.length;
	for (int prefix=0; prefix<first; prefix++) {
		char ch=args[0].charAt(prefix);
		for (int i = 1; i <args.length;i++) {
			if (prefix>=args[i].length()||args[i].charAt(prefix)!=ch) {// проверям префикс должен  быть меньше сем след строка и символ должен совпадать
				if (prefix==0) {return "NaN";}// добавил, так как если нету ничего не выводит
				return args[i].substring(0, prefix);
			}
		}
	}
	return args[0];
}
	
}
