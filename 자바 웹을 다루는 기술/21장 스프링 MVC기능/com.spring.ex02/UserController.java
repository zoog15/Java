package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController{
	public ModelAndView login(HttpServletRequest request,
				HttpServletResponse response) throws Exception{
		String userID = "";
		String passwd = "";
		ModelAndView mav = new ModelAndView();
		request.setCharacterEncoding("utf-8");
		userID = request.getParameter("userID");
		passwd = request.getParameter("passwd");
		
		// ModelAndView에 로그인 정보 바인딩
		mav.addObject("userID",userID);
		mav.addObject("passwd",passwd);
		
		// ModelAndView 객체에 포워딩할 JSP 이름 설정
		mav.setViewName("result");
		
		return mav;
	}	
}
