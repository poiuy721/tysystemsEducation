package ch06;

public class DateDotUtil {
	public static String dotDate(String date) {
		String returnStr="";
		returnStr+=date.substring(0, 4);
		returnStr+=".";
		returnStr+=date.substring(4, 6);
		returnStr+=".";
		returnStr+=date.substring(6);
		return returnStr;
	}

	public static String dashDate(String date) {
		String returnStr="";
		returnStr+=date.substring(0, 4);
		returnStr+="-";
		returnStr+=date.substring(4, 6);
		returnStr+="-";
		returnStr+=date.substring(6);
		return returnStr;
	}
}
