package field;

import java.util.Scanner;

public class EpInfoMain {

	public static void main(String[] args) {
		EmployeeInfo ep1 = new EmployeeInfo();

		ep1.EpName = "김동현";
		ep1.EpNum = "123123123";
		ep1.EpPart = "afdsfsd";
		ep1.money = 3000000;

		System.out.println(ep1.EpName + " " + ep1.EpNum + " " + ep1.EpPart + " " + ep1.money);

		Scanner sc = new Scanner(System.in);

		EmployeeInfo ep2 = new EmployeeInfo();
		// 사원정보 입력받아서 출력
		System.out.print("사번 입력 : ");
		ep2.EpNum = sc.nextLine();
		System.out.print("이름 입력 : ");
		ep2.EpName = sc.nextLine();
		System.out.print("급여 입력 : ");
		ep2.money = sc.nextInt();
		sc.nextLine();// 입력안되는거 해결하는 방법
		System.out.print("부서1 입력 : ");
		ep2.EpPart = sc.nextLine();// nextint 다음 문자열은 입력이 안됨 엔터가 이미 친거로 판정되서

		System.out.println("사번: " + ep2.EpNum + " 이름 : " + ep2.EpName + " 급여 : " + ep2.money + " 부서1 : " + ep2.EpPart);

	}

}
