public class 이자계산 {
	public static void main(String[] args) {
		//원금
		double money = 10000;
		
		//10%의 금리
		double rate = 0.1;
		
		//예치 기간
		int year = 10;
		
		for(int i =0;i<year;i++)
		{
			money = money + (money * rate);
			System.out.println(i+1 +"년 후의 금액은 : "+money);
		}
		
		
	}
}
