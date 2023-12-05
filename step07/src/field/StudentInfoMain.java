package field;

import java.sql.Date;

public class StudentInfoMain {

	public static void main(String[] args) {
		StudentInfo student1 = new StudentInfo();
		student1.birthdate = "19980910";
		student1.studentId = "2017250003";
		student1.score = 4.0;
		student1.depertment = "컴공";
		student1.name = "김동현";
		student1.gender = "male";
		student1.profileImage = "https://www.naver.com";
		
		System.out.println(student1.studentId);
		System.out.println(student1.name);
		System.out.println(student1.score);
		System.out.println(student1.gender);
		System.out.println(student1.birthdate);
		System.out.println(student1.depertment);
		System.out.println(student1.profileImage);
			
		
		

	}

}
