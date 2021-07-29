package chap13.Wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		a = 11;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b); // a = 11, b = 10. a상자 안의 내용물이 b상자안에 복사되 가지고감
		
		Integer aa = new Integer(10);
		Integer bb = aa;
		aa = aa + new Integer(1);
		
		System.out.println("aa: "+aa);
		System.out.println("bb: "+bb); // aa = 11, bb = 10. 연산후엔 aa 변수의 결과가 새로운 객체로 만들어짐

		// Autoboxing
		int i = 10;
		Integer j = i; 
		// Unboxing
		Integer k = new Integer(10);
		int l = k;
	}
}
