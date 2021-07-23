package ObjectMethod.Airplane;

public class Airplane {
	int bombCount = 3;
	
	public void shootBullet() {
		System.out.println("총알을 쏩니다.");
	}
	public void useBomb() {
		if(bombCount > 0) {
			System.out.println("폭탄을 터트립니다.");
			//폭탄을 사용했으니 폭탄 수가 줄어야함
			bombCount--;
			System.out.println("남은 폭탄의 수 :"+bombCount);
		}
		else {
			System.out.println("폭탄이 없네요.");
		}
		
	}
}
