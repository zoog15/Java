package sec02.ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
//	private static final String driver = "oracle.jdbc.driver.OracleDriver";
//	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
//	private static final String user = "scott";
//	private static final String pwd = "tiger";
	private Connection con;
	private Statement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			// JNDI에 접근하기 위해 기본 경로 지정
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			// 톰캣 context.xml에 설정한 name 값인 jdbc/oracle을 이용해 톰캣이 미리 연결한 DataSource 받아옴
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<MemberVO> listMembers(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
//			connDB();
			con = dataFactory.getConnection();
			String query = "select * from t_member";
			System.out.println("prepareStatement: " + query);
			// prepaerStatement() 메서드에서 SQL문을 전달해 PreparedStatement 객체 생성
			pstmt = con.prepareStatement(query);
			// executeQuery() 메서드를 호출해 미리 설정한 SQL문 실행
			ResultSet rs = pstmt.executeQuery(query);
			
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

//	private void connDB() {
//		try {
//			Class.forName(driver);
//			System.out.println("Oracle 드라이버 로딩 성공");
//			con = DriverManager.getConnection(url, user, pwd);
//			System.out.println("Connection 생성 성공");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
