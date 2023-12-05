package HandlerMapping;

import java.util.Scanner;

import controller.Controller;
import employeeService.EmployeeService;

public class deleteEmvoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 삭제...");
		System.out.print("삭제하고싶은 사원의 사번을 입력하세요 : ");
		String emNo = sc.nextLine();
		if (EmployeeService.getInstance().deleteemVO(emNo))
			System.out.println("삭제 완료");
		else
			System.out.println("해당하는 사번이 없습니다.");
	}

}
