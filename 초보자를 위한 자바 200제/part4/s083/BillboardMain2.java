package kr.co.infopub.chapter.s083;

public class BillboardMain2 {
	public static void main(String[] args) {
		// Data를 객체로 저장
		Billboard b1 = new Billboard(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		//객체 출력
		showAbout(b1);
		// 객체로 전달
		Billboard b = b1; // 주소 복사
		showAbout(b); // 객체 내용물 출력
	}

	private static void showAbout(Billboard bb) { // 객체를 전달하여 출력
		String sf = String.format("%d, %s, %d, %s, %s,", bb.getRank(), bb.getSong(), bb.getLastweek(),
				bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}	
}
