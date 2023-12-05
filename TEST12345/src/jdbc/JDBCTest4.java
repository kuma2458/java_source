package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest4 {

	public static void main(String[] args) {
		//학생정보 1건을 삽입하는 JDBC 작성
		//학생 정보를 직접 입력 받은 값으로 삽입
		try (Scanner sc =new Scanner(System.in)){
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver 접속");
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kimdonghyun","7587");
			System.out.println("DB 접속");
			System.out.println("학생정보 입력....");
			System.out.print("학번 : ");
			String st_no = sc.nextLine();
			System.out.print("이름 : ");
			String st_name = sc.nextLine();
			System.out.print("학점 : ");
			double st_score = sc.nextDouble();
			System.out.print("학과번호 : ");
			int major_no = sc.nextInt();
			sc.nextLine();
//			String sql="Insert into student values('"+st_no+"','"+st_name+"',"+st_score+","+major_no+")";
//			String sql1=String.format("Insert into student values('%s','%s',%f,%d)", st_no,st_name,st_score,major_no);
			String sql = "insert into student values(?,?,?,?)";
			System.out.println(sql);
			PreparedStatement pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, st_no);
			pstmt.setString(2, st_name);
			pstmt.setDouble(3, st_score);
			pstmt.setInt(4, major_no);
			int count = pstmt.executeUpdate();
			System.out.println(count);
			
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
