package kr.co.infopub.chapter.s064;

/** 
 * 1. 자바에서 최상위 클래스는 Object. 자바의 모든 객체는 Object를 상속받아 메모리를 자동으로 관리
 * */
public class UsingObject {
	public static void main(String[] args) {
		/** Object 객체 생성, Object 클래스가 static 영역에 올라감
		 * 객체는 heap 영역, 레퍼런스는 stack 영역에 존재.
		 * 객체 2개 생성하면 클래스 1개, 객체 2개, 각 객체에 대한 고유 레퍼런스와 해시코드가 생성
		 */
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.hashCode()); // native 10진수, JVM이 구별하려는 객체의 해시코드를 리턴
		System.out.println(Integer.toHexString(obj1.hashCode())); // 16진수, 랩퍼 클래스 이용해 고유 주소 해시코드를 16진수 문자열 변환
		System.out.println(obj1 == obj2); // 객체는 고유함, false , 스택 영역의 레퍼런스를 비교, NEW 키워드로 생성하는 참조 타입의 레퍼런스는 객체마다 고유
		System.out.println(obj1.equals(obj2)); // 객체는 고유함, false, 1차주소(해시코드)를 비교
		System.out.println(obj1); // 자동으로 레퍼런스.toString() 메서드가 됨
		System.out.println(obj2.toString()); // Class@hashCode(), 레퍼런스.toString()은 "타입@16진수 해시코드" 반환
		
		System.out.println("--------------------------------");
		System.out.println(obj1.getClass().getName()); // 클래스 이름
		String str = obj1.getClass().getName() + "@"
				+ Integer.toHexString(obj1.hashCode()); // 16진수
		System.out.println(str); // 클래스 이름@16진수 해시코드
		
		System.out.println("--------------------------------");
		Object objstr = new String("Good"); // 다형성, Object 타입으로 String객체 생성. "부모 이름으로 자식을 생성할수 있다"
		System.out.println(objstr.toString());
		System.out.println(objstr instanceof Object); // instanceof 는 생성된 객체 타입(인스턴스)를 확인
		System.out.println(objstr instanceof String); // String의 객체에 Object 객체도 잇으니 둘다 true 리턴
		
		String hello = "hello";
		System.out.println(hello.getClass()); // 클래스 이름
	}
}
