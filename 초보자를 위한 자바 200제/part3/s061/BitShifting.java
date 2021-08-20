package kr.co.infopub.chapter.s061;

/** 
 * 문자열(String)은 내부적으로 char[]을 이용해 만든 클래스
 * 1. 문자열.charAt(index)는 index 위치의 문자(char)를 반환
 * 2. 문자열.length()는 문자열의 길이(문자 개수)를 반환
 * 3. new String(char[])은 char[]를 문자열로 반환
 * 4. 문자열.toCharArray()는 문자열 내부에 저장된 문자들을 char[]로 반환
 * */
public class BitShifting {
	public static final int BITMASK = 1;
	public String makeBit(int value) {
		// char 배열을 String으로 만들기 위해
		char[] val = new char[32]; // int 타입이 32비트이므로 크기 32 배열
		for(int i = 31; i>=0; i--) { // 맨뒤에서부터 1과 0을 채워나감
			if((value & BITMASK)==1) {
				val[i] = '1'; // 1&1일떄만 1
			}else {
				val[i] = '0';
			}
			value >>>=1; // >>는 부호를 유지하며 쉬프트 연산, >>>는 부호도 오른쪽으로 쉬프트
		}
		return new String(val); // char배열을 String으로
	}
	public static void main(String[] args) {
		int ival = 2345;
		int eval = -2345;
		BitShifting bitsh = new BitShifting();
		String vals = bitsh.makeBit(ival);
		System.out.println(vals);
		vals = bitsh.makeBit(eval);
		System.out.println(vals);
		char[] vs = vals.toCharArray();
		System.out.println(vs[0]);
	}
}
