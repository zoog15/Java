package kr.co.infopub.chapter.s114;

public class OddMagicSquare {
	private int[][] magic; // 2차원 배열
	private int n; // 마방진 크기 n X n
	
	public int[][] getMagic() {
		return magic;
	}
	
	public OddMagicSquare(int n) {
		magic = new int[n][n]; // 2차원 배열 생성, 초기화
		this.n = n; // 마방진 크기 결정
	}
	
	public OddMagicSquare() {
		this(3); // 생성자 오버로딩
	}
	
	public void make() {
		int x = 0; // 가장 윗줄
		int y = n/2; // 중앙
		for (int i = 1; i<= n*n; i++) {
			int temX = x; // 옮기기 전 위치 저장
			int temY = y;
			System.out.printf("(%d,%d)\t",x,y);
			
			magic[x][y] = i; // 1~nxnx 대입
			
			// 위로 이동
			if (x-1 < 0) { // 윗벽
				x = n-1;
			} else {
				x--; // 정상 x = x-1;
			}
			
			// 왼쪽 이동
			if (y-1 < 0) { // 왼쪽 벽
				y = n-1;
			} else {
				y--;
			}
			if(magic[x][y] != 0) {
				x = temX+1;
				y = temY;
			}
		}
	}
	
	public void print() {
		System.out.println();
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
