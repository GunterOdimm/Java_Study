package Study.Java.Program;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Study.Java.DBHelper.DBHelper;

public class Main07 {
	public static void main(String[] args) {
		String sql = "select deptno,dname,loc from department order by deptno ASC";
		
		
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int deptNo = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.printf("학과번호 : %d\n", deptNo);
				System.out.printf("학과이름 : %s\n", dname);
				System.out.printf("위치 : %s\n", loc);
				System.out.println();
			}
	           	}
	            catch (SQLException e) {
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
