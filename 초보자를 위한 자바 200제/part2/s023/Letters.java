package kr.co.infopub.chapter.s023;

// char, escape
public class Letters {
	public static void main(String[] args) {
		char a = '닳';
		String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int letterNumber = letter.length();		// letter 문자열의 길이
		int loc = letter.indexOf(a);			// letter 문자열에서 a(닳)이 있는 위치의 index
		
		System.out.printf("\"%s\" => %d자이며, '%c'은 %d번째 있다.\n", letter, letterNumber,a,loc);
		
		char b = letter.charAt(loc);			// loc index에 해당하는 문자 1개를 반환, '닳'
		System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.",letter,loc,b);
	}
}
