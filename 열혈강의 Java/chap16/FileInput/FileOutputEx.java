package chap16.FileInput;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputEx {
	public static void main(String[] args) throws Exception{
		OutputStream out = null;
		try {
			out = new FileOutputStream("aaa.txt");
			String str = "이 문자열을 파일에 기록하고 싶습니다.";
			byte[] arr = str.getBytes();
			out.write(arr);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
				}catch(Exception e) {
				}
			}
		}
	}
}
