
public class ChangeEx {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		int temp = 0; // �ӽ������
				
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);
	}
}
