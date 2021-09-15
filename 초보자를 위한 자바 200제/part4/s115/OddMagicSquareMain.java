package kr.co.infopub.chapter.s115;

import java.util.Scanner;

public class OddMagicSquareMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("홀수 정수를 입력하세요.");
		OddMagicSquare odd = new OddMagicSquare(n);
		odd.make();
		odd.print();
	}
}
