package kr.co.infopub.chapter.s020;

// 정수, 변수, 연산
public class Grad {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int math = 89;
		int tot = kor+eng+math; //259
		int average = tot/3; // 정수이기에 86.3333 -> 86
		System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 =>\t",kor,eng,math);
		System.out.printf("총점 %d점, 평균 %d점\t",tot,average);
		
	}
}
