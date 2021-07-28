package chap12.string;

public class Stringex3 {
	public static void main(String[] args) {
		String str1 = "AAA";
		String str2 = "BBB";
		
		String str3 = str1 + str2; // 더하기로 바로 결합
		String str4 = str1.concat(str2);
		
		System.out.println(str3);
		System.out.println(str4); // 둘다 "AAABBB" 출럭
		
		String str5 = "ABCDE";
		int len = str5.length();
		for(int i = 0; i<len; i++) {
			System.out.println(str5.charAt(i)); // A,B,C,D,E 차례로 출력
		}
		
		int idx1 = str5.indexOf("BCD");
		System.out.println(idx1); // 문자열이 시작하는 위치의 index 반환, 없으면 -1 반환
		
		String str6 = "ABCDEFG"; // 인덱스 번호는 0~6
		String sub1 = str6.substring(2);  // C가 인덱스 번호 2
		System.out.println(sub1); // CDEFG 출력
		String sub2 = str6.substring(2,5); // F가 인덱스 번호 5
		System.out.println(sub2); // CDE 출력
		
		String str7 = "AAA";
		String str8 = "AAA";
		//두 문자열의 내용이 같은가?
		boolean result = str7.equals(str8);
		System.out.println(result); // true 반환
	}
}
