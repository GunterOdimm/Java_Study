package Study.Java.Program;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Study.Java.DBHelper.DBHelper;

public class Main05 {
	public static void main(String[] args) {
		String sql = "select count(studno) from student where grade = 4";
		
		
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			  boolean first = rs.next();
	           if(first) {
	             int conunt = rs.getInt(1);//무조건 1부터 카운트한다 0부터 카운트하는게 아니다
	             
	             System.out.println("4학년 학생은" + conunt + "명 입니다.");
			
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
