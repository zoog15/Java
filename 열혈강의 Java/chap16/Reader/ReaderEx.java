package chap16.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("eee.txt");
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();
		reader.close();
	}
}
