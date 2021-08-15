package kr.co.infopub.chapter.s045;

// while로 사용하는 for
public class EvenOdd {
	public static void showOddnEvenf(int n) {
		int temp = n;
		for( ; temp != 1 ; ) {
			if(temp % 2 == 1) {
				temp = temp*3 + 1;
			}else {
				temp /= 2;
			}
			System.out.print("["+temp+"]");
		}
		System.out.println("\n-------------------------");
	}
	public static void main(String[] args) {
		showOddnEvenf(122);
	}
}
