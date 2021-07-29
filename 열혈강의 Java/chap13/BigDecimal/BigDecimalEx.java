package chap13.BigDecimal;

import java.math.BigDecimal;

public class BigDecimalEx {
	public static void main(String[] args) {
		double a = 10;
		double b = 3;
		System.out.println(a/b); // 3.3333333335 같은 부정확한 값이 나옴
		
		BigDecimal ba = new BigDecimal(10);
		BigDecimal bb = new BigDecimal(3);
		BigDecimal result = ba.divide(bb, 5, BigDecimal.ROUND_DOWN );
		System.out.println(result);  // 3.33333 으로 정확한 값
	}
}
