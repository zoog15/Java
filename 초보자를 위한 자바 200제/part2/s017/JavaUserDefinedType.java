package kr.co.infopub.chapter.s017;

class JLocation{ // 파일 이름과 클래스 이름이 달라 public은 안붙임
	public double lat;
	public double lng;
}
public class JavaUserDefinedType {
	public static void main(String[] args) {
		//두 개의 기본 타입
		double latitude = 37.52127220511242;
		double longitude = 127.0074462890625;
		
		//사용자 정의 객체를 생성
		JLocation jloc = new JLocation();
		jloc.lat = latitude; // 값을 대입
		jloc.lng = longitude;
		
		JLocation newLoc = jloc; // 객체 대입, 다른 객체(newLoc)에 jloc의 레퍼런스(주소)를 알려주는 것임
		System.out.println(newLoc.lat); // jloc의 lat 값 그대로 들어가잇음
	}
}
