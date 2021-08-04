package kr.co.infopub.chapter.s024;

// 메서드
public class Hello {
	// 메서드 선언
	public static void showHello() { // 반환값이 없는 메서드는 리턴 타입 void
		System.out.println("**********************************************");
		System.out.println("	이 프로그래밍은 Java200이 만들었습니다.		");
		System.out.println("**********************************************");
	}
	
	// 메서드 호출
	public static void main(String[] args) {
		showHello(); // 메서드이름(), 같은 static이므로 객체 생성 없이 호출 가능
	}
}
