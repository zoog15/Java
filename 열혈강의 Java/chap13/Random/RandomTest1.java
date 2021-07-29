package chap13.Random;

import java.util.Random;

public class RandomTest1 {
	public static void main(String[] args) {
		Random random = new Random();
		int value = random.nextInt();
		System.out.println(value);
		
		for(int i = 0; i < 10; i++) {
			int value2 = random.nextInt(10); // 0~9 까지 랜덤
			System.out.println(value2);
		}
	}
}
