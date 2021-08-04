package kr.co.infopub.chapter.s022;

// 실수 변수, 연산
public class HighHill {
	public static void main(String[] args) {
		double S=6;		// 6 영국 신발 사이즈 -> 255mm
		double P=0.75;	// 75%히트할 확률
		double L=200;	// 200파운드 -> 1,787원/1파운드
		double T=0;		// 0년(올해유행) 1년전 유행
		double A=1;		// 음주량 0잔 -> 8.83cm, 1잔 -> 4.42cm
		double Y=2;		// 착용년도
		
		double ups1 = P*L*(Y+9);
		double downs = (T+1) *(A+1)*(Y+10)*(L+20);
		double ups2 = 12+3*S/8.0;
		double high = ups1/downs*ups2;		// 밝혀낸 식
		System.out.printf("적당한 하이힐 높이는 %1$.2fcm입니다.",high); // 첫번째 변수를 1$ 위치에 대입
	}
}
