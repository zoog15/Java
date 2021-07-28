package chap11.mp3;

public class MP3test {
	public static void main(String[] args) {
		MyMP3 mp3 = new TonyMP3(); // MyMP3 기준(인터페이스)를 만족하는 TonyMP3 객체
		mp3.listenFM();
		mp3.playMp3();
		mp3.viewPhoto();
		
		MyMP3 m3  = new BppleMP3();
		m3.listenFM();
		m3.playMp3();
		m3.viewPhoto();
	}
}
