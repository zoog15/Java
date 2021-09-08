package kr.co.infopub.chapter.s107;

import java.util.Comparator;

import kr.co.infopub.chapter.s104.CardUtil;

/* 
 * 역순으로 정렬
 * */
public class CardRomp implements Comparator<Card>{

	@Override
	public int compare(Card c1, Card c2) {
		// 문자열 compareTo() - 사전식 비교
		if(c1.getCardVal().charAt(0) >  c2.getCardVal().charAt(0)) {
			return -1;
		} else if(c1.getCardVal().charAt(0) < c2.getCardVal().charAt(0)) {
			return 1;
		} else {
			if(CardUtil.toVal(c1.getCardVal().charAt(1)) >
				CardUtil.toVal(c2.getCardVal().charAt(1))){
					return -1;
			} else if(CardUtil.toVal(c1.getCardVal().charAt(1))<
					CardUtil.toVal(c2.getCardVal().charAt(1))) {
				return 1;
			} else return 0;
		}
	}
}
