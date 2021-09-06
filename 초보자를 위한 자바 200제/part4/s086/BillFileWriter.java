package kr.co.infopub.chapter.s086;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import kr.co.infopub.chapter.s084.Billboard;

public class BillFileWriter {
	public static void main(String[] args) {
		Billboard b1 = new Billboard(1,"Despacito",1,
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg","luis fonsi");
		Billboard b2 = new Billboard(2,"That's What I Like",2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg","bruno mars");
		Billboard b3 = new Billboard(3,"I'm The One",3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg","dj khaled");
		
		ArrayList<Billboard> bblist = new ArrayList<>();
		bblist.add(b1);
		bblist.add(b2);
		bblist.add(b3);
		
		File f = new File("billboard");
		// 디렉토리가 존재하지 않으면 생성
		if(!f.exists()) { f.mkdirs();}
		// PrintWriter 구문은 finally를 사용하지 않고 {} 를 끝내면 자동으로 PrintWriter close, 파일 저장
		// billboard 폴더에 bill.txt가 이미 있으면 내용을 전부 지우고 다시 생성(false)
		try(PrintWriter pw = new PrintWriter(new FileWriter("billboard\\bill.txt",false),true)){
			for(Billboard bb : bblist) {
				pw.println(bb);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
