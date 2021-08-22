package kr.co.infopub.chapter.s071;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

/** 
 * 1. System.currentTimeMillis()는 1970.1.1부터 현재까지 걸린 시간을 ms 단위로 반환
 * 2. 하루는 86,400,000ms. int 범위를 벗어날 수 있으니 long으로 선언
 * 3. System.getProperties()는 시스템 환경변수 반환. 시스템 환경변수는 OS 관련 정보 제공
 * */
public class SystemTest {
	public static void main(String[] args) {
		long ltime = System.currentTimeMillis();
		System.out.println((ltime)); // 1970.1.1 부터
		for(int i = 0; i < 100000; i++) { // 10만번 출력
			System.out.print("");
		}
		
		long ltime2 = System.currentTimeMillis(); // milli 1/1000초
		System.out.println((ltime2-ltime)); // 위에 10만번 for문 반복한 후의 시간
		System.out.println(ltime2/1000/60/60/24/365+"년"); // 1970년에서 현재까지 몇년 지났는지 구함
		Properties pro = System.getProperties(); // 시스템 변수를 (key, value)로 저장한 맵 계열 properties 로 반환
		
		// 원하는 System property
		System.out.println(pro.getProperty("java.vm.version")); // 키 java.vm.version 에 대한 값 반환
		System.out.println(pro.getProperty("file.separator")); // 키 file.separator 에 대한 값 반환
		
		System.out.println(new Date(System.currentTimeMillis())); // 오늘
		// -----------java.util.*에서 ---------------- //
		// 모든 System property
		Enumeration<Object> en = pro.keys();
		int i = 0;
		while(en.hasMoreElements()) { // 키가 있다면 키값 얻고, 키값에 대한 밸류ㅠ 얻음
			String keys = (String)en.nextElement();
			System.out.println((++i+" ")+keys+":"+pro.getProperty(keys));
		}
	}
}
