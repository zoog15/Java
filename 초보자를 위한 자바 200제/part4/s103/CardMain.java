package kr.co.infopub.chapter.s103;

public class CardMain {
	public static void main(String[] args) {
		String csuit1 = "H", cvalu1 = "6"; // suit+value
		String csuit2 = "H", cvalu2 = "3"; // suit+value
		
		// 객체 생성
		Card c1 = new Card("H6"); // 생성자 H6
		Card c2 = new Card(csuit1+cvalu1); // 생성자 H6
		Card c3 = new Card(); // 기본 생성자 H2를 가짐
		Card c4 = new Card(csuit2+cvalu2); // 생성자 H3
		
		System.out.printf("%s,%s,%s,%s\n",c1,c2,c3,c4);
		System.out.println(c1.equals(c2)); // 해시 코드는 다름
		System.out.println(c1.getCardVal().equals(c2.getCardVal())); // 값 동일
	}
}
