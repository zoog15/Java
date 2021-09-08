package kr.co.infopub.chapter.s107;

import java.util.Comparator;

import kr.co.infopub.chapter.s104.CardUtil;

/* 
 * getCardVal()은 "H3"과 같은 카드값(문자열)을 반환. charAt(0)을 통해 앞의 문자를 반환
 * H =72, C =67 이므로 H>C, 두개의 값을 비교해 1을 반환. 1은 서로 순서를 바꾸라는 의미
 * -1은 순서를 그대로 두라는 의미
 * suit가 같으면 charAt(1), 즉 값을 비교. A는 1로 변환
 * */
public class CardComp implements Comparator<Card>{

	@Override
	public int compare(Card c1, Card c2) {
		// 문자열 compareTo() - 사전식 비교
		if(c1.getCardVal().charAt(0) >  c2.getCardVal().charAt(0)) {
			return 1;
		} else if(c1.getCardVal().charAt(0) < c2.getCardVal().charAt(0)) {
			return -1;
		} else {
			if(CardUtil.toVal(c1.getCardVal().charAt(1)) >
				CardUtil.toVal(c2.getCardVal().charAt(1))){
					return 1;
			} else if(CardUtil.toVal(c1.getCardVal().charAt(1))<
					CardUtil.toVal(c2.getCardVal().charAt(1))) {
				return -1;
			} else return 0;
		}
	}
}
