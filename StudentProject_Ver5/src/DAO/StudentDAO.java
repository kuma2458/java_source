package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import config.DBManager;
import vo.StudentVO;

public class StudentDAO {

	private static StudentDAO instance = new StudentDAO();
	
	private StudentDAO() {
		
	}
	
	

	public static StudentDAO getInstance() {
		if(instance==null)
			instance = new StudentDAO();
		return instance;
	}



	public int insertStudent(StudentVO studentVO) {
		//student 테이블에 데이터 등록
		String sql = "insert into student values(?,?,?,?)";
		int count=0;
		try {
			PreparedStatement pstmt = DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, studentVO.getStNo());
			pstmt.setString(2, studentVO.getStName());
			pstmt.setDouble(3, studentVO.getScore());
			pstmt.setInt(4, studentVO.getMajor_no());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("이미 등록된 학번이 있습니다");
		}
		return count;
	}



	public ArrayList<StudentVO> getDBList() {
		ArrayList<StudentVO> list= new ArrayList<StudentVO>();
		String sql="select s.st_no,s.st_name,m.major_name,s.st_score from student s join major m on s.major_no=m.major_no";
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				String stNo=rs.getString(1);
				String stName=rs.getString(2);
				String major_name=rs.getString(3);
				double score=rs.getDouble(4);
				list.add(new StudentVO(stNo, stName, major_name, score));
//				list.add(new StudentVO(rs.getString(1), rs.getString(2),rs.getString(3) ,rs.getDouble(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}



	public StudentVO searchstudent(String stNo2) {
		StudentVO sv = null;
		String sql="select s.st_no,s.st_name,m.major_name,s.st_score from student s join major m on s.major_no=m.major_no where s.st_no like ?";
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, stNo2);
			ResultSet rs= pstmt.executeQuery();
			if(rs.next()) {
				String stNo=rs.getString(1);
				String stName=rs.getString(2);
				String major_name=rs.getString(3);
				double score=rs.getDouble(4);
				sv= new StudentVO(stNo, stName, major_name, score);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sv;
	}



	public ArrayList<StudentVO> searchname(String stName) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		String sql="select s.st_no,s.st_name,m.major_name,s.st_score from student s join major m on s.major_no=m.major_no where s.st_name like ?";
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, "%"+stName+"%");
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				String stNo=rs.getString(1);
				String stName2=rs.getString(2);
				String major_name=rs.getString(3);
				double score=rs.getDouble(4);
				list.add(new StudentVO(stNo, stName2, major_name, score));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}



	public int editStudentVo(StudentVO vo) {
		String sql="update student set st_name = ? , st_score = ? , major_no  = ? "
				+ "where st_no like ?";
		int count = 0;
		System.out.println(1);
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			System.out.println(2);
			pstmt.setString(1, vo.getStName());
			System.out.println(3);
			pstmt.setDouble(2, vo.getScore());
			System.out.println(4);
			pstmt.setInt(3, vo.getMajor_no());
			System.out.println(5);
			pstmt.setString(4, vo.getStNo());
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}



	public int deletestudent(String stNo) {
		String sql="delete from student where st_no like ?";
		int count = 0;
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setString(1, stNo);
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}



	public ArrayList<StudentVO> firstrank() {
//		ArrayList<StudentVO> list =new ArrayList<StudentVO>();
//		String sql="SELECT * FROM (SELECT RANK( ) OVER(ORDER BY S.ST_SCORE DESC)AS RANKING,s.st_no,s.st_name,m.major_name,s.st_score FROM STUDENT s join MAJOR m on s.major_no =m.major_no)  WHERE RANKING <=?";
//		try {
//			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
//			pstmt.setInt(1, 10);
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				String stNo=rs.getString(2);
//				String stName=rs.getString(3);
//				String major_name=rs.getString(4);
//				double score =rs.getDouble(5);
//				list.add(new StudentVO(stNo, stName, major_name, score));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
		ArrayList<StudentVO> list =new ArrayList<StudentVO>();
		String sql="SELECT * FROM (SELECT RANK( ) OVER(ORDER BY S.ST_SCORE DESC)AS RANKING,s.st_no,s.st_name,m.major_name,s.st_score FROM STUDENT s join MAJOR m on s.major_no =m.major_no)  WHERE RANKING <=?";
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setInt(1, 10);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int rank=rs.getInt(1);
				String stNo=rs.getString(2);
				String stName=rs.getString(3);
				String major_name=rs.getString(4);
				double score =rs.getDouble(5);
				list.add(new StudentVO(rank, stNo, stName, major_name, score));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}



	public ArrayList<Integer> ranklist() {
		ArrayList<Integer> list =new ArrayList<Integer>();
		String sql="SELECT * FROM (SELECT RANK( ) OVER(ORDER BY S.ST_SCORE DESC)AS RANKING,s.st_no,s.st_name,m.major_name,s.st_score FROM STUDENT s join MAJOR m on s.major_no =m.major_no)  WHERE RANKING <=?";
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setInt(1, 10);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int i = rs.getInt(1);
				list.add(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}



	public TreeMap<Integer, ArrayList<StudentVO>> firstrankmap() {
		TreeMap<Integer, ArrayList<StudentVO>> map =new TreeMap<Integer, ArrayList<StudentVO>>();
		String sql="SELECT * FROM (SELECT RANK( ) OVER(ORDER BY S.ST_SCORE DESC)AS RANKING,s.st_no,s.st_name,m.major_name,s.st_score FROM STUDENT s join MAJOR m on s.major_no =m.major_no)  WHERE RANKING <=?";
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			pstmt.setInt(1, 10);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int rank=rs.getInt(1);
				String stNo=rs.getString(2);
				String stName=rs.getString(3);
				String major_name=rs.getString(4);
				double score =rs.getDouble(5);
				ArrayList<StudentVO> list = map.get(rs.getInt(1));
				if(list==null) {
					list=new ArrayList<StudentVO>();
					map.put(rs.getInt(1), list);
				}
				list.add(new StudentVO(stNo, stName, major_name, score));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}



	public ArrayList<String> getmajorlist() {
		ArrayList<String> majorlist= new ArrayList<String>();
		String sql="select major_no ||' - ' || major_name from major m ";
		try {
			PreparedStatement pstmt=DBManager.getInstance().getConn().prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				String major_name=rs.getString(1);
				majorlist.add(major_name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return majorlist;
	}

	
	
	
}
