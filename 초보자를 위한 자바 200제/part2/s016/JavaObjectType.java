package kr.co.infopub.chapter.s016;

import java.util.Calendar;
import java.util.Date;

// 참조 타입
public class JavaObjectType {
	public static void main(String[] args) {
		//기본 타입의 배열은 참조(reference) 타입
		int[] m = {1,2,3}; // 배열
		int[] n = new int[] {1,2,3}; // 배열도 String 같이 new로 생성가능, 없어도 생성 가능
		
		//참조 타입 - 객체 타입
		String card = "H8"; // 문자열 
		Date d = new Date(); // 1970.1.1부터 현재까지의 경과시간을 long 타입으로 표현
		Calendar cal = Calendar.getInstance(); // 연월일을 정수로 입력할 수 있는 참조 타입
		
		//자동으로 toString()이 붙는다
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);
	}
}
