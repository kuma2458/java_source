package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService1;
import vo.StudentVO;

public class SearchStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 검색...");
		System.out.print("검색하고 싶은 학번을 입력하세요 : ");
		String stNo=sc.nextLine();
		
		StudentVO vo=StudentService1.getInstance().searchstudent(stNo);
		if(vo==null) {
			System.out.println("검색하신 학번은 등록되지 않은 학번입니다.");
		}
		else {
			System.out.println(vo);
		}
		
	
	}

}
