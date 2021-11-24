package firstChapter;

public class ConcatRep {
public static String conRepV1(String str, int n) {
	StringBuilder sb=new StringBuilder();
	for(int i =0; i <n; i++) {
		sb.append(str);
	}
	return sb.toString();
}
public static String conRepV2(String str,int n) {
	return str.repeat(n);
}
}
