import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		System.out.println("원하는 만큼 숫자를 입력, 종료는 -1");
			int sum = 0;
		
		while(true)
		{
				Scanner scanner = new Scanner(System.in);
				int n = scanner.nextInt();
				
				if(n == -1)
					break;
				
				sum += n;
		} //end while
		
		System.out.println("sum :"+sum);
	}
}
