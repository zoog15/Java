package sec03.ex01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class EncoderFilter implements Filter {
	ServletContext context;
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("utf-8 인코딩");
		context = fConfig.getServletContext();
	}
	

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter 호출");
		request.setCharacterEncoding("utf-8");
		// 웹 어플리케이션의 컨텍스트 이름 가져옴
		String context = ((HttpServletRequest)request).getContextPath();
		// 웹 브라우저에 요청한 요청 URI 가져옴
		String pathinfo = ((HttpServletRequest)request).getRequestURI();
		// 요청 URI의 실제 경로 가져옴
		// String realPath = request.getRealPath(pathinfo); // depriciated 됨
		String realPath = request.getServletContext().getRealPath(pathinfo);
		
		String mesg = "Context 정보:" + context + "\n URI 정보 : " + pathinfo + "\n 물리적 경로: " + realPath;
		
		System.out.println(mesg);
		// 요청 필터에서의 요청 처리 전의 시각 구함
		long begin = System.currentTimeMillis();
		// 다음 필터로 넘기는 작업을 수행
		chain.doFilter(request, response);
		
		// 응답 필터에서 요청 처리후의 시각을 구함
		long end = System.currentTimeMillis();
		System.out.println("작업 시간:" + (end-begin) + "ms");
	}

	public void destroy() {
		System.out.println("destroy 호출");
	}
}
