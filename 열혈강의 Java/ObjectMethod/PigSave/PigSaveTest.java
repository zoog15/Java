package ObjectMethod.PigSave;

public class PigSaveTest {
	public static void main(String[] args) {
		//new PigSave() : 'PigSave'라는 클래스에서 새로(new) PigSave 객체 생산
		//PigSave save : save라는 상자안에 PigSave 클래스에서 생산된 객체의 레퍼런스가 들어감
		PigSave save = new PigSave(); // 객체 지향의 가장 기본적인 사용
		save.deposit(100); // 메서드 접근
		save.deposit(500);
		
		//System.out.println(save.total); // 직접 데이터에 접근, total이 private해서 접근 불가능
		int totalMoney = save.getTotal(); // get method 통해 접근
		System.out.println("총액: " + totalMoney);
	}
}
