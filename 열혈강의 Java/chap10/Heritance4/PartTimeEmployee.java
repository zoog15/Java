package chap10.Heritance4;

public class PartTimeEmployee extends Employee {
	private int workDay;

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	@Override
	public double getMonthPay() {
		return pay*workDay;
	}
}
