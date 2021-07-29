package chap15.ArrayList;

import java.util.ArrayList;

public class SampleObjTest {
	public static void main(String[] args) {
		SampleObj obj1 = new SampleObj("객체1");
		SampleObj obj2 = new SampleObj("객체2");
		SampleObj obj3 = new SampleObj("객체3");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		ArrayList<SampleObj> list = new ArrayList<SampleObj>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		System.out.println(list);
		SampleObj target = new SampleObj("객체3");
		
		int index = list.indexOf(target);
		System.out.println("원하는 객체의 위치는 : " + index);
	}	
}
