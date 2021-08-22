package kr.co.infopub.chapter.s069;

/** 
 * String은 reference 타입이지만 오버라이딩해 기본 타입과 동일하게 사용 가능
 * 문자열을 연산한 후 대입 연산자로 저장해야 변경
 * 바꾼 문자열을 다시 대입하지 않으면 원래 문자열이 되는 특징이 immutable
 * 내용이 변경되면 새로운 주소를 다시 가짐
 * 
 * StringBuffer는 저장하는 내용이 변경되어도 처음 주소가 변경되지 않음
 * 바꾼 문자열을 다시 대입하지 않아도 원래 문자열이 변하는 것을 mutable
 * StringBuffer로 문자열을 연산하고, 최종으로 toString()을 통해 String으로 변환해서 사용
 * */
public class StringBufferMain {
	public static void main(String[] args) {
		// StringBuffer 생성
		StringBuffer sb1 = new StringBuffer(); // StringBuffer 객체 생성
		// 1 계속 붙이는 함수 mutable
		sb1.append("안녕하세요.") // append는 String의 (+,concat)의 역할. 하지만 StringBuffer는 mutable해 대입 안해도 됨
			.append("또 만나요.")
			.append("모두를 사랑해요. 기다려봐.");
		System.out.println(sb1.toString()+sb1.hashCode());
		
		// 2 replace
		sb1.replace(0, 2, "나 보기가 역겨워");
		System.out.println(sb1.toString()+sb1.hashCode());
		
		// 3 reverse
		sb1.reverse();
		System.out.println(sb1.toString());
		
		// 4 delete
		sb1.delete(10,15);
		System.out.println(sb1.toString());
		
		// 5 cal by reference, shallow copy
		replaces(sb1); // StringBuffer가 mutable해서 변경됨
		System.out.println(sb1.toString());
	}
	
	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0,3,"GoGo"); // 0부터 2까지를 GoGo로
	}
}
