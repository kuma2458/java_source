package main;

import java.util.Scanner;
import service.StudentService;

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
		StudentService sv=new StudentService();
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
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");
			int n = sc.nextInt();
			sc.nextLine();
			if (n == 0)
				break;
			switch (n) {
			case 1:
				sv.registerStudent(sc);
				break;
			case 2:
				sv.searchStudent(sc);
				break;
			case 3:
				sv.editStudent(sc);
				break;
			case 4:
				sv.deleteStudent(sc);
				break;
			case 5:
				sv.printStudentInfo();
				break;
			case 6:
				sv.printFirstStudent();
				break;
			case 7:
				sv.searchStudnetName(sc);
				break;
			}

		}
		sc.close();
	}

}
