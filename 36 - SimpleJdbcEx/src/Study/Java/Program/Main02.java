package Study.Java.Program;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Study.Java.DBHelper.DBHelper;

public class Main02 {
	public static void main(String[] args) {
		// department 테이블에 `컴퓨터정보과`추가하기위한 SQL
		String sql = "INSERT INTO department (deptno, dname, loc) " + "VALUES (300, '컴퓨터정보과', '5호관')";
		
		// DBHelper 를 이용한 DB접속 처리
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		// SQL구문 실행하기.
		// SQL 문을 실행할 수 있는 객체
		Statement stmt = null;
		// 결과값(저장된 데이터의 수)
		int result = 0;
		
		try {
			// SQL문을 실행할 수 있는 객체 생성(예외처리 요구됨)
			stmt = conn.createStatement();
			// SQL문 실행하기 --> 결과 행 리턴됨 (예외처리 요구됨)
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("MySQL SQL Fail" + e.getMessage());
			e.printStackTrace();
		} finally {
			//SQL 구문의 에러 여부에 상관 없이 stmt 객체를 닫기 위하여 finally 블록 사용.
			//--> 갹체의 유효범위 설정을 위해서 stmt 객체는 try 블록 밖에 선언되었다.
			if (stmt != null) {
				
				try {
					stmt.close();
				}catch (SQLException e) {
					
				}
			}
		}
		
		System.out.println(result + " Record Insert");
		
		
		db.close();
		
	}

}
