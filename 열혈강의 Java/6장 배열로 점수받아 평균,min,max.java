import java.util.Arrays;
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] grades = new int[5]; // 5���� ������ ����
		
		for(int i = 0;i<grades.length;i++) { // 5���� ���� �Է¹ޱ�
			System.out.println(i + "��° ���� ������ �־��ּ���.");
			int userInput = scanner.nextInt();
			grades[i] = userInput;
		} // end for
		
		System.out.println("ó���� �������� ������ �����ϴ�.");
		System.out.println(Arrays.toString(grades)); // �迭�� �����Ͱ� �� ������
		
		//��� ���ϱ�
		int sum = 0;
		for(int i = 0;i<grades.length;i++) {
			sum += grades[i];
		}//end for
		System.out.println("��� : " + (sum/(float)grades.length));
		
		//�ְ� ���� ���ϱ�
		int max = 0;
		for(int i = 0;i<grades.length;i++) {
			if(grades[i] > max) {
				max = grades[i];
			} //end if
		}//end for
		System.out.println("�ְ� ���� : " + max);
		
		//���� ���� ���ϱ�
		int min = 1000;
		for(int i = 0;i<grades.length;i++) {
			if(grades[i] < min) {
				min = grades[i];
			}// end if
		}// end for
		System.out.println("���� ���� : "+min);
		
	}
}
