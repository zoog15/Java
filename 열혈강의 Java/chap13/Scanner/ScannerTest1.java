package chap13.Scanner;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		System.out.println("문자를 입력하세요.");
		// String str = sc.nextLine(); // 오류 발생
		String str = sc.next();
		System.out.println("숫자: " + num);
		System.out.println("문자: " + str);
	}
}
