package kr.co.infopub.chapter.s077;

import java.util.Arrays;

/** 
 * new로 생성하는 동적 배열, 사용하지 않는 정적 배열. 정적 배열은 한번 선언후 다시 초기화 불가능
 * */
public class ArrayInit {
	public static void main(String[] args) {
		// 기본 타입의 배열 사용 방법 1 선언
		int[] a; // 동적 배열 선언
		// a = {1,2,3}; // 선언하면서 초기화 할때만 사용
		
		// 정의
		a = new int[5];
		
		// 초기화
		a[0] = 2; a[1] = 5; a[2] = 3; a[3] = 9; a[4] = 8;
		
		// 방법 2 선언 정의 초기화
		int[] b = new int[] {2,5,3,9,8};
		
		// 방법 3 선언(정의) 초기화
		int[] c = {2,5,3,9,8};
		// 다시 대입 불가(초기화 불가)
		// c={2,5,3,9};
		
		int[] e = new int[5];
		Arrays.fill(e, -1); // 5개 값 모두 -1 로 초기화
		System.arraycopy(c, 0, e, 0, c.length); // Deep Copy, c배열 index 0  부터 5개를 e배열에 저장
		Arrays.sort(e);
		print(e);
		e = new int[] {1,2,3,4,5,6}; // 동적 배열 다시 초기화 가능
		print(e);
		int index = Arrays.binarySearch(e, 5); // e배열에서 5가 있는 위치를 확인
		System.out.println(index);
	}
	public static void print(int[] a) {
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
