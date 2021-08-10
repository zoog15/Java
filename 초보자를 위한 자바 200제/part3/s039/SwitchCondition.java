package kr.co.infopub.chapter.s039;

// char switch
public class SwitchCondition {
	public static int toNum(char c) {
		int tot = 0;
		switch(c) {
		case 'A' : tot = 1; break;
		case 'T' : tot = 10; break;
		case 'J' : tot = 11; break;
		case 'Q' : tot = 12; break;
		case 'K' : tot = 13; break;
		default : tot = c - '0'; break; // char 숫자를 int형으로 바꿔줌
		}
		return tot;
	}
	public static void main(String[] args) {
		char c = 'J';
		int result = toNum(c);
		System.out.printf("%c => %d\n",c,result);
	}
}
