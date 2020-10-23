package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelect02 {

	//테이블 정보
//	create table member(
//	    id varchar2(30) primary key,
//	    pw varchar2(30),
//	    name varchar2(30),
//	    email varchar2(30)
//	);
//
//	insert into member values ('test01', '1234', '홍길동', 'naver');
//	insert into member values ('test02', '1234', '이순신', 'naver');
//	insert into member values ('test03', '1234', '홍길자', 'google');
//
//
//	commit;
	
	public static void main(String[] args) {
		
		
		//1. 필요한 변수 선언
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "user01";
		String upw = "user01";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //결과를 받아올 용도
		
		String sql = "select * from member where name = ?";
		
		//2. try~catch에서 연결객체 생성
		try {
			//2. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3. 커넥션 생성 - 실행했다 >> 받아온다
			conn = DriverManager.getConnection(url, uid, upw);
			//4. sql문 전달객체 생성 - 
			pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, "홍길자"); //> ? 를 채워주자
			
			//5. sql문 실행
			rs = pstmt.executeQuery(); //rs로 반환받기
			
			//6. 결과객체 처리
			while(rs.next()) {
				System.out.println("name: " + rs.getString("id"));
				System.out.println("pw: " + rs.getString("pw"));
				System.out.println("name: " + rs.getString("name"));
				System.out.println("email: " + rs.getString("email"));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//실행한 외부 자원들을 모두 종류
			try {
				conn.close();
				rs.close();
				pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}













































