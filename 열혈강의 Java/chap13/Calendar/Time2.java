package chap13.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time2 {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1); // 뭔가 어마무시한 데이터값
		Calendar cal2 = new GregorianCalendar();
		System.out.println(cal2); // 뭔가 어마무시한 데이터값
		
		int year = cal1.get(Calendar.YEAR);
		System.out.println(year);
		int month = cal1.get(Calendar.MONTH);
		System.out.println(month); // 0에서부터 시작해서 실제값보다 1 작게 나옴
		int date = cal1.get(Calendar.DATE);
		System.out.println(date);
		int day = cal1.get(Calendar.DAY_OF_WEEK);
		System.out.println(day); // 일요일부터 숫자 1 시작
		
		int lastday = cal1.getActualMaximum(Calendar.DATE);
		System.out.println("마지막 날: " + lastday);
	}
}
