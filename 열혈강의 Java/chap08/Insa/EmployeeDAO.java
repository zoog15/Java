package chap08.Insa;

// 데이터 객체의 보관 및 처리 담당
public class EmployeeDAO {
	private Employee[] arr = new Employee[100];
	private int index = 0;
	
	public boolean addNewEmployee(Employee newEmp) {
		boolean result = false;
		//배열에 모든 데이터가 차면 99번까지 데이터가 꽉 찬 상태
		//들어갈 수 없으면 false를 반환
		if(index >= arr.length -1) {
			return false;
		}
		
		arr[index] = newEmp; // 배열에 입력받은 데이터 객체의 데이터를 저장
		index++;
		result = true; // 잘 실행되었음을 의미
		System.out.println("디버그: DAO의 처리 결과" + result);
		return result;
	}
}
