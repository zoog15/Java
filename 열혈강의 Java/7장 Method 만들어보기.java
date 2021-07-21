public class SumMachine {
	//public - 누구나 사용 가능, void - 호출한 결과를 얻을 수 없음
	//()안의값 - 파라미터라고 부름. 
	public int makeSum(int startVal, int endVal) { 
		int start = startVal;
		int end = endVal;
		int sum = 0;
		
		for(int i = start; i<=end;i++) {
			sum = sum+i;
		} // end for
		
		return sum; // 결과값을 반환함. return 의미 : 현재 코드의 샐헹 제어권을 반환
	}//end makeSum메소드
	
	public static void main(String[] args) {
		SumMachine m = new SumMachine();
		int result1 = m.makeSum(1,100); // 메서드에서 return한 값을 변수에 저장
		int result2 = m.makeSum(20,200);
		int result3 = m.makeSum(30,300);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}// end main
}
