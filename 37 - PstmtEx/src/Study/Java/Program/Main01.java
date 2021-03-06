package Study.Java.Program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Study.Java.DBHelper.DBHelper;

public class Main01 {
	public static void main (String[] args) {
		//저장할 데이터와 SQL 구문 정의하기
		//저장할 데이터
		
		String dname = "정보통신학과";
		String loc = "공학관";
		
		String sql  = "insert into department (dname, loc) values(?,?)";
		
		//DBHelper를 통한 DB접속 처리
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		
		//SQL구문 실행하기
		//SQL 문의 템플릿을 사용하여 퀴리 실행을 준비하는 객체
		PreparedStatement pstmt = null;
		// 처리 결과를 받을 객체
		ResultSet rs = null;
		
		// 결과값(저장된 데이터의 수)
		int result = 0;
		// 결과값 (생성된 AUTO INCREMENT 값)
		int autoGeneratedID = 0;
		
		try {
			//pstmt 객체 할당 --> AUTO INCREMENT 조회 옵션 사용함.
			//import java.sql.Statement;
			
			pstmt = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			
			//템플릿에 데이터 설정
			pstmt.setString(1,  dname);
			pstmt.setString(2, loc);
			
			//SQL문 실행하기 --> 결과 행 리턴됨
			result = pstmt.executeUpdate();
			
			//생성된 AUTO INCREMENT 값 얻기
			rs = pstmt.getGeneratedKeys();
			rs.next();
			autoGeneratedID = rs.getInt(1);
			
		} catch (SQLException e) {
			System.out.println("MySQL 을 SQL 하는데 실패하였습니다 : "+ e.getMessage());
			e.printStackTrace();
		} finally {
			if(rs != null) {
				//객체 닫기
				try {
					rs.close();
				} catch (Exception e) {
				
				}
			}
			if(pstmt != null) {
				//객체 닫기
				try {
					pstmt.close();
				} catch (Exception e) {
					
				}
			}
		}
		
		System.out.println(result + "Record Insert");
		System.out.println("New Deptno= " + autoGeneratedID);
		
		db.close();
		
	}

}
