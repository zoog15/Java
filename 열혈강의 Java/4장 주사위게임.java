import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		//�غ� ����
		Scanner scanner = new Scanner(System.in); // �Էµ���
		Random random = new Random(); // ���Ǽ��ڿ� ����
		
		//�λ縻
		System.out.println("�ȳ��ϼ��� ^^");
		System.out.println(" D I C E G A M E ! ! ! ! ! ");
		
		//����ڰ� �ֻ����� ������ �κ�
		System.out.println("�ֻ����� ���� �����?");
		
		//����ڰ� ���͸� ġ�� ���� �κ��� ����
		System.out.println(scanner.nextLine());
		
		//����� �ֻ��� 1~6������ �ϱ�
		int userNum = random.nextInt(6) + 1;
		
		System.out.println("����� ���ڴ� : " + userNum);
		
		//��ǻ�Ͱ� �ֻ����� ������ �κ�
		System.out.println("��ǻ�Ͱ� �ֻ����� ���� �����?");
		//����ڰ� ������ġ�� ���� �κ��� ����
		System.out.println(scanner.nextLine());
		
		int comNum = random.nextInt(6) + 1;
		
		System.out.println("��ǻ���� ���ڴ� : "+comNum);
		
		if(userNum > comNum)
			System.out.println("You WIN!!");
		else if(userNum == comNum)
			System.out.println("Draw");
		else
			System.out.println("You LOSE!!");
		
		scanner.close();
	}
}
