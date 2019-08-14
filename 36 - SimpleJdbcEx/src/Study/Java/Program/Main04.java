package Study.Java.Program;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Study.Java.DBHelper.DBHelper;

public class Main04 {	
	public static void main(String[] args) {
	String sql = "DELETE FROM department where deptno=300";
	
	
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
	
	System.out.println(result + " 기록 삭제");
	
	
	db.close();
	
}


}
