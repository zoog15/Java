package chap13.Formatter;

public class PrintTest {
	public static void main(String[] args) {
		//정수의 포맷팅
		int i = 100;
		System.out.printf("변수 i의 값은 %d\n",i);
		System.out.printf("%d * %d = " + (i*i), i, i);
		
		//문자의 포맷팅
		String str1 = "ABC";
		String str2 = "def";
		
		System.out.printf("문자열은 %s\n",str1);
		System.out.printf("문자열은 %s\n","ABCDEFG");
		System.out.printf("대문자로는 %S\n",str2);
		
		//소수의 포맷팅
		double[] arr = {1.23, 33.444, 3.5, 123};
		
		System.out.printf("%10.3f\n",arr[0]);
		System.out.printf("%10.3f\n",arr[1]);
		System.out.printf("%10.3f\n",arr[2]);
		System.out.printf("%10.3f\n",arr[3]);
	}
}
