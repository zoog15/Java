package kr.co.infopub.chapter.s106;

public class CardCaseMain {
	public static void main(String[] args) {
		CardCase cc = new CardCase();
		cc.make(); // 서로 다른 20장 만들기
		cc.print();
		System.out.println("----------------------");
		
		cc.shuffle(); // 카드 섞기
		cc.print();
		System.out.println("----------------------");
		
		cc.shuffle();
		cc.print();
	}
}
