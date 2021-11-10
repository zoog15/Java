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
	
	public ModelAndView memberInfo(HttpServletRequest request,
				HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		// 회원 가입창에서 전송된 회원 정보를 addObject() 메서드 이용해 ModelAndView 객체에 바인딩
		mav.addObject("id",id);
		mav.addObject("pwd",pwd);
		mav.addObject("name",name);
		mav.addObject("email",email);
		
		// memberInfo.jsp로 포워딩
		mav.setViewName("memberInfo");
		return mav;
	}	
}
