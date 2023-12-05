package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService1;
import vo.StudentVO;

public class SearchStudentNameController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 이름 검색...");
		System.out.print("검색하고 싶은 학생의 이름을 입력하세요");
		String stName=sc.nextLine();
//		StudentService1.getInstance().searchname(stName);
		ArrayList<StudentVO> list=StudentService1.getInstance().searchname1(stName);
		System.out.println(list);

	}

}
