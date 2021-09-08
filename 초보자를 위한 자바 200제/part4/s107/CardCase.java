package kr.co.infopub.chapter.s107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kr.co.infopub.chapter.s104.CardUtil;

public class CardCase {
	// aggregation : CardCase는 Card로 구성된다
	private List<Card> cards = new ArrayList<Card>();
	
	public CardCase() {
		cards.clear(); // 내용 지우기
	}
	
	// List 반환
	public List<Card> getCards(){
		return cards;
	}
	
	// List에 저장된 Card의 갯수
	public int count() {
		return cards.size(); // 저장된 Card 개수
	}
	
	// List의 index번째 Card
	public Card getCard(int index) {
		return cards.get(index); // index번쨰 Card
	}
	
	// 서로 다른 카드 20장 만들기
	public void make() {
		cards.clear(); //  내용 지우기
		int suit = CardUtil.SUIT.length; // 2
		int valu = CardUtil.VALU.length; // 10
		int count = 0;
		
		// 서로 다른 20개의 카드를 만든다
		while(count!=valu*suit) {  // 20장이 될때까지
			Card c = new Card(); // 임의 카드 만들기
			if( !cards.contains(c)) { // contains -> equals() 를 이용해 비교
				cards.add(c); // 같은 객체 아니라면 저장
				count++;
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public void print() {
		int valu = CardUtil.VALU.length;
		for (int i = 0; i < cards.size(); i++) {
			Card c = cards.get(i);
			System.out.printf("%s",c.toString());
			if((i+1)%valu == 0) {
				System.out.println();
			}
		}
	}
	
	public void sort() {
		cards.sort(new CardComp());
	}
	
	public void rsort() {
		cards.sort(new CardRomp());
	}
}
