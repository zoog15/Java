package kr.co.infopub.chapter.s065;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/** 
 * 1. Object의 getClass() 메서드는 Class를 반환
 * 2. Class는 해당 클래스의 선언된 메서드와 생성자들을 반환하는 메서드를 제공
 * 3. getDeclaredConstructors()는 선언한 생성자, getMethods()ㄴ는 선언된 메서드를 제공
 * 4. Class는 모든 객체에 대한 자신의 정보(생성자, 메서드 관련) 등을 제공. 이를 Reflection이라고 함
 * */
public class UsingClass {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Class classes = obj1.getClass(); // 클래스에 대한 모든 정보는 java.lang.Class를 이용
		System.out.println(classes.getName()); //  클래스 이름
		System.out.println("--------constructor----------");
		// 생성자의 모든 정보는 java.lang.reflect.Constructor를 이용해 받음. 모든 생성자를 받으니 배열로 받음
		Constructor[] constructor = classes.getDeclaredConstructors(); // 클래스의 모든 생성자를 리턴
		for(Constructor con: constructor) { 
			System.out.println(con.getName());
		}
		System.out.println("--------Method------------");
		// 클래스의 모든 메서드를 리턴. 배열로 받음
		Method[] method = classes.getMethods();
		for(Method me: method) {
			System.out.println(me.getName());
		}
		
	}
}
