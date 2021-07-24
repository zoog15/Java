package chap08.Insa;

// 인사관리 시스템의 데이터를 저장 및 반환
public class Employee {
	private String sabun; //사번
	private String name; //이름
	private String ssn; //주민번호
	
	public Employee(String sabun, String name) {
		this(sabun,name,"unknown"); // 주민번호가 안들어오면 주민번호는 unknown으로 저장
	}
	
	public Employee(String sabun, String name, String ssn) {
		this.sabun = sabun;
		this.name = name;
		this.ssn = ssn;
	}

	public String getSabun() {
		return sabun;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}
}
