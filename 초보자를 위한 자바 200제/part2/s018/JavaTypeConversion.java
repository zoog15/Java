package kr.co.infopub.chapter.s018;

//타입 변환의 필요성
public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat = " 37.52127220511242   ";
		
		//공백 제거 후 double로 타입 변환
		double latitude = Double.parseDouble(slat.trim()); // 공백 제거 후 double로 타입변환
		System.out.println(latitude); // slat 문자열에 잇던 실수부분만 출력
	}
}
