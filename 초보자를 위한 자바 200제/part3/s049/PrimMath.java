package kr.co.infopub.chapter.s049;

// Math 클래스 메서드
public class PrimMath {
	public static boolean isPrime(int n) {
		/** 에라토스테네스의 체
		 * 예를 들어 101이 소수인지 판별하고 싶으면, 그 제곱급인 10을 얻고, 2~10으로 101이 나누어떨어지는지 확인해보는 방식
		 * */
		boolean isS = true;
		for(int i = 2; i <=(int)Math.sqrt(n); i++) {
			if(n%i == 0) {
				isS = false;
				break;
			}
		}
		return isS;
	}
	public static void main(String[] args) {
		int number = 1234567;
		boolean ifPrime = isPrime(number); // 소수인지 확인
		if(ifPrime) {
			System.out.printf("%d는 1과 자신으로만 나눠얼어지는 소수다.",number);
		}else {
			System.out.printf("%d는 소수가 아니다.",number);
		}
	}
}
