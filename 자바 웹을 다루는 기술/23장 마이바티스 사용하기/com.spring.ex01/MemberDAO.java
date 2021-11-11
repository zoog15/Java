package com.spring.ex01;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
	
	public List<HashMap<String, String>> selectAllMemberList() {
		sqlMapper = getInstance();
		// 실제 member.xml의 SQL문을 호출하는데 사용되는 SqlSession 객체 가져옴
		SqlSession session = sqlMapper.openSession();
		//List<MemberVO> memlist = null;
		List<HashMap<String, String>> memlist = null;
		
		// 여러 개의 레코드를 조회하므로 selectList() 메서드에 실행하고자 하는 SQL문의 id를 인자로 전달
		memlist = session.selectList("mapper.member.selectAllMemberList");
		
		return memlist;
	}
}
