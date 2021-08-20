package kr.co.infopub.chapter.s060;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** 
 * filter에서 찾은 수를 이렇게 하라 라고 처리하는 map
 * collect는 해당 수의 값을 새로운 리스트에 저장함
 * filter(수 -> 홀수).map(홀수 -> 수*수).collect()는 그 제곱한 수를 새로운 리스트에 저장한다는 의미
 * */
public class ForLambadaCondition {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		
		for(int i=0; i<=10;i++) {
			ilist.add(i);
		}
		
		// stream filter map collect
		ilist = ilist.stream().filter(i->i%2==1).map(i->i*i).collect(Collectors.toList());
		ilist.forEach(i->{System.out.printf(i+"\t");});
		System.out.println();
		
		// stream reduce
		s = ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~10 사이의 홀수에 대한 제곱합:"+s);
	}
}
