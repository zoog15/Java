import java.util.Scanner;

public class GetUserNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ���� �Է¹޴� �κ�
		System.out.println("ȭ�鿡 ���ڸ� �Է��� �ּ���.");
		int input = scanner.nextInt(); // �Է¹��� ���ڸ� ���ڷ� �������
		System.out.println("����� �Է��� ���ڴ�" + input);
		
		scanner.close(); // ��ĳ�� �ݾ������
	}
}
