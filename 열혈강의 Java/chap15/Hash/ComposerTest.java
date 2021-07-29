package chap15.Hash;

public class ComposerTest {
	public static void main(String[] args) {
		Composer c1 = new Composer();
		Composer c2 = new Composer();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode()); // 서로 다른 int값을 반환
		
		String str1 = new String("AAAA");
		String str2 = new String("AAAA");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // 같은 값을 반환
	}
}
