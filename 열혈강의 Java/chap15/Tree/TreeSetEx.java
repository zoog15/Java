package chap15.Tree;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("ZZZZ");
		tSet.add("AAAA");
		tSet.add("1111");
		tSet.add("0000");
		System.out.println(tSet); // 낮은 데이터에서 높은 데이터 순으로 정렬 됨
	}
}
