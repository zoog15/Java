package kr.co.infopub.chapter.s038;

// 상수 묶음 클래스- enum
public enum PEI {
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33); // 상수값 초기화, 변경 불가
	private final int peiValue; // PEI의 모든 상수값을 이 변수 통해 저장 가능
	
	PEI(int pie){ // enum 값 초기화 하는 생성자
		this.peiValue = pie;
	}
	
	public int getPei() { // enum값이 정수가 될수 없으니 해당 값을 반환하는 메서드 선언
		return peiValue;
	}
}
enum FRUIT{
	APPLE, BANANA, MANGO;
}

