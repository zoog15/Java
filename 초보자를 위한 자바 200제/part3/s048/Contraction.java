package kr.co.infopub.chapter.s048;

public class Contraction {
	public static int sumEach(int n) {
		int tot=0;
		while(n!=0) {
			tot += n%10; // 1의 자리숫자를 계속 더함
			n /= 10; // 자릿수를 1개씩 낮춤
		}
		return tot;
	}
	public static void main(String[] args) {
		int number = 1234567;
		int value = sumEach(number);
		System.out.printf("%d에 대한 각 자리의 숫자 합: %d",number,value);
	}
}
