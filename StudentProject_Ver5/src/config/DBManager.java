package config;

import java.sql.*;

public class DBManager implements DBConFig{

	private static DBManager instance = new DBManager();
	
	private Connection conn; 
	
	private DBManager() {
		try {
			Class.forName(DB_DRIVER);
			System.out.println("드라이버 연결완료");
			conn= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
			System.out.println("DB접속 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DBManager getInstance() {
		if(instance==null) {
			instance=new DBManager();
		} 
		return instance;
	}
	
	
	public Connection getConn() {
		return conn;
	}
	
	public void close(ResultSet rs, PreparedStatement pstmt) {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
