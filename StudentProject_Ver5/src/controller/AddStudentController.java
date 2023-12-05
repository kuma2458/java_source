package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class AddStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 입력");
		System.out.print("학번 입력 : ");
		String stNo = sc.nextLine();

		System.out.print("이름 입력 : ");
		String stName = sc.nextLine();

		System.out.print("학과번호 입력 : ");
		int department_no = sc.nextInt(); sc.nextLine();
		
		System.out.print("학점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();

		//StudentVO 클래스를 변경
		//Service클래스로 등록할 정보를 보내고, 결과를 받음
		boolean result = StudentService.getInstance().insertStudent(
				new StudentVO(stNo, stName,score, department_no ));

		if (result) {
			System.out.println("학생정보 등록 완료");
		} else
			System.out.println("등록 실패");
	}

}
