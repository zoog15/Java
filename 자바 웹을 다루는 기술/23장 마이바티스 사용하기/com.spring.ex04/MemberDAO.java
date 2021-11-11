package com.spring.ex04;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.ex01.MemberVO;

public class MemberDAO {
	private static SqlSessionFactory sqlMapper = null;
	
	public static SqlSessionFactory getInstance() {
		if(sqlMapper == null) {
			try {
				// MemberDAO의 각 메서드 호출 시 src/mybatis/SqlMapConfig.xml에서 설정 정보 읽은 후 데이터베이스와의 연동 준비
				String resource = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				// 마이바티스 이용하는 sqlMapper 객체 가져옴
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return sqlMapper;
	}
	
	public List<MemberVO> selectAllMemberList() {
		sqlMapper = getInstance();
		// 실제 member.xml의 SQL문을 호출하는데 사용되는 SqlSession 객체 가져옴
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> memlist = null;

		
		// 여러 개의 레코드를 조회하므로 selectList() 메서드에 실행하고자 하는 SQL문의 id를 인자로 전달
		memlist = session.selectList("mapper.member.selectAllMemberList");
		
		return memlist;
	}
	
	public String selectName() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		// selectOne() 메서드로 인자로 지정한 SQL문을 실행한 후 한 개의 데이터(문자열)을 반환
		String name = (String)session.selectOne("mapper.member.selectName");
		return name;
	}
	
	public int selectPwd() {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int pwd = (int)session.selectOne("mapper.member.selectPwd");
		return pwd;
	}
	
	public MemberVO selectMemberById(String id) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		MemberVO memberVO = (MemberVO) session.selectOne("mapper.member.selectMemberById", id);
		return memberVO;
	}
	
	public List<MemberVO> selectMemberByPwd(int pwd){
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> membersList = null;
		membersList = session.selectList("mapper.member.selectMemberByPwd",pwd);
		return membersList;
	}
	
	public int insertMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = 0;
		result = session.insert("mapper.member.insertMember", memberVO);
		session.commit();
		return result;
	}
}
