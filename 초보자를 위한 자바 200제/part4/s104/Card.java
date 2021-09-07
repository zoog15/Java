package kr.co.infopub.chapter.s104;

public class Card {
	private String cardVal;
	public String getCardVal() {
		return cardVal;
	}
	
	public Card() {
		// 0~3
		int suit = (int)(Math.random()*CardUtil.SUIT.length);
		// 0~12
		int valu = (int)(Math.random()*CardUtil.VALU.length);
		// 임의 카드 갖음
		cardVal = CardUtil.SUIT[suit] + CardUtil.VALU[valu];
	}
	
	// 테스트용
	public Card(String s) {
		this.cardVal =s;
	}
	
	// 복사 생성자
	public Card(Card c) {
		this(c.getCardVal());
	}

	@Override
	public String toString() {
		return "[" + cardVal + "]";
	}
	
}
