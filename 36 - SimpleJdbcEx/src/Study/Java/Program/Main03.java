package Study.Java.Program;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Study.Java.DBHelper.DBHelper;

public class Main03 {
	public static void main(String[] args) {
		String sql = "UPDATE department SET loc='6호관' WHERE deptno=300";
		
		
		DBHelper db = DBHelper.getInstance();
		Connection conn = db.open();
		
		Statement stmt = null;
		
		int result = 0;
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("MySQL SQL Fail" + e.getMessage());
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				
				try {
					stmt.close();
				}catch (SQLException e) {
					
				}
			}
		}
		
		System.out.println(result + " Record Update");
		
		
		db.close();
		
	}

}
