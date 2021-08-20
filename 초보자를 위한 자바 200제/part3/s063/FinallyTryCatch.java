package kr.co.infopub.chapter.s063;

/** 
 * 1. Exception은 RuntimeException과 그 외의 예외(CompiletimeException)으로 나눠짐
 * 2. RuntimeException은 실행 시에 발생하는 예외로 '잘못된 대입', '범위 벗어난 배열', '잘못된 입력 형식', '수학 관련(0으로 나누는 등)' 으로 발생
 * */
public class FinallyTryCatch {
	public static void main(String[] args) {
		try {
			// Divide by zero
			int x = 5;
			int y = 20/(5-x); // 여기에서 예외를 던짐
			System.out.println(y);
		}catch(ArithmeticException e) {
			System.out.println("==> 0으로 나눴나 확인해 봐!!!");
			e.printStackTrace(); // 어떤 예외가 발생했는지 에러메시지
		}finally {
			System.out.println("난 수행되어야만 해!!!");
		}
	}
}
