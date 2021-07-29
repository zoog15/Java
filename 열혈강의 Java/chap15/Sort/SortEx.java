package chap15.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAAA");
		list.add("FFFF");
		list.add("CCCC");
		list.add("1111");
		list.add("ZZZZ");
		list.add("EEEE");
		
		System.out.println("정렬하기 전");
		System.out.println(list);
		System.out.println("순차 정렬");
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("역순으로 정렬");
		Collections.reverse(list);
		System.out.println(list);
	}
}
