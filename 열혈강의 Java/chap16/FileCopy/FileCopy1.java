package chap16.FileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy1 {
	public static void main(String[] args) throws Exception {
		//읽어들일 수 잇는 스트림과 출력 가능한 스트림 준비
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\JavaTxt\\aaa.txt");
			out = new FileOutputStream("copy.txt"); // 프로젝트 안에 가보면 생성됨
			
			while(true) {
				int data = in.read();
				if(data == -1) {
					break;
				}
				out.write(data); // 파일에 데이터가 복사되었음
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ( in != null) {
				try { in.close(); } catch(Exception e) {}
			}
			if ( out != null) {
				try { out.close(); } catch(Exception e) {}
			}
		}
	}
}
