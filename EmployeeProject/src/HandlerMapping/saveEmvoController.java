package HandlerMapping;

import java.util.Scanner;

import controller.Controller;
import employeeService.EmployeeService;

public class saveEmvoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 입력...");
		System.out.println("사번 입력 : ");
		String emNo=sc.nextLine();
		
		System.out.println("이름 입력 : ");
		String emName=sc.nextLine();
		
		System.out.println("연봉 입력 : ");
		int emMoney=sc.nextInt();
		sc.nextLine();
		
		System.out.println("연봉 입력 : ");
		String emPart=sc.nextLine();
		
		if(EmployeeService.getInstance().saveEmVo(emNo,emName,emMoney,emPart))
			System.out.println("사원 정보 입력 완료");
		else
			System.out.println("사원 정보 입력 실패");
	}

}
