package kr.co.infopub.chapter.s074;

import java.util.Calendar;
import java.util.Date;

/** 
 * 단순한 날짜를 출력할 때는 java.util.Date를 사용, 하지만 사용 가능한 method가 적음
 * 그래서 java.util.Calendar를 많이 사용. 추상 클래스라 new가 아닌 getInstance() 메서드 사용
 * */
public class CalendarTest {
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();  // 1970.1.1부터 경과 시간 msec
		System.out.println(millis/1000/24/60/60); // 며칠 경과
		
		Date d = new Date(); // 오늘
		System.out.println(d);
		Date dd = new Date(d.getTime()+24*60*60*1000); // 하루 후
		System.out.println(dd);
		
		Calendar cal1970 = Calendar.getInstance();
		cal1970.set(1970, 1-1,1); // 0월~11월, 1970.1.1
		
		Calendar today = Calendar.getInstance(); // 오늘
		printCalendar(today);
		long minus = today.getTimeInMillis()-cal1970.getTimeInMillis();
		System.out.println(minus); // 1970.1.1~오늘 몇 msec
		System.out.println(minus/1000/24/60/60); // 1970년부터 며칠 지났는가?
	}
	// 캘린더 정보
	public static void printCalendar(Calendar c) {
		System.out.println("-----------------------------");
		System.out.println(c.get(Calendar.YEAR)); // 몇년
		System.out.println(c.get(Calendar.MONTH)+1);  // 몇 월
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // 며칠
		System.out.println(c.get(Calendar.AM_PM)); // 1 PM, 0 AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); // 몇시
		System.out.println(c.get(Calendar.MINUTE)); // 몇 분
		System.out.println(c.get(Calendar.SECOND)); // 몇 초 
	}
}
