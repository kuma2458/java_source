package service;

import java.util.Arrays;
import java.util.Scanner;

import vo.StudentVO;

public class StudentService {
	// 1.학생정보 저장할 배열 선언
	// 2.저장할 위치를 나타낼 인덱스 변수
	// 3.생성자에서는 학생정보 배열을 생성, 길이는 5

	private StudentVO[] stvo;// 배열
	private int stIndex;// 인덱스

	public StudentService() {// 생성자에서 길이가 5인 배열 선언
		stvo = new StudentVO[5];
	}

	// 학생정보 등록하는 기능
	public void registerStudent(Scanner sc) {// 입력통로는 한곳이니 main에서 scanner 받아오기
		// 단 배열에 공간이 모자르면 3개씩 증가
		if (stIndex == stvo.length) {
			StudentVO[] temp = new StudentVO[stvo.length + 3];
			System.arraycopy(stvo, 0, temp, 0, stvo.length);
			stvo = temp;
		}
		// 1. 학생정보 입력
		// 2. 입력받은 학생 정보를 배열에 저장
		System.out.println("\n\n학생정보 입력을 시작합니다......");
		System.out.println("-----" + (stIndex + 1) + "번째 학생정보 입력-----");
		System.out.print("학번 입력 : ");// 학번 입력
		String stNo = sc.nextLine();
		System.out.print("이름 입력 : ");// 이름 입력
		String stName = sc.nextLine();
		System.out.print("학과 입력 : ");// 학과 입력
		String department = sc.nextLine();
		System.out.print("학점 입력 : ");// 학점 입력
		double score = sc.nextDouble();
		sc.nextLine();
		stvo[stIndex] = new StudentVO(stNo, stName, department, score);

		stIndex++;
	}

	private int getRank(double score) {
		int rank = 1;
		for (int i = 0; i < stIndex; i++) {
			if (score < stvo[i].getScore())
				rank++;
		}
		return rank;
	}

	public void printStudentInfo() {
		System.out.println("\n\n학생정보 출력......");
		System.out.println("순번\t석차\t학번\t이름\t학과\t학점");
		for (int i = 0; i < stIndex; i++) {// 이전에는 i<stvo.length&&stvo[i]!=null 이라고 썼음
			System.out.printf("%03d\t%d\t%s\n", (i + 1), getRank(stvo[i].getScore()), stvo[i].toString());
		}
	}

	private int searchStudentInfo(String StudentOb) {
		for (int i = 0; i < stIndex; i++) {
			if (stvo[i].getStNo().equals(StudentOb) || stvo[i].getStName().equals(StudentOb)) {
				return i;
			}
		}
		return -1;
	}

	private int searchStudentNames(String StudentOb) {
		for (int i = 0; i < stIndex; i++) {
			String name = stvo[i].getStName();
			if (name.indexOf(StudentOb) != -1) {
				return i;
			}
		}
		return -1;
	}

	public void searchStudent(Scanner sc) {
		// 1.학번을 입력
		// 2.배열을 전부 탐색하면서 동일한 학번인 학생을 찾음
		// 3.찾은 학생 정보를 출력
		// 4.검색 결과가 없으면 검색 결과가 없습니다 .출력
		System.out.println("학생정보 검색...........");
		System.out.print("검색하고 싶은 학번이나 이름을 입력하세요 : ");
		String stOb = sc.nextLine();
		int i = searchStudentInfo(stOb);
		if (i == -1) {
			System.out.println(stOb + " 의 검색 결과가 없습니다");
		} else {
			System.out.println(stvo[i]);
		}

	}

	public void editStudent(Scanner sc) {
		// 1.학번을 입력
		// 2.배열을 전부 탐색 하면서 동일한 학번인 학생을 찾음
		// 3.학생 정보를 입력 받아서 해당 배열 요소에 저장
		// 4.검색 결과가 없으면 수정할 학생이 없습니다 출력
		System.out.println("학생정보 수정...........");
		System.out.print("수정하고 싶은 학번을 입력하세요 : ");
		String stNo = sc.nextLine();
		int i = searchStudentInfo(stNo);
		if (i == -1) {
			System.out.println(stNo + " 학번의 검색 결과가 없습니다");
		} else {
			System.out.print("수정할 학생 정보를 입력하세요 : ");
			// 1
//					stvo[i]=new StudentVO(stNo2, stName, department, score);
//					System.out.println("수정한 정보 : "+stvo[i]);
			// 2
			System.out.print("학번 입력 : ");// 학번 입력
			stvo[i].setStNo(sc.nextLine());
			System.out.print("이름 입력 : ");// 이름 입력
			stvo[i].setStName(sc.nextLine());
			System.out.print("학과 입력 : ");// 학과 입력
			stvo[i].setDepartment(sc.nextLine());
			System.out.print("학점 입력 : ");// 학점 입력
			stvo[i].setScore(sc.nextDouble());
			sc.nextLine();
			System.out.println("수정한 정보 : " + stvo[i]);
			return;
		}
	}

	public void deleteStudent(Scanner sc) {
		// 1.학번을 입력
		// 2.배열을 전부 탐색 하면서 동일한 학번인 학생을 찾음
		// 3.배열의 내용을 땡기는 작업
		// 4.땡기는 작업이 끝나면 idx감소
		System.out.println("학생정보 수정...........");
		System.out.print("수정하고 싶은 학번을 입력하세요 : ");
		String stNo = sc.nextLine();
		int i = searchStudentInfo(stNo);
		if (i == -1) {
			System.out.println(stNo + " 학번의 검색 결과가 없습니다");
		} else {
			for (int j = i; j < stIndex - 1; j++) {
				stvo[j] = stvo[j + 1];
			}
			stIndex--;
			return;
		}
	}

	public void printFirstStudent() {
		System.out.println("\n\n1등 학생정보 출력......");
		System.out.println("학번\t이름\t학과\t학점");
		for (int i = 0; i < stIndex; i++) {// 이전에는 i<stvo.length&&stvo[i]!=null 이라고 썼음
			if (getRank(stvo[i].getScore()) == 1) {
				System.out.printf("%s\n", stvo[i].toString());
				break;
			}
		}
	}

	public void searchStudnetName(Scanner sc) {
		// 1.학번을 입력
		// 2.배열을 전부 탐색하면서 동일한 학번인 학생을 찾음
		// 3.찾은 학생 정보를 출력
		// 4.검색 결과가 없으면 검색 결과가 없습니다 .출력
		System.out.println("학생이름 검색...........");
		System.out.print("검색하고 싶은 이름을 입력하세요 : ");
		String stOb = sc.nextLine();
		boolean check=false;
		for (int i = 0; i < stIndex; i++) {
			if (stvo[i].getStName().indexOf(stOb) != -1) {
				System.out.println(stvo[i]);
				check = true;
			}
		}
		if (check) {
			return;
		} else {
			System.out.println(stOb + " 의 검색 결과가 없습니다");
		}

//		int i = searchStudentNames(stOb);
//		if (i == -1) {
//			System.out.println(stOb + " 의 검색 결과가 없습니다");
//		} else {
//			System.out.println(stvo[i]);
//		}

	}

}
