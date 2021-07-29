package chap15.Set;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		// 데이터를 넣는 method - add
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add(new String("C"));
		System.out.println(set); // 중복된 C의 값은 1번만 출력
		
		// 데이터를 삭제하하는 method - remove(객체)
	}
}
