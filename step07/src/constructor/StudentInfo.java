package constructor;

public class StudentInfo {
	//학번 이름 전공 점수
	String stnum;
	String stname;
	String major;
	double score;
	

	/*
	 * this : 자기 자신 객체를 나타냄
	 * 	   	  지역변수가 필드명이랑 같으면 무조건 지역변수에 먼저 접근. 이때 필드에 먼저 접근하기 위해 this로 선언한다
	 * 
	 * 
	 * 
	 */

	public StudentInfo(String stnum, String stname, String major, double score) {
		this.stnum = stnum;
		this.stname = stname;
		this.major = major;
		this.score = score;
	}
	
	StudentInfo(String stnum,String stname){
		this.stnum=stnum;
		this.stname=stname;
	}
	public StudentInfo() {
		System.out.println("StudentInfo() 기본 생성자");
	}

	@Override
	public String toString() {
		return "StudentInfo [stnum=" + stnum + ", stname=" + stname + ", major=" + major + ", score=" + score + "]";
	}
	
	
}
