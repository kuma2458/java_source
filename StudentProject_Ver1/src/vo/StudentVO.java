package vo;

public class StudentVO {
	// 학번, 이름, 학과명, 평점
	private String stNo;
	private String stName;
	private String department;
	private double score;

	// 생성자, 전체필드 초기화

	public StudentVO() {
	}

	public StudentVO(String stNo, String stName, String department, double score) {
		super();
		this.stNo = stNo;
		this.stName = stName;
		this.department = department;
		this.score = score;
	}

	// get / set
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	// toString --> 학번 이름 학과명 평점
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%.2f", stNo, stName, department, score);
	}



}
