package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.StudentService;
import service.StudentService1;

public class StudentMain {
	/*
	 * -----학적관리 프로그램----- 
	 * 1.학생정보 등록 
	 * 2.학생정보 검색 
	 * 3.학생정보 수정 
	 * 4.학생정보 삭제 
	 * 5.학생정보 전체 조회
	 * 0.프로그램 종료 
	 * 원하시는 번호를 입력하세요 :
	 *
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-----학적관리프로그램-----");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 학생정보 전체 조회");
			System.out.println("6. 석차 1등 출력");
			System.out.println("7. 학생이름 검색");
			System.out.println("8. 전체 학과 목록을 조회 ");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");
			int n = sc.nextInt();
			sc.nextLine();
			if (n == 0)
				break;
			
			Controller controller =HandlerMapping.getInstance().createController(n);
			if(controller != null)
				controller.execute(sc);

		}
		sc.close();
		StudentService1.getInstance().saveStudentJSONFile();
	}

}
