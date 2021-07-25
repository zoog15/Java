package chap10.Heritance2;

public class MouseTest {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.clickLeft();
		m.clickRight();
		
		System.out.println("---------------------");
		
		WheelMouse wm = new WheelMouse();
		wm.clickLeft();
		wm.clickRight();
		wm.scroll();
		
		System.out.println("---------------------");
		
		/** 형변환 예시 */
		Mouse m1 = new WheelMouse(); // WheelMouse가 Mouse안의 부분집합, WheelMouse가 Mouse를 상속받았기에 타입의 정보마저 물려받음
		m1.clickLeft();
		m1.clickRight();
		
		System.out.println("---------------------");
		
		Mouse m2 = new OpticalMouse();
		m2.clickLeft();  // OpticalMouse의 method로 실행. 실제 객체가 해당 method가 있는지를 우선
		m2.clickRight();
	}
}
