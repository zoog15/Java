package chap11.mp3;

public class BppleMP3 implements MyMP3 {

	@Override
	public void playMp3() {
		System.out.println("Bpple 제품은 FM 일부 가능");
	}

	@Override
	public void listenFM() {
		System.out.println("Bpple 제품은 mp3 가능");
	}

	@Override
	public void viewPhoto() {
		System.out.println("Bpple 제품은 사진 보기 가능");
	}
}
