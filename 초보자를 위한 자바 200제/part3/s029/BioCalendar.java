package kr.co.infopub.chapter.s029;

// static 메서드
public class BioCalendar {
	//상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23; //상수
	//static 메서드 선언
	public static double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days%index)*2*Math.PI/index);
	}
	public static void main(String[] args) {
		int days = 1200;
		//메서드 호출
		double phyval = getBioRhythm(days,PHYSICAL,100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n",phyval);
	}
}
