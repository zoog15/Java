package kr.co.infopub.chapter.s056;

import java.util.ArrayList;
import java.util.List;

// 배열보다 편리한 List
public class LottoList {
	public static void main(String[] args) {
		// List는 저장 공간을 스스로 확보하면서 데이터를 저장
		List<Integer> ilist = new ArrayList<>();
		// 넣기
		for(int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		
		// 가져오기
		for(int i = 0; i < ilist.size(); i++) {
			int m = ilist.get(i); // List의 i인덱스에 있는 값을 가져옴(get)
			System.out.printf("%d\t",m);
		}
		System.out.println();
	}
}
