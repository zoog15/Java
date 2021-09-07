package kr.co.infopub.chapter.s091;

import java.io.IOException;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class BillboardTimeMain {
	public static void main(String[] args) {
		String newUrls = "https://www.billboard.com/charts/hot-100/";
		HttpGet request = new HttpGet(newUrls); // HttpClient를 이용하여
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		Document doc = null;
		
		try {
			httpClient = HttpClients.createDefault(); // 웹에 연결
			response = httpClient.execute(request); // 결과 얻기
			StringBuffer sb = new StringBuffer(); // 5000줄 정도 저장
			HttpEntity entity = response.getEntity();
			if(entity != null) { // 결과가 있다면 결과에서 한 줄씩
				String result = EntityUtils.toString(entity);
				sb.append(result); // 결과 저장
			}
			doc = Jsoup.parse(sb.toString()); // 전체 내용을 HTML파싱
			String id = "charts";
			Element eid = doc.getElementById(id); // 교유한 charts를 찾음
			String sdate = eid.attr("data-char-date"); // 속성값
			System.out.println("이번 빌보드 차트 날짜: "+sdate.trim());
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
