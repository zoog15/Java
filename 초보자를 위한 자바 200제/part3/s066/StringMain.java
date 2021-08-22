package kr.co.infopub.chapter.s066;

public class StringMain {
	public static void main(String[] args) {
		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city7 = "Asia";
		
		System.out.println(city1);
		System.out.println(city1.length());
		// 이 아래 3개는 falses
		System.out.println(city1 == city2); // 애초에 다름
		System.out.println(city1.equals(city2)); // 안의 내용물 다름
		System.out.println(city1 == city3); // 내용물은 같지만 Stack의 레퍼런스가 다름
		// 이 아래 3개는  true
		System.out.println(city1 == city7); // new로 생성하지 않은 문자열은 Stack의 레퍼런스와 Heap의 해시코드까지 같다
		System.out.println(city1.equals(city3)); // 문자열의 내용 자체는 같음
		System.out.println(city1.equals(city7)); // 문자열 내용이 같음
		
		String city4 = String.format("%s-%s", city1,city2);
		System.out.println(city4);
		String city5 = city1 + "-" + city2 + 1 + 2; 
		System.out.println(city5); // Asia-Europe12, 문자열과 만나는순간 전부 문자열로 변함
		String city6 = 1 + 2 + city1 + "-" + city2;
		System.out.println(city6); // 3Asia-Europe, 숫자부터 만나서 계산한뒤 문자열로 변함
	}
}
