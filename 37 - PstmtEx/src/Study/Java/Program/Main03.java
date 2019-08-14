package Study.Java.Program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Study.Java.DBHelper.DBHelper;

public class Main03 {
	public static void main(String[] args) {
		// 조회할 검색어와 SQL 구문 정의하기
		String keyword = "김도훈";
		// department 테이블에서 301번 학과를 삭제하기 위한 SQL 템플릿
		String sql = "select profno, name, userid, position, sal, hiredate, comm, deptno from professor where name = ?";

		// DBHelper를 통한 DB 접속 처리
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();

		PreparedStatement pstmt = null;

		ResultSet rs = null;

		try {
			//SQL 문을 싱행할 수 있는 객체 생성
			//AUTO INCREMENT 값을 받을 필요가 없기 때문에 옵션을 설정하지 않는다.
			// --> insert처리와 비교해보자
			pstmt = conn.prepareStatement(sql);
			
			// 템플릿에 데이터 설정
			pstmt.setString(1, keyword);

			//SQL문 실행하기 --> ResultSet 리턴됨
			rs = pstmt.executeQuery();

			//조회 결과의 첫 번쨰 줄로 이동
			boolean first = rs.next();

			if (first) {
				//select 절에 명시한 컬럼 이름을 사용하여 데이터 추출
				   
	        	 int profNo = rs.getInt("profno");
	        	 String name = rs.getString("name");
	        	 String userId = rs.getString("userid");
	        	 String position = rs.getString("position");
	        	 int sal = rs.getInt("sal");
	        	 String hiredate = rs.getString("hiredate");
	        	 int comm = rs.getInt("comm");
	        	 int deptno = rs.getInt("deptno");
	        	 
	        	 System.out.printf("교수번호 : %d\n", profNo);
	        	 System.out.printf("이름 : %s\n", name);
	        	 System.out.printf("아이디 : %s\n", userId);
	        	 System.out.printf("직급 : %s\n",position);
	        	 System.out.printf("급여 : %d\n", sal);
	        	 System.out.printf("입사일 : %s\n", hiredate);
	        	 System.out.printf("보직수당 : %d\n", comm);
	        	 System.out.printf("학과번호 : %d\n", deptno);
	            
			} else {
				System.out.println("조회결과가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("MySQL SQL Fail : " + e.getMessage());
			e.printStackTrace();
		}finally {
			if (rs != null) {
				
				try {
					rs.close();
				}catch (SQLException e) {
					
				}
			} if (pstmt != null) {
				//객체 닫기
				try {
					pstmt.close();
				}catch (SQLException e) {
					
				}
				}
			}
		db.close();
	}

}
