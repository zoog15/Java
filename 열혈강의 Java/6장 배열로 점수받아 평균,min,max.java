import java.util.Arrays;
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] grades = new int[5]; // 5개의 점수만 받음
		
		for(int i = 0;i<grades.length;i++) { // 5개의 점수 입력받기
			System.out.println(i + "번째 성적 점수를 넣어주세요.");
			int userInput = scanner.nextInt();
			grades[i] = userInput;
		} // end for
		
		System.out.println("처리할 점수들은 다음과 같습니다.");
		System.out.println(Arrays.toString(grades)); // 배열의 데이터값 다 보여줌
		
		//평균 구하기
		int sum = 0;
		for(int i = 0;i<grades.length;i++) {
			sum += grades[i];
		}//end for
		System.out.println("평균 : " + (sum/(float)grades.length));
		
		//최고 점수 구하기
		int max = 0;
		for(int i = 0;i<grades.length;i++) {
			if(grades[i] > max) {
				max = grades[i];
			} //end if
		}//end for
		System.out.println("최고 점수 : " + max);
		
		//최저 점수 구하기
		int min = 1000;
		for(int i = 0;i<grades.length;i++) {
			if(grades[i] < min) {
				min = grades[i];
			}// end if
		}// end for
		System.out.println("최저 점수 : "+min);
		
	}
}
