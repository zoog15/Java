package chap12.string;

import java.util.Arrays;

public class ConvertEx1 {
	public static void main(String[] args) {
		// valueOf
		String str1 = String.valueOf(10);
		String str2 = String.valueOf('A');
		String str3 = String.valueOf(10.333);
		String str4 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// split
		String str5 = "AAA:BBB:CCC:DDD";
		String[] arr = str5.split(":");
		System.out.println(Arrays.toString(arr)); // [AAA,BBB,CCC,DDD] 같이 배열로 저장
		
		// trim
		String str6 = "AAA";
		String str7 = "  AAA";
		System.out.println(str6.equals(str7.trim()));
	}
}
