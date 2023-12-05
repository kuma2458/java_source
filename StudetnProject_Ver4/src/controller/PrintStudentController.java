package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService1;
import vo.StudentVO;

public class PrintStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 출력...");
		ArrayList<StudentVO> list=StudentService1.getInstance().getlist();
		
		if(list.isEmpty()) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
