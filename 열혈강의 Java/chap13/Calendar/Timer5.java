package chap13.Calendar;

import java.util.Date;

public class Timer5 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		long time = System.currentTimeMillis();
		Date d2 = new Date(time);
		System.out.println(d2); // 목 7월 29일 시분초 이런식으로 둘다 나옴
	}
}
