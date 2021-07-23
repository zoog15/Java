package ObjectMethod.PigSave;

public class PigSave {
	//인스턴스 변수, 객체마다 다른값을 가질 예정이기에 초기화는 하지 않음
	//private : 접근제한자, 현재 클래스 외부에서는 값을 직접변경이 불가능
	private int total; // 객체의 데이터는 private으로 선언해주자
	
	public int getTotal() { // total의 값을 복사해서 return
		return total;
	}
	
	public void deposit(int amount) {
		System.out.println("저금통 입금");
		total = total +  amount;
	}
	
	public void withdraw() {
		System.out.println("저금통 배 따기");
	}
}
