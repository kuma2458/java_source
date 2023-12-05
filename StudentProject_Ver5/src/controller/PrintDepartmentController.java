package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class PrintDepartmentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("전체 학과 목록 조회...");
		
//		//1. 리스트 가져와서 학과만 출력
//		ArrayList<StudentVO> list=StudentService.getInstance().getDBlist();
//		for(int i =0; i<list.size(); i++) {
//			System.out.println(list.get(i).getMajor_name());
//		}
		//2. 메서드 만들어서 거기서 출력
		ArrayList<String> list2=StudentService.getInstance().getmajorlist();
		list2.forEach((a)->System.out.println(a));
		
		
		
	}

}
