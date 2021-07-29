package chap14.Exception;

public class ThrowsEx {
	public void doA() throws Exception{
		doB();
	}
	public void doB() throws Exception{
		doC();
	}
	public void doC() throws Exception{
		// Exception이 발생
	}
	
	public static void main(String[] args) throws Exception {
		ThrowsEx ex = new ThrowsEx();
		ex.doA();
	}
}
