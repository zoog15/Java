package chap10.Heritance3;

public class CannonBall extends Ball {

	public CannonBall(double radius) { // 부모가 생성자가 있으면 자식도 무조건 생성자가 있어야함 
		super(radius); // 부모의 생성자를 따라가겟다는 의미
	} 
}
