package chap10.Heritance4;

public class TempEmployee extends Employee {
	// 고용기간
	private int hireYear;

	public TempEmployee(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}
	
	@Override
	public double getMonthPay() {
		return pay/(double)12;
	}
}
