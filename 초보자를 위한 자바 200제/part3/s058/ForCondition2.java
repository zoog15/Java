package kr.co.infopub.chapter.s058;

import java.util.ArrayList;
import java.util.List;

// List
public class ForCondition2 {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for(int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		
		for(int m: ilist) { // ilist에 저장된 정수를 한개씩 가져와서
			if(m %2==1) { // 홀수인지 판별
				s += m*m; // 홀수이면 제곱의 합 구하기
				System.out.printf("%d\t",m*m);
			}
		}
		System.out.println();
		System.out.println("1~10 사이의 홀수에 대한 제곱합: "+s);
	}
}
