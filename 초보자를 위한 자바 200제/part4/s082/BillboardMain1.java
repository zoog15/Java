package kr.co.infopub.chapter.s082;

public class BillboardMain1 {
	public static void main(String[] args) {
		int rank = 1; // 정수 저장
		String song = "Despacito"; // 문자열 저장
		
		// Data 그릇에 담는다
		int lastweek = 1;
		String imagesrc="https://www.billboard.com/images/pref_images/q61808osztw.jpg";
		String artist = "luis fonsi";
		String sf = String.format("%d, %s, %d,\n%s,\n%s",rank,song,lastweek,imagesrc,artist);
		System.out.println(sf);
	}
}
