package config;

public interface DBConFig {
	//드라이버 클래스
	public static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	//URL
	public static final String DB_URL= "jdbc:oracle:thin:@localhost:1521:xe";
	//ID
	public static final String DB_USER = "kimdonghyun";
	//PASSWORD
	public static final String DB_PASSWD = "7587";
}
