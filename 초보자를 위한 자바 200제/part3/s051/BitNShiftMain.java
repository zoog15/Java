package kr.co.infopub.chapter.s051;

// & 연산자
public class BitNShiftMain {
	public static int BITMASK = 1;
	// 10진수를 2진수 문자열(스트링)로 변환
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for(int i = 0; i <= 31; i++) {
			s = (a & BITMASK)+s;  // 1과 & 연산을 하면 0 또는 1만 얻음, 나머지가 있으면 1, 없으면 0 반환
			a>>=1;  // a/=2;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n",intNums1,shifts(intNums1));
		System.out.printf("%d : %s%n",intNums1,shifts(intNums2));
	}
}
