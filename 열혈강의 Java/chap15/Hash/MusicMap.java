package chap15.Hash;

import java.util.HashMap;

public class MusicMap {
	public static void main(String[] args) {
		HashMap<Composer,Works> map = new HashMap<Composer,Works>();
		Composer c1 = new Composer();
		c1.setName("베토벤");
		c1.setNation("독일");
		
		Works work1 = new Works();
		work1.setTitle("운명");
		work1.setType("교향굑");
		work1.setYear("1808");
		
		map.put(c1, work1); // 키 -> composer 객체, 값 -> works 객체 를 가리킴
	}
}
