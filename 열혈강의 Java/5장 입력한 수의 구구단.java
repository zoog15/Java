import java.util.Scanner;

public class GuGuDan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력하고 싶은 단을 입력해 주세요.");
		int dan = scanner.nextInt();
		
		for(int i=1;i<10;i++)
		{
			System.out.println(dan +  "*" + i + "=" + dan*i);
		}	
	}
}
