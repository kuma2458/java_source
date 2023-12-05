package jdbc;

import java.sql.*;

public class JDBCTEST1 {

	public static void main(String[] args) {
		try {
			//1.Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			System.out.println("드라이버 로딩 완료");
			//2. DB Connect
			Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kimdonghyun","7587");
		System.out.println("DB접속 완료");	
		
		//3. SQL Generate
		String sql = "select * from student "; //명령어
		//4. Statement Create
		Statement stmt = conn.createStatement();
		
		//5. SQL Execute
//		stmt.execute(sql);
		ResultSet rs = stmt.executeQuery(sql);

		//6. Result Print
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString("st_name")+" "+
		rs.getInt(3)+ " " + rs.getDouble("st_score"));// getstring에 들어가는 숫자는 열 번호(1부터 시작)

		}
		//7. close
		rs.close();
		stmt.close();
		conn.close();
		}	
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
}
