package chap10.Heritance4;

public class RegularEmployee extends Employee {
	private int bonus; // extra 변수, 부모클래스와 다르게 독립적으로 가지는 변수
	
	public RegularEmployee(String empno, String name, int pay, int bonus) { // 부모 클래스가 생성자가 있기에 똑같이 생성자 만들어줘야함
		super(empno, name, pay);
		this.bonus = bonus;
	}
	
	@Override
	public double getMonthPay() {
		return (pay/(double)12) + (bonus/(double)12);
	}
	
}
