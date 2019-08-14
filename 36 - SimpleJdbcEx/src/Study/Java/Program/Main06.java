package Study.Java.Program;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Study.Java.DBHelper.DBHelper;

public class Main06 {
	public static void main(String[] args) {
		String sql = "select profno, name, userid, position, sal, hiredate, comm, deptno from professor where name = '김도훈'";
		
		
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			  boolean first = rs.next();
	           if(first) {
	        	   
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
	            
	           	}else {
	           		System.out.println("조회 결과가 없습니다.");
	           	}
	           } catch (SQLException e) {
			System.out.println("MySQL SQL Fail" + e.getMessage());
			e.printStackTrace();
		} finally {
			if (rs != null) {
				
				try {
					rs.close();
				}catch (SQLException e) {
					
				}
			}
		}
		
		
		db.close();
		
	}


}
