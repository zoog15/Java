import java.util.Random;

public class OddandEven {
	public static void main(String[] args) {
		Random r = new Random();  // 임의숫자 발생기
		int value = r.nextInt(100); // 0~100 사이 임의숫자 
		int odd = value%2;
		
		System.out.println("임의의 값은: "+value);
		System.out.println("나머지 값은: "+odd);
	}
}
