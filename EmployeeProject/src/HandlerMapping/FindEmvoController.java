
package HandlerMapping;

import java.util.Scanner;

import controller.Controller;
import employeeService.EmployeeService;
import employeeVo.EmployeeVo;

public class FindEmvoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 조회");
		System.out.print("조회하고 싶은 사원의 사번을 입력하세요 : ");
		String emNo=sc.nextLine();
		EmployeeVo emvo=EmployeeService.getInstance().findEmvo(emNo);
		if(emvo==null)
			System.out.println("검색결과가 없습니다");
		else {
			System.out.println("사번\t이름\t연봉\t부서");
			emvo.printvo();
		}
	}

}
