package com.spring.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.member.service.MemberService;
import com.spring.member.service.MemberServiceImpl;
import com.spring.member.vo.MemberVO;

public class MemberControllerImpl extends MultiActionController implements MemberController{

	private MemberService memberService;
	// memberService 빈을 주입하기 위해 setter 구현
	public void setMemberService(MemberServiceImpl memberService) {
		this.memberService = memberService;
	}
	
	@Override
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		List<MemberVO> membersList = memberService.listMembers();
		ModelAndView mav = new ModelAndView(viewName);
		// 조회한 회원 정보를 ModelAndView의 addObject 메서드 이용해 바인딩
		mav.addObject("membersList",membersList);
		return mav;
	}

	@Override
	public ModelAndView addMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberVO memberVO = new MemberVO();
		// 회원 가입창에서 전송된 회원 정보를 bind 메서드 이용해 memberVO 해당 속성에 자동으로 설정
		bind(request, memberVO);
		int result = 0;
		result = memberService.addMember(memberVO);
		// 회원 정보 추가 후 ModelAndView 클래스의 redirect 속성을 이용해 /member/listMembers.do로 리다이렉트
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}

	@Override
	public ModelAndView removeMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		memberService.removeMember(id);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		return mav;
	}

	// 데이터베이스 연동 작업이 없는 입력창 요청시 뷰이름만 ModelAndView로 반환
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
	
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String fileName = uri.substring(begin, end);
		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));
		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
		}
		return fileName;
	}	
}
