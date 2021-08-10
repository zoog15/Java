package kr.co.infopub.chapter.s036;

// switch case
public class BioSwitch {
	// 조건에 따라 신체, 감정, 지성값을 출력
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) { // index에 입력된 값에 따라 실행
		case 23 : result = "신체 지수: "; break;
		case 28 : result = "감정 지수: "; break;
		case 33 : result = "지성 지수: "; break;
		}
		return result + (value*100); // 문자열 + 기본타입은 자동으로 문자열로 형변환
	}
	public static void main(String[] args) {
		int index = 23; // 신체 지수
		double value = 0.86;
		String st = textInfor(index, value); // 메서드 호출
		System.out.println(st);
	}
}
