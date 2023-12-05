package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class EditStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 수정...");
		System.out.print("수정하고 싶은 학생의 학번을 입력하세요: ");
		String stNo=sc.nextLine();
		
		StudentVO vo=StudentService.getInstance().searchstudent(stNo);
		if(vo==null) {
			System.err.println("검색하신 학번은 등록되지 않은 학번입니다.");
			return;
		}
		else {
			System.out.println("수정할 학생 정보 입력");
			System.out.println(vo);
			System.out.print("이름 입력 : ");
			vo.setStName(sc.nextLine());
			System.out.print("학과 번호 입력 : ");
			vo.setMajor_no(sc.nextInt());
			System.out.print("학점 입력 : ");
			vo.setScore(sc.nextDouble());
			System.out.println(vo);
			int count = StudentService.getInstance().editStudentVo(vo);
			if(count !=0) {				
				System.out.println("수정완료");
			}
			else {
				System.out.println("수정실패");
			}
		}
	}

}
