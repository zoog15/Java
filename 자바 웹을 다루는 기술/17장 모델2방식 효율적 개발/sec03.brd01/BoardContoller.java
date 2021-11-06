package sec03.brd01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/*")
public class BoardContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BoardService boardService;
	ArticleVO articleVO;
	
	public void init() throws ServletException{
		// 서블릿 초기화 시 BoardService 객체를 생성
		boardService = new BoardService();
	}
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}


	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "";
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		// 요청명 가져오기
		String action = request.getPathInfo();
		System.out.println("action:" + action);
		try {
			List<ArticleVO> articlesList = new ArrayList<ArticleVO>();
			if (action == null) {
				articlesList = boardService.listArticles();
				request.setAttribute("articlesList", articlesList);
				nextPage = "/board01/listArticles.jsp";
			} else if (action.equals("/listArticles.do")) { // 전체 글 조회
				articlesList = boardService.listArticles();
				// 조회된 글 목록을 articlesList로 바인딩한 후 listArticles.jsp로 포워딩
				request.setAttribute("articlesList", articlesList);
				nextPage = "/board01/listArticles.jsp";
			}
			RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
			dispatch.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
