package HandlerMapping;

import java.util.Scanner;

import controller.Controller;
import employeeService.EmployeeService;
import employeeVo.EmployeeVo;

public class editEmvoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 수정....");
		System.out.print("수정하고싶은 사원의 사번을 입력하세요 : ");
		String emNo = sc.nextLine();
		EmployeeVo emvo = EmployeeService.getInstance().findEmvo(emNo);
		if (emvo == null) {
			System.out.println("수정할 데이터가 없습니다.");
			return;
		}
		System.out.print("수정할 이름 입력 : ");
		emvo.setEmName(sc.nextLine());
		System.out.print("수정할 연봉 입력 : ");
		emvo.setEmMoney(sc.nextInt());
		sc.nextLine();
		System.out.print("수정할 부서 입력 : ");
		emvo.setEmPart(sc.nextLine());
		System.out.println("수정 완료");
		System.out.println("사번 이름 연봉 부서");
		emvo.printvo();

	}

}
