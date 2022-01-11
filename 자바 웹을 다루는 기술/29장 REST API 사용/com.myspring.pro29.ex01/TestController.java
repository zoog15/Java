package com.myspring.pro29.ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/*")
public class TestController {
	// /hello 요청 시 브라우저로 문자열을 전송
	@RequestMapping("/hello")
	public String hello() {
		return "Hello REST!!";
	}

	// MmeberVO 객체의 속성 값을 저장한 후 JSON으로 전송
	@RequestMapping("member")
	public MemberVO member() {
		MemberVO vo = new MemberVO();
		vo.setId("hong");
		vo.setPwd("1234");
		vo.setName("홍길동");
		vo.setEmail("hong@test.com");
		return vo;
	}

	// MemberVO 객체를 10개 생성해 ArrayList에 저장한 뒤 JSON으로 전송
	@RequestMapping("/membersList")
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("hong" + i);
			vo.setPwd("123" + i);
			vo.setName("홍길동" + i);
			vo.setEmail("hong" + i + "@test.com");
			list.add(vo);
		}
		
		return list;
	}
	
	@RequestMapping("/membersMap")
	public Map<Integer, MemberVO> membersMap() {
		// MemberVO 객체를 저장할 HashMap 객체 생성
		Map<Integer, MemberVO> map = new HashMap<Integer, MemberVO>();
		for (int i = 0; i < 10; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("hong" + i);
			vo.setPwd("123" + i);
			vo.setName("홍길동" + i);
			vo.setEmail("hong" + i + "@test.com");
			map.put(i,  vo);
		}
		
		return map;
	}
	
	@RequestMapping(value="/notice/{num}", method = RequestMethod.GET)
	public int notice(@PathVariable("num") int num) throws Exception {
		return num;
	}
}
