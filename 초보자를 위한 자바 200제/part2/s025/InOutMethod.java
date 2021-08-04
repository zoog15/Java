package kr.co.infopub.chapter.s025;

import java.util.Scanner;

// 입력, 출력
public class InOutMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드
		
		System.out.println("정수를 입력하세요.");
		int choice = sc.nextInt(); 			// 키보드를 정수로 입력
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요.");
		double rchoice = sc.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자열을 입력하세요.");
		String schoice = sc.next();
		System.out.println(schoice);
	}
}
