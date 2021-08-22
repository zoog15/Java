package kr.co.infopub.chapter.s070;

/** 
 * String은 문자열 내용이 바뀌거나 (+,concat)되면 새로운 객체를 만듬
 * 이 때 레퍼런스를 잃어버린 객체는 가비지 컬렉터의 대상이 됨
 * 새 객체에는 새 주소와 해시코드 할당
 * 
 * StringBuffer는 원래 있던 객체의 내용만 바뀌는 mutable한 특성
 * StringBuilder는 동기화하지않은 SringBuffer
 * 여러 Thread에서 하나의 StringBuilder 사용은 지양
 * */
public class StringBuilderMain {
	public static void main(String[] args) {
		// synchronized 안한 StringBuilder
		StringBuilder sbu = new StringBuilder(); // StringBuilder 객체 생성
		sbu.append("I") // mutable해 다시 대입 안해도 됨
			.append(" go")
			.append(" to school.");
		System.out.println(sbu); // 자동으로 toString()이 붙어 저장된 문자열 출력
		sbu.replace(7, 11,"");
		System.out.println(sbu);
		sbu.reverse();
		System.out.println(sbu);
		sbu.deleteCharAt(3);
		System.out.println(sbu);
		sbu.delete(1, 3);
		System.out.println(sbu);
		String ss = sbu.substring(0); // 잘라내어 새로운 문자열에 저장, 기존의 문자열은 변하지 않음
		System.out.println(ss);
		System.out.println(sbu);
		String st = sbu.substring(0,4);
		System.out.println(st);
		System.out.println(sbu);
	}
}
