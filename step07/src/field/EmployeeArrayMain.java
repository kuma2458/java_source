package field;

import java.util.Scanner;

public class EmployeeArrayMain {

	public static void main(String[] args) {
		// 길이가 3인 Employee형 배열을 생성
		// 배열에 Employee 데이터를 Scanner를 이용해서 입력을 받아서 저장한 후에 배열에 저장된 모든 데이터를 출력

		EmployeeInfo[] ep = new EmployeeInfo[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ep.length; i++) {
			ep[i] = new EmployeeInfo();
			System.out.print("사번 입력 : ");
			ep[i].EpNum = sc.nextLine();
			System.out.print("이름 입력 : ");
			ep[i].EpName = sc.nextLine();
			System.out.print("급여 입력 : ");
			ep[i].money = sc.nextInt();
			sc.nextLine();// 입력안되는거 해결하는 방법
			System.out.print("부서 입력 : ");
			ep[i].EpPart = sc.nextLine();// nextint 다음 문자열은 입력이 안됨 엔터가 이미 친거로 판정되서
		}
		
		for (int i = 0; i < ep.length; i++) {

			System.out.println(
					"사번: " + ep[i].EpNum + " 이름: " + ep[i].EpName 
				 + " 급여: " + ep[i].money + " 부서: " + ep[i].EpPart);
		}
	}

}
