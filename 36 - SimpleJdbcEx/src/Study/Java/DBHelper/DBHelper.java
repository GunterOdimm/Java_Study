package Study.Java.DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	//데이터 베이스에 접속하기 위해선 누구나 접속 가능해야하니까 static
	//근데 누구도 그 값을 바꿔선 안되니까 final
	private static final String db_hostname = "localhost";
	private static final int db_portnumber = 3306;
	private static final String db_database = "myschool";
	private static final String db_charset = "utf8";
	private static final String db_usename = "root";
	private static final String db_password = "123qwe!@#";
	
	private Connection conn = null; //comd에서 sql로 진입한 상태를 의미 null로 초기화.
	
	//싱글톤 생성
	private static DBHelper current;
	public static DBHelper getInstance() {
		if (current == null){
			current = new DBHelper();
		}return current;
		
	}
	
	public static void freeinstance() {
		current = null;
	}
	private DBHelper() {
		
	}
	
	public Connection open() {
		//중복 실행되는 것을 방지
		//connection 객체가 null인 경우에만 처리하도록 if문을 구성
		if (conn == null) {
			//데이터 베이스 접속 처리
			//데이터 베이스 안에 값이 없어야 처리
			
			String urlFormat = "jdbc:mysql://%s:%d/%s?characterEncoding=%s";
			String url = String.format(urlFormat,db_hostname,db_portnumber,db_database,db_charset);
			
			
			try {
				//Mysql JDBC의 드라이버 클래스를 로딩해서 DriverManager클래스에 등록한다.
				Class.forName("com.mysql.jdbc.Driver");
				
				/*
				 * DriverManager 객체를 사용하여 DB에 접속한다.
				 *-->접속URL 아이디 비밀번호를 전달.
				 *-->DriverManager에 등록된 Driver 객체를 사용하여 DB에 접속 후,
				 *Connection 객체를 리턴받는다.
				 *--> import java.sql.DriverManager 필요
				 */
				conn = DriverManager.getConnection(url, db_usename,db_password);
				
				System.out.println("=== 데이터베이스 불러오기에 성공하였습니다. ===");
				
			} catch (ClassNotFoundException e) {
				
				System.out.println("=== 데이터베이스의 이름이 잘못되었습니다 확인하세요. ===");
				System.out.println(e.getMessage());
				e.printStackTrace();
				
			} catch (SQLException e) {
				System.out.println("=== 데이터베이스 호출에 실패하였습니다 ===");
				e.printStackTrace();
			}
		}
		return conn;
	}

	//데이터 베이스 접속 해제
	public void close() {
		if(conn != null) {
		//데이터 베이스 안에 값이있어야 처리
			
			try {
				conn.close();
				System.out.println("=== 데이터 베이스 종료에 성공하였습니다. ===");
			} catch (SQLException e) {
				System.out.println("=== 데이터베이스 종료에 실패하였습니다. ===");
				e.printStackTrace();
			}
			conn = null;
		
		}
	}
}
