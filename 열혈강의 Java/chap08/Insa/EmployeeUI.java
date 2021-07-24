package chap08.Insa;

import java.util.Scanner;

public class EmployeeUI {
	private Scanner scanner = new Scanner(System.in);
	private EmployeeService service = new EmployeeService();
	
	public void regist() {
		System.out.println("신규 인사정보를 등록합니다.");
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();
		System.out.println("사번을 입력하세요.");
		String sabun = scanner.nextLine();
		System.out.println("주민번호를 입력하세요");
		String ssn = scanner.nextLine();
		System.out.println("입력하신 정보는 다음과 같습니다.");
		System.out.println(name + " : " + sabun + " : " + ssn);
		Employee emp = new Employee(sabun,name,ssn); //입력받은 정보를 데이터 객체에 저장
		boolean addResult = service.add(emp);
		System.out.println("서비스에서 처리된 결과: "+ addResult);
	}
	
	public static void main(String[] args) {
		EmployeeUI ui = new EmployeeUI(); // UI가 화면이라 생각햇을때 객체 생성 및 바로 실행
		ui.regist();
	}
}
