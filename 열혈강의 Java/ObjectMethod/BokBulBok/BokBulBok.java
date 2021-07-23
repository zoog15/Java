package ObjectMethod.BokBulBok;

public class BokBulBok {
	private char[] items; // 복불복 데이터가 들어갈 배열
	private int nextIndex = 0; //selectOne 실행할때마다 index값 하나씩 뒤로 넘겨주기위해
	
	public void ready() {
		items = new char[10]; // 10개의 데이터를 넣겟다
		//복불복 당첨 인덱스 번호
		int index = (int)(Math.random()*items.length);
		//items.length가 10이므로 위의 값은 0~9까지의 값 반환
		
		for(int i = 0; i<items.length;i++) {
			if(i == index) {
				items[i] = 'X';
				continue;
			} // end if
			items[i] = 'O';
			} // end for
		}// end ready
	public char selectOne(){
		return items[nextIndex++];
	}
}
