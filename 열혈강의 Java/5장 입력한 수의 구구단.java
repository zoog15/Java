import java.util.Scanner;

public class GuGuDan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����ϰ� ���� ���� �Է��� �ּ���.");
		int dan = scanner.nextInt();
		
		for(int i=1;i<10;i++)
		{
			System.out.println(dan +  "*" + i + "=" + dan*i);
		}	
	}
}
