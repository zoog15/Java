package ObjectMethod.InternetCheck;

public class InternetData {
	private String domain;
	
	public InternetData(String domain) {
		this.domain = domain;
		checkInternet(); // 객체가 생성되며 바로 인터넷 실행여부 확인을 위해
	}
	
	private void checkInternet() { // 외부에서 호출할 필요가 없어졌기에 private으로 바꿈
		System.out.println("인터넷부터 확인합니다.");
	}
}
