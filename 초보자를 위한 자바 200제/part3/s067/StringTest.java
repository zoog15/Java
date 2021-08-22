package kr.co.infopub.chapter.s067;

public class StringTest {
	public static void main(String[] args) {
		String text = " Hello Java4Android";
		String com = " HEllo Java4Android";
		
		System.out.println(text.charAt(2)); // 2번 index의 값 출력
		System.out.println(text.concat("s")); // 문자열 "s"를 오른쪽에 붙임
		System.out.println(text.contains("And")); // "And" 문자열을 포함하고 있는가? true
		System.out.println(text.equals(com)); // 두 문자열이 같은가? false
		System.out.println(text.equalsIgnoreCase(com)); // 대소문자 구별않고 같은가? true
		System.out.println(text.indexOf("a"));  // 문자열(or 문자)가 처음 발견된 위치, 없으면 -1 반환
		System.out.println(text.lastIndexOf("a")); // 가장 뒤쪽에서 발견된 위치, 없으면 -1 반환
		System.out.println(text.trim()); // 양쪽의 공백 지워주기
		System.out.println(text.length()); // 공백포함 길이
		System.out.println(text.substring(7)); // 7번째 이후의 문자열을 반환
		System.out.println(text.substring(7,11)); // index1부터 index2까지 반환
		System.out.println(text.replace(" ","-")); // replace(oldc,newc)는 oldc를 newc로 변환
		System.out.println(text.replaceAll(" ", "-")); // 똑같다고 봐도 됨
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		String[] sp = text.split(" "); // 괄호안의 문자를 기준으로 문자열을 잘라 배열로 만듬
		for(int i = 0; i<sp.length;i++) {
			System.out.println(i+"\t\t"+sp[i]+"\t\t"+sp[i].length());
		}
	}
}
