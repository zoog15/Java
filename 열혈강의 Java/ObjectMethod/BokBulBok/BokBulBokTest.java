package ObjectMethod.BokBulBok;

public class BokBulBokTest {

	public static void main(String[] args) {
		BokBulBok b = new BokBulBok();
		
		b.ready(); // 복불봉값 세팅
		
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"번 째 : "+b.selectOne());
		}
	}
}
