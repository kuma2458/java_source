package vo;

import java.util.Objects;

public class StudentVO {
	// 학번, 이름, 학과명, 평점
	private int rankno;
	public int getRankno() {
		return rankno;
	}

	public void setRankno(int rankno) {
		this.rankno = rankno;
	}

	private String stNo;
	private String stName;
	private String major_name;
	private double score;
	private int major_no;
	
	public StudentVO(int rankno, String stNo, String stName, String major_name, double score) {
		super();
		this.rankno = rankno;
		this.stNo = stNo;
		this.stName = stName;
		this.major_name = major_name;
		this.score = score;
	}

	public StudentVO(int rankno, String stNo, String stName, double score, int major_no) {
		super();
		this.rankno = rankno;
		this.stNo = stNo;
		this.stName = stName;
		this.score = score;
		this.major_no = major_no;
	}

	public StudentVO(String stNo, String stName,double score, int major_no) {
		super();
		this.stNo = stNo;
		this.stName = stName;
		this.major_no = major_no;
		this.score = score;
	}

	public StudentVO(String stNo, String stName, String major_name, double score) {
		super();
		this.stNo = stNo;
		this.stName = stName;
		this.major_name = major_name;
		this.score = score;
	}

	public String getStNo() {
		return stNo;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getMajor_name() {
		return major_name;
	}

	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}

	public int getMajor_no() {
		return major_no;
	}

	public void setMajor_no(int major_no) {
		this.major_no = major_no;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("%d,%s,%s,%s,%.2f,%d", rankno, stNo,stName,major_name,score,major_no);
	}


}
