package chap11.mp3;

public class TonyMP3 implements MyMP3 {
	@Override
	public void listenFM() {
		System.out.println("tony 제품은 FM 수신 가능");
	}
	
	@Override
	public void playMp3() {
		System.out.println("tony 제품은 mp3 지원");
	}

	@Override
	public void viewPhoto() {
		System.out.println("tony 제품은 이미지 뷰어 제공");
	}
}
