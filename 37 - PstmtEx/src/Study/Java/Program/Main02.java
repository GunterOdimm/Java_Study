package Study.Java.Program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Study.Java.DBHelper.DBHelper;

public class Main02 {
	public static void main (String[] args) {
		// 삭제할 데이터와 SQL구문 정의하기
		// 삭제할 데이터
		int deptno = 301;
		
		//department 테이블에서 301번 학과를 삭제하기 위한 SQL 템플릿
		String sql = "delete from department where deptno = ?";
		
		//DBHelper를 통한 DB 접속 처리
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		
		PreparedStatement pstmt = null;
		
		int result = 0;
		
		//pstmt 객체 할당
		//AUTO INCREMENT 값을 받을 필요가 없기 때문에 옵션을 성정하지 않는다.
		//--> inset 처리와 비교해볼것
		try {
			
			pstmt = conn.prepareStatement(sql);
			
			//템플릿에 데이터 설정
			pstmt.setInt(1,deptno);
			
			// SQL문 실행하기 --> 결과 행 리턴됨
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("MySQL SQL Fail : " + e.getMessage());
			e.printStackTrace();
		}finally{
			if(pstmt != null) {
				//객체 닫기
				try {
					pstmt.close();
				} catch (SQLException e) {
					
				}
			}
		}
		System.out.println(result + "결과 삭제");
		
		db.close();
	}

}
