package kr.co.infopub.chapter.s062;

/** 
 * 1. 문자열을 기본타입으로 변환할 때는 랩퍼(Wrapper) 클래스 사용 -> Integer.parseInt(str)
 * 2. 예외가 발생할 수 있는 문장을 try에 넣어주고, 예외가 발생하면 catch(){}에서 처리. catch는 간단하게 작성
 * */
public class FormatTryCatch {
	public static void main(String[] args) {
		String sNum = "123";
		String nNum = "h";
		
		try {
			int a = Integer.parseInt(sNum); // 잘못된 타입을 반환하려 하면 NumberFormatException 발생
			System.out.println(a);
		}catch(NumberFormatException ee) {
			System.out.println("int인지 확인해 봐!!!!!");
			System.err.println(ee.getMessage());
		}catch(Exception ee) { // NumberFormatException이 아닌 다른 예외 발생시 처리
			System.out.println("야 잘 좀 넣어");
		}finally { // 예외가 발생하든 안하든 finally 안의 내용은 무조건 실행
			System.out.println("난 수행되어야만 해!!!");
		}
	}
}
