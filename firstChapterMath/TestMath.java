package firstChapterMath;

import java.util.Locale;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.text.ParseException;

public class TestMath {
private static final String test ="255500";
private static final int IntMIN=Integer.MIN_VALUE;
private static final int IntMAX=Integer.MAX_VALUE;
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
long startTime=System.nanoTime();
int result=UnsignedNum.unsigned(test);
System.out.println(result);
long result2=ConvertIntToLong.Convert(IntMIN);
System.out.println(result2);
displayExecutionTime(System.nanoTime()-startTime);
int resultCompareInt=CompareInt.CompareIntV1(IntMAX, IntMIN);
int resultCompareIntUnsigned=CompareInt.CompareIntV2(IntMAX, IntMIN);
System.out.println("???????????????????? ?????????????? ?? ??????????????"+resultCompareInt);
System.out.println("???????????????????? ?????????????????????? ??????????????"+resultCompareIntUnsigned);
int ResultDivide=DivisionMinMax.DivisionSigned(IntMIN, IntMAX);
int ResultDivide2=DivisionMinMax.DivisionSigned2(IntMAX, IntMIN);
System.out.println(" ?????????????????????? ?????????????? ???? ?????????????? "+ResultDivide);
System.out.println("?????????????????????? ?????????????? ???? ?????????????? "+ResultDivide2);
double testFormat=10000d;
double testFormat2=1600d;
System.out.println(FormatNumber.forLocale(Locale.ENGLISH, testFormat));
System.out.println(FormatNumber.forLocaleStyle(Locale.ENGLISH,Style.LONG, testFormat));
System.out.println(FormatNumber.forLocaleStyle(Locale.ENGLISH,Style.SHORT, testFormat2));
System.out.println(FormatNumber.forLocaleStyleRound(Locale.ENGLISH,Style.SHORT,RoundingMode.DOWN, testFormat2));
Number fiveSThousand = FormatNumber.ParseLolaceStyle(Locale.US, Style.SHORT, "5K");
Number fiveLThousand = FormatNumber.ParseLolaceStyle(Locale.US, Style.LONG, "5 thousand");
System.out.println("Parsing (short) 5K: " + fiveSThousand);
System.out.println("Parsing (long) 5K: " + fiveLThousand);

Number fiveSGThousand = FormatNumber.ParseLolaceStyleGrouping(Locale.US, Style.SHORT, true, "5,50K");
Number fiveLGThousand = FormatNumber.ParseLolaceStyleGrouping(Locale.US, Style.LONG, true, "5,50 thousand");
System.out.println("Parsing & grouping (short) 5,50K: " + fiveSGThousand);
System.out.println("Parsing & grouping (long) 5,50 thousand: " + fiveLGThousand);  
	
	
	}
	private static void displayExecutionTime(Long time) {
		System.out.println("Execution Time:" + time + "ns");
	}
}
