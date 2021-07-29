package chap15.Set;

import java.util.HashSet;

public class PlayerSetTest {
	public static void main(String[] args) {
		HashSet<Player> playerSet = new HashSet<Player>();
		playerSet.add(new Player("박지성","한국"));
		playerSet.add(new Player("지단","프랑스"));
		Player p = new Player("지단","프랑스");
		playerSet.remove(p);
		System.out.println(playerSet);
	}
}
