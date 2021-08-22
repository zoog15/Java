package kr.co.infopub.chapter.s076;

public class UsingCharacterMain {
	public static void main(String[] args) {
		Character chr1 = new Character('W'); // Character 클래스 객체 생성
		Character chr2 = new Character('9'); // 48+9
		
		// isLetter는 문자 입력되면 해당 문자의 문자(letter, character) 여부를 boolean 타입으로 return
		// chr1.charValue()는 객체에 대입된 문자('W')를 반환
		if(Character.isLetter(chr1.charValue())) {
			System.out.print("1 :"+chr1.charValue()); // 'W'
		}
		System.out.print(" ");
		System.out.print('\u0057'); System.out.print("\t"); // 16진수 유니코드
		System.out.println((Integer.toHexString((int)chr1))); // 'W' = 87
		System.out.println((int)chr1); // 87 -> 5*16 + 7
		
		// isDigit은 문자의 숫자(Digit, number) 여부를 boolean 타입으로 return
		if(Character.isDigit(chr2.charValue())) {
			System.out.println(("2: "+(int)chr2.charValue())); // '9' = 48 + 9, 정수 얻기위해 캐스팅해줌
		}
		
		// getType은 문자가 속한 분류를 int로 return. 소문자는 2, 대문자는 1, 숫자는 9, 공백문자는 15, 특수문자는 24
		System.out.println("3: "+Character.getType('a'));  // 소문자 2
		System.out.println("4: "+Character.getType('A')); // 대문자 1
		System.out.println("5: "+Character.getType('3')); // 숫자 9
		System.out.println("6: "+Character.getType('&')); // 특수문자 24
		
		//OTHER_PUNCTUATION 24
		System.out.println("7: "+Character.getType('\n')); // white 15
		System.out.println("8: "+(int)'\b'); // 8
		
		// 9~13, 28~31 white space
		System.out.println("9: "+(int)'\t'); // 9 // white space
		System.out.println("10: "+(int)'\n'); // 10
		System.out.println("11: "+(int)'\f'); // 12
		System.out.println("12:  "+(int)'\r'); // 13
		
		System.out.println("13: "+Character.getNumericValue('9')); // 문자의 int값을 쉽게 얻을수 있음
		// 공백 문자(9~13, 28~31)인지 확인하는 isWhitespace 메서드 호출
		System.out.println("14: "+Character.isWhitespace(' '));
		System.out.println("15: "+Character.isWhitespace('\n'));
		System.out.println("16: "+Character.isWhitespace('\r'));
		System.out.println("17: "+Character.isWhitespace('\b'));
		System.out.println("18: "+Character.isLetterOrDigit('9'));
		System.out.println("19: "+Character.isLowerCase('A')); // 소문자 인지 확인
		System.out.println("20: "+Character.isUpperCase('A')); // 대문자 인지 확인
		
		// radix 기수 0~9가 기본
		System.out.println("21: "+Character.digit('8',9));
		
		// SPACE_SEPARATOR 12 '\f'
		// LINE_SEPARATOR 13 '\r'
		// PARAGRAPH_SEPARATOR 14
		// SPACE 32
		System.out.println("22: "+(int)' '); // 32
		System.out.println("23: "+Character.isSpaceChar(' '));
		System.out.println("24: "+Character.isSpaceChar('\n'));
	}
}
