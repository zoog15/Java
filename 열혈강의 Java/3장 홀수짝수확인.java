import java.util.Random;

public class OddandEven {
	public static void main(String[] args) {
		Random r = new Random();  // ���Ǽ��� �߻���
		int value = r.nextInt(100); // 0~100 ���� ���Ǽ��� 
		int odd = value%2;
		
		System.out.println("������ ����: "+value);
		System.out.println("������ ����: "+odd);
	}
}
