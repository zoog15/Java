package chap15.Stack;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0; i<100; i++) {
			s.push(i);
		}
		System.out.println(s);
		for(int i = 0; i<100; i++) {
			System.out.println(s.pop());
		}
	}
}
