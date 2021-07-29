package chap14.Exception;

import java.util.Scanner;

public class FinallyEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value = 0;
		
		try {
			value = sc.nextInt();
		} catch (Exception e) {
			value = -1;
			e.printStackTrace();
		} finally {
			System.out.println("VALUE : " + value);
		}
		sc.close();
	}
}
