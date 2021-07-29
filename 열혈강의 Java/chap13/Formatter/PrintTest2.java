package chap13.Formatter;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintTest2 {
	public static void main(String[] args) {
		//Decimal Format
		DecimalFormat df = new DecimalFormat("#000.00#");
		double a = 1.23;
		String aStr = df.format(a);
		System.out.println(aStr);   // 001.23
		
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
		Date date = new Date();
		String str = sdf.format(date);
		System.out.println(str); // 21/07/29
	}
}
