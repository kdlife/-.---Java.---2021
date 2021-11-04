package firstChapterMath;

import java.util.Locale;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.text.ParseException;

public class FormatNumber {

	public static String forLocale(Locale locale, double num) {
	return format(locale, Style.SHORT, null,num);
	}
	public static String forLocaleStyle(Locale locale, Style style, double num) {
		return format(locale, style, null,num);
		}
	public static String forLocaleStyleRound(Locale locale, Style style,RoundingMode mode, double num) {
		return format(locale, style, mode,num);
		}
	private static String format(Locale locale, Style style, RoundingMode mode, double num) {
		if (locale==null||style==null) {
			return String.valueOf(num);
		}
		NumberFormat nf=NumberFormat.getCompactNumberInstance(locale, style);
		if(mode!=null) {
			 nf.setRoundingMode(mode);
		}
		return nf.format(num);
	}
	// далее обратное преобразование
	public static Number ParseLolace(Locale locale, String num) 
		throws ParseException{
			
		return parse(locale,Style.SHORT,false,num);
		}
	public static Number ParseLolaceStyle(Locale locale,Style style, String num) 
			throws ParseException{
				
			return parse(locale,style,false,num);
			}
	public static Number ParseLolaceStyleGrouping(Locale locale,Style style,boolean grouping, String num) 
			throws ParseException{
				
			return parse(locale,style,grouping,num);
			}

	private static Number parse(Locale locale, Style style, boolean grouping, String num) throws ParseException {
		// TODO Auto-generated method stub
		if(locale==null||style==null||num==null) {throw new IllegalArgumentException( "не заданы параметры");
		}
		
		NumberFormat nf=NumberFormat.getCompactNumberInstance(locale, style);
		nf.setGroupingUsed(grouping);
		return nf.parse(num);
	}
	
	
	
}
