package lambda;

public class TestInterfaceEx implements TestInterface{
	public static void main(String[] args) {
		TestInterface t3 = (a, b) -> { System.out.println((a+b));};
	}
	@Override
	public int plusAandB(int a, int b) {
		return a+b;
	}
}
