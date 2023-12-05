package employeeMain;

import java.util.Scanner;

import HandlerMapping.HandlerMapping;
import controller.Controller;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		
		while(true) {
			System.out.println("-----사원프로그램-----");
			System.out.println("1. 사원정보 등록");
			System.out.println("2. 사원정보 삭제");
			System.out.println("3. 사원정보 수정");
			System.out.println("4. 사원정보 조회");
			System.out.println("5. 사원정보 전체 조회");
			System.out.println("6. 사원정보를 json으로 저장");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 번호를 입력하세요 : ");
			int n = sc.nextInt();
			sc.nextLine();
			if (n == 0)
				break;
			
			Controller controller = HandlerMapping.getInstance().createcontroller(n);
			if(controller!=null)
				controller.execute(sc);
		}

		
		
	}

}
