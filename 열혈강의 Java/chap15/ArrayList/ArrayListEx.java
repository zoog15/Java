package chap15.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		System.out.println(list);
		
		// add(요소), add(인덱스,요소), set(인덱스,요소) : ArrayList에 데이터 추가
		list.add("AAAA");
		list.add("BBBB");
		list.add("CCCC");
		list.add("DDDD");
		list.add(1,"EEEE"); // 인덱스 1번에 비집고 들어감을 확인
		list.set(1, "FFFF"); // 인덱스 1번의 값을 없애고 새로 들어감
		System.out.println(list);
		
		// get(인덱스), remove(인덱스) : ArrayList에서 데이터 꺼내기
		String str = list.get(1);
		System.out.println(str); // 현재 1번 인덱스에 있는 FFFF를 출력
		String str1 = list.remove(1);
		System.out.println("list: " + list); 
		System.out.println("str1: " + str1); // 1번 인덱스에 있던 FFFF를 삭제하여 반환받음
	}
}
