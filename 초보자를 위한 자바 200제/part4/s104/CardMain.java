package kr.co.infopub.chapter.s104;

public class CardMain {
	public static void main(String[] args) {
		Card c1 = new Card("H4");
		Card c2 = new Card("H4");
		Card c3 = new Card(c1); // 복사 생성자 - 값 동일
		
		System.out.println(c1.hashCode()); // 값은 동일, 다른 해시
		System.out.println(c2.hashCode()); // 값은 동일, 다른 해시
		System.out.println(c1.getCardVal()); // 값은 동일
		System.out.println(c2.getCardVal()); // 값은 동일
		System.out.println(c1.equals(c2)); // hashCode 비교 - false
		System.out.println(c1.equals(c3)); // hashCode 비교 - false
		
		for(int i = 0; i<CardUtil.SUIT.length; i++) {
			for (int j = 0; j <CardUtil.VALU.length; j++) {
				Card c = new Card(); // 임의로 카드 생성
				System.out.printf("%s ",c);
			}
			System.out.println();
		}
	}
}
