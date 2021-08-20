package kr.co.infopub.chapter.s052;

// String method
public class BitNShiftMain {
	public static int BITMASK = 1;
	// 10진법수를 2진수 스트링으로 변환
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for(int i = 0; i <= 31; i++) {
			s = (a & BITMASK) + s;
			a>>=1;  // a/=2;
		}
		return s.substring(s.indexOf('1')); // indexOf('1) = 28, 처음으로 1이 나오는 index. 그 전까지는 전부 제거하고 나머지를 반환
	}
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n",intNums1,shifts(intNums1));
		System.out.printf("%d : %s%n",intNums1,shifts(intNums2));
	}
}
