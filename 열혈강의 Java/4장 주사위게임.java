import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		//준비 도구
		Scanner scanner = new Scanner(System.in); // 입력도구
		Random random = new Random(); // 임의숫자용 도구
		
		//인사말
		System.out.println("안녕하세요 ^^");
		System.out.println(" D I C E G A M E ! ! ! ! ! ");
		
		//사용자가 주사위를 굴리는 부분
		System.out.println("주사위를 굴려 볼까요?");
		
		//사용자가 엔터를 치면 다음 부분이 실행
		System.out.println(scanner.nextLine());
		
		//사용자 주사위 1~6나오게 하기
		int userNum = random.nextInt(6) + 1;
		
		System.out.println("당신의 숫자는 : " + userNum);
		
		//컴퓨터가 주사위를 굴리는 부분
		System.out.println("컴퓨터가 주사위를 굴려 볼까요?");
		//사용자가 엔ㅌ터치면 다음 부분이 실행
		System.out.println(scanner.nextLine());
		
		int comNum = random.nextInt(6) + 1;
		
		System.out.println("컴퓨터의 숫자는 : "+comNum);
		
		if(userNum > comNum)
			System.out.println("You WIN!!");
		else if(userNum == comNum)
			System.out.println("Draw");
		else
			System.out.println("You LOSE!!");
		
		scanner.close();
	}
}
