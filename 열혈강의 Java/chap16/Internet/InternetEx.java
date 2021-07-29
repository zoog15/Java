package chap16.Internet;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class InternetEx {
	public static void main(String[] args) throws Exception {
		InputStream in = null;
		OutputStream out = null;
		
		URL url = new URL("http:\\www.freelec.co.kr");
		in = url.openStream();
		out = new FileOutputStream("ccc.txt");
		
		in.close();
		out.close();
	}
}
