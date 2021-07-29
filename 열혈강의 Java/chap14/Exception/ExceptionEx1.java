package chap14.Exception;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
//		System.out.println(x/y);  // 이런식이면 0으로 나눗셈이 불가능해 예외발생, 뒤의 코드가 발생안함
		
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("AAA");
		System.out.println("BBB");
		System.out.println("CCC");
		
		
	}
}
