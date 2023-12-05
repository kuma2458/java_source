package config;

import java.sql.*;

public class JDBCTest5  {

	public static void main(String[] args) {
		//car 테이블에서 상품 금액이 5000이상인 데이터를 조회해서 출력
		//DBManager, PreparedStatement 이용
		try {
			//1.driver 연결
			//3.sql문 작성
			String sql = "select * from CAR where CAR_PRICE >= ?";
			//4. statement 작성
			Connection conn = DBManager.getInstance().getConn();
			PreparedStatement pstmt=conn.prepareStatement(sql);
			//5. sql문 넣어서 실행 한결과 저장
			pstmt.setInt(1, 5000);
			ResultSet rs = pstmt.executeQuery();
			//6. 출력
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+""+rs.getInt("car_make_year")+
						" "+rs.getInt("CAR_PRICE")+" "+rs.getString("CAR_MAKER_CODE"));
			}
			DBManager.getInstance().close(rs, pstmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
