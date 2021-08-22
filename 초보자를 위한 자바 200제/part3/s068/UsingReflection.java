package kr.co.infopub.chapter.s068;

// Class에서 생성자와 메서드의 정보 찾기 위해 'java.lang.reflect' 패키지의 생성자, 메서드를 import
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 리플렉션을 이용하면 클래스에 대한 생성자와 메서드 등에 대한 정보를 얻을 수 있음
 * */
public class UsingReflection {

	// 제한자(modifier)가 정수이므로 switch ~ case를 이용해 정수에 대한 문자열로 반환
	public static String toModi(int n) {
		String s = "";
		switch(n) {
			case 0 : s=" "; break;
			case 1 : s="public "; break;
			case 2 : s="private "; break;
			case 4 : s="protected "; break;
			case 8 : s="static "; break;
			case 10 : s="private static ";break;
			case 9 : // break 만날 떄까지 다음 case도 실행(fall through 현상)
			case 137 : s="public static "; break;
			case 17 : s="public final "; break;
			case 257 : s="public native "; break;
			case 260 : s="protected native "; break;
			case 273 : s="public final native "; break;
			default : s="xxxx"; break;
		}
		return s;
	}

	public static String toRe(String msg) {
		String s = "";
		if(msg.indexOf("[") != -1) { // 아규먼트나 리턴 타입에 "["가 있다면 배열
			if(msg.contains("[C")) { // "[C" = char[]
				s = msg.substring(msg.indexOf(" ")+1).trim();
				s = s.replace("[C", "char[]");
			} else if(msg.contains("[L")) { // "[L" = java.lang.String[]
				s = msg.substring(msg.indexOf(" ")+1).trim();
				s = s.replace("[L", "").replace(";", "");
				s = s.concat("[]");
			} else if(msg.contains("[B")) { // "[B" = byte[]
				s= msg.substring(msg.indexOf(" ")+1).trim();
				s = s.replace("[B","byte[]");
			}
		} else if(msg.indexOf(" ") != -1) {
			s = msg.substring(msg.indexOf(" ")+1).trim();
		} else {
			s = msg.trim();
		}
		return s;
	}

	public static void main(String[] args) {
		Object obj1 = new Object();
		try {
			// Class classes = obj1.getClass();
			Class classes = Class.forName("java.lang.String");
			// ClassNotFoundException
			System.out.println("-----------Method 찾기-------------");
			Method[] mes = classes.getDeclaredMethods(); // 모든 메서드를 얻음
			for(Method me : mes) {
				if(me.getModifiers()>4000) {continue;} // 4000 초과면 다음 스텝
				System.out.printf("%s\t",toModi(me.getModifiers())); // 제한자 종류
				System.out.printf("%-30s\t",toRe(me.getReturnType().toString()));
				System.out.printf("%s",me.getName()); // 클래스 이름
				System.out.printf("(",""); // 2개 이상일 때 ,로 표시
				Class[] aa = me.getParameterTypes(); // 아규먼트(인자, 파라미터)
				for(int j = 0; j<aa.length; j++) {
					System.out.printf("%s",toRe(aa[j].getName())); // 아규먼트 이름
					if(j != aa.length-1) { // 2개 이상이면
						System.out.print(",");
					}
				}
				System.out.printf(")","");
				System.out.println();
			}
			System.out.println("--------------생성자 찾기-----------------");
			Constructor[] constructor = classes.getDeclaredConstructors(); // 모든 생성자 얻음
			for(Constructor con: constructor) {
				System.out.print(con.getName());
				System.out.printf("(","");
				Class[] aa = con.getParameterTypes();
				for(int j = 0; j<aa.length; j++) {
					System.out.printf("%s",toRe(aa[j].getName()));
					if(j!=aa.length-1) {
						System.out.print(",");
					}
				}
				System.out.printf(")","");
				System.out.println();
			}
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
