package kr.co.infopub.chapter.s055;

public class ForeachLotto {
	// var args variable arguments
	public static void print(int ... mm) {
		for (int m : mm) {
			System.out.printf(m+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] mm = {1,6,16,22,23,33};
		print(mm); // 배열도 되고
		int a = 1, b = 6, c = 16;
		print(a);
		print(a,b);
		print(a,b,c); // 1,2,3개짜리 전부 가능
	}
}
