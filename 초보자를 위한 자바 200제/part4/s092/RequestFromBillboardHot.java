package kr.co.infopub.chapter.s092;

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

public class RequestFromBillboardHot {
	String result;
	
	public void getAllHtml(String newUrls) {
		HttpGet request = new HttpGet(newUrls); // HttpGet 생성
		// 자동 finally 처리용
		try(CloseableHttpClient httpClient = HttpClients.createDefault();
					CloseableHttpResponse response = httpClient.execute(request)){
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				result = EntityUtils.toString(entity);
			}
		} catch (IOException e) {
			System.out.println("Billboard Parsing error !!! ");
		}
	}
	
	public void printHtml() {
		System.out.println(result);
	}
	
	public String getTimeDate(String aurl) {
		String newUrls = "https://www.billboard.com/charts/hot-100/";
		HttpGet request = new HttpGet(newUrls);
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		Document doc = null;
		String sdate = "";
		try {
			httpClient = HttpClients.createDefault();
			response = httpClient.execute(request);
			StringBuffer sb = new StringBuffer();
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String result = EntityUtils.toString(entity);
				sb.append(result);
			}
			doc = Jsoup.parse(sb.toString());
			String id = "charts";
			Element eid = doc.getElementById(id);
			sdate = eid.attr("data-chart-date");
		} catch(IOException e) {
			System.out.println("Billboard Parsing error !!!");
		}
		return sdate != null?
				RestDay.todate(sdate) : RestDay.todate();
	}
	
	public static void main(String[] args) {
		RequestFromBillboardHot rfw = new RequestFromBillboardHot();
		String a = "https://www.billboard.com/charts/hot-100/";
		String rs = rfw.getTimeDate(a);
		System.out.println("이번 주"+rs);
		rfw.getAllHtml(a+rs); // hot-100 html 읽어 문자열로 저장
		rfw.printHtml(); // 저장한 내용 출력
	}
}
