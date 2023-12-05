package HandlerMapping;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Controller;
import employeeService.EmployeeService;
import employeeVo.EmployeeVo;

public class PrintEmvoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원정보 전체 출력....");
		ArrayList<EmployeeVo> list1 = EmployeeService.getInstance().getlist();
		if (list1.isEmpty()) {
			System.out.println("사원 정보가 하나도 없습니다.");
			return;
		}
			System.out.println("사번 이름 급여 부서");
			for (EmployeeVo e : list1)
				e.printvo();
			System.out.println("출력 성공");

	}

}
