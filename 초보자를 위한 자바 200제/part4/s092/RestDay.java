package kr.co.infopub.chapter.s092;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/** 
 * 1. String과 Date 변환 : SimpleDateFormat 클래스 이용. yyyy,MM,dd,HH,mm,ss를 이용해 원하는 변환 형태 설정
 * 2. long과 Date 변환 : Date 생정자 또는 메서드를 사용해 경과 시간을 대입. 원하는 날짜로 변경
 * 3. Date와 Calendar 변환 : setTime을 사용해 Date를 Calendar에 대입해 원하는 날짜로 변경
 * */
public class RestDay {
	public static void main(String[] args) {
		String st = "2017-06-13";
		Calendar d2 = todate(st); // 문자열을 Date, Date를 다시 Calendar로 변환. 문자열이 yyyy-MM-dd의 형식에 맞기에 변환 가능
		System.out.println(toYMD(d2));
		String st2 = goGo(st,-7); // -7일전날 정보 저장
		System.out.println(st2);
		Calendar d3 = todate(st2); // st2를 Calendar로 변환
		System.out.println(toYMD(d3)); // Calendar를 yyyy-MM-dd 형식에 맞는 문자열로 변환
		
		TimeZone tz = TimeZone.getDefault(); // Asia/Seoul 현재 컴퓨터의 시간존
		Calendar cal = Calendar.getInstance(tz); //  타임존에 대한 Calendar 생성
		System.out.println(toYMD2(cal)); // 해당일의 "연-월-일 시:분:초"를 문자열로 반환
		
		// America/New_York
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
		Calendar calNY = Calendar.getInstance(tzNY);
		System.out.println(toYMD2(calNY));
	}
	public static Calendar todate(String ss) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dd = new Date();
		try {
			dd = sdf.parse(ss);
		} catch(ParseException e) {
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}
	public static String toYMD(Calendar dd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}
	public static String toYMD2(Calendar dd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(dd.getTime());
	}
	public static String goGo(String ss, int day) {
		Calendar cal = todate(ss);
		// -7일을 더하면 일주전
		cal.add(Calendar.DAY_OF_YEAR,  day);
		// 캘린더를 문자열로
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}
}
