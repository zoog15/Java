package kr.co.infopub.chapter.s041;

// if && ||
public class JCalendar {
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if( ((year%4==0)&&(year%100!=0))|| (year%400==0)) {
			isS = true;
		}
		return isS;
	}
	public static void main(String[] args) {
		JCalendar hc = new JCalendar();
		System.out.println(hc.isLeapYear(2017)); // isLeapYear는 static 메서드가 아니기때문에 객체 생성수 레퍼런스(hc)로 호출
	}
}
