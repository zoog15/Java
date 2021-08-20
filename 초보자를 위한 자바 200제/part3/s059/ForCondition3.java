package kr.co.infopub.chapter.s059;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

// stream 
/** Stream은 "순차적으로 나열된 데이터", 그 안에 저장된 데이터를 쉽고 편하게 연산(filter, map, reduce)할 수 있는 기능 제공
 * 1. List에 저장된 데이터 중 조건에 맞는 것을 찾을때 filter 사용 - filter 조건에 맞는 수를 골라냄
 * 2. 합은 reduce 사용해 간단하게 연산 -> reduce(초기값, Integer::sum) : 초기값부터 stream안의 숫자들을 하나씩 sum함
 */
public class ForCondition3 {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for(int i = 1; i <= 100; i++) {
			ilist.add(i); // 1~100까지 저장
		}
		
		// 초기값 0
		s = ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~100의 합:"+s);
		
		s=0;
		// 1~100사이 홀수의 합
		s=ilist.stream().filter(i->i%2==1).reduce(0, Integer::sum);
		System.out.println("1~100사이 홀수의 합:"+s);
		
		// 1~100사이 홀수의 합
		s=ilist.stream().filter(i->i%2==1).reduce(0, (x,y)->x+y);
		System.out.println("1~100사이 홀수의 합:"+s);
		
		// 1~100사이 홀수의 합
		s=ilist.stream().filter(i->i%2==1).reduce(0,
				new BinaryOperator<Integer>() { // apply() 메서드를 호출해 어떤 작업을 수행할 수 있다
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		});
		System.out.println("1~100사이 홀수의 합:"+s);
		
	} // end main
} // end class
