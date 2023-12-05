/**
 * 
 */
package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

/**
 * 
 */
public class DeleteStudentController implements Controller {

	public void execute(Scanner sc) {
		System.out.println("학생정보 삭제....");
		System.out.print("삭제하고싶은 학생의 학번을 입력하세요 : ");
		String stNo=sc.nextLine();
		if(StudentService.getInstance().deletestudent(stNo)) {
			System.out.println("삭제완료");
		}
		else {
			System.out.println("검색하신 학번은 등록되지 않은 학번입니다.");
		}
		
	}

	
}
