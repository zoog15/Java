public class ���ڰ�� {
	public static void main(String[] args) {
		//����
		double money = 10000;
		
		//10%�� �ݸ�
		double rate = 0.1;
		
		//��ġ �Ⱓ
		int year = 10;
		
		for(int i =0;i<year;i++)
		{
			money = money + (money * rate);
			System.out.println(i+1 +"�� ���� �ݾ��� : "+money);
		}
		
		
	}
}
