package ObjectMethod.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s1 = new Shape('T',100,200); // s1이 참조하는 Shape객체에 삼각형,100,200을 넣음
		System.out.println(s1.getArea());
	}
}
