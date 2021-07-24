package chap08.Insa;

/** 인사정보 관리 시스템 */
public class EmployeeService {
	private EmployeeDAO dao = new EmployeeDAO();
	
	public boolean add(Employee emp) {
		System.out.println("신규 인사정보를 추가하는 기능 테스트");
		System.out.println(emp.getName());
		System.out.println(emp.getSabun());
		System.out.println(emp.getSsn());
		System.out.println("디버그: 서비스 객체에서 DAO객체에게 처리를 위임");
		boolean daoResult = dao.addNewEmployee(emp);
		return daoResult;
	}
}
