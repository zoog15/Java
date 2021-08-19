package kr.co.infopub.chapter.s050;

// >> shift ? 삼항 연산자
public class BitNShiftMain {
	// 10진수 정수를 2진수 문자열(스트링)로 변환
	public static String shifts(int a) {
		String s = "";
		for(int i = 0; i <=31; i++) {
			int aa = a%2;
			s = (aa>=0) ? aa+s : (-aa)+s; // 양수를 만들기위해 음수이면 -1을 곱해줌
			a>>=1;  // a/=2; 와 동일
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
