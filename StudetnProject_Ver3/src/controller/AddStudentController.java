package controller;

import java.util.Scanner;

import service.StudentService1;
import vo.StudentVO;

public class AddStudentController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 입력");
		System.out.print("학번 입력 : ");
		String stNo = sc.nextLine();

		System.out.print("이름 입력 : ");
		String stName = sc.nextLine();

		System.out.print("학과 입력 : ");
		String department = sc.nextLine();

		System.out.print("학점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();

		boolean result = StudentService1.getInstance().addStudent(
				new StudentVO(stNo, stName, department, score));

		if (result) {
			System.out.println("학생정보 등록 완료");
		} else
			System.out.println("등록 실패");
	}

}
