package chap15.Hash;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map); 
		
		// put(키의 레퍼런스, 값의 레퍼런스) = 데이터 넣기
		for(int i = 0; i < 100; i++) {
			map.put(i, "AAAA"+i);
		}
		System.out.println(map); // AAAA0 ~ AAAA99 까지 출력
		
		// 같은 Key값으로 데이터를 넣으면 기존 데이터는 사라짐
		map.put(0, "BBBB");
		map.put(0, "CCCC");
		map.put(0, "DDDD");
		
		System.out.println(map); // AAA0이 DDDD로 바뀜
		
		// get(키 값) = 데이터를 찾을때는 키로 찾기
		String data = map.get(5);
		System.out.println(data); // AAAA5 저장
	}
}
