package chap10.Heritance4;

public abstract class Employee {
	protected String empno; // 상속위주로 써보기 때문에 protected 한번쯤 사용
	protected String name;
	protected int pay;
	
	public Employee(String empno, String name, int pay) { // 추상 클래스더라도 일반 상속의 기능은 가져야함
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract double getMonthPay(); // 추상 method
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", pay=" + pay + "]";
	}
}
