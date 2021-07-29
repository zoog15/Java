package chap16.Writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
	public static void main(String[] args) throws Exception {
		String str = "이 문자열을 기록할 겁니다.\n";
		Writer writer = new FileWriter("eee.txt");
		writer.write(str); // 문자열 기록
		writer.close();  
	}
}
