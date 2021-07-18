import java.util.Scanner;

public class GetUserNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 숫자 입력받는 부분
		System.out.println("화면에 숫자를 입력해 주세요.");
		int input = scanner.nextInt(); // 입력받은 문자를 숫자로 만들어줌
		System.out.println("당신이 입력한 숫자는" + input);
		
		scanner.close(); // 스캐너 닫아줘야함
	}
}
