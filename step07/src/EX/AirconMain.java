package EX;

import java.util.Scanner;

public class AirconMain {

	public static void main(String[] args) {
		Aircon ac1= new Aircon();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			//메뉴 출력
			System.out.println("1. 에어컨 전원 ON/OFF");
			System.out.println("2. 에어컨 온도 UP");
			System.out.println("3. 에어컨 온도 DOWN");
			System.out.println("4. 에어컨 모드 변경");
			System.out.println("5. 에어컨 바람 세기");
			System.out.println("6. 에어컨 바람 각도");
			System.out.println("7. 에어컨 타이머");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하는 번호를 입력하세요 : ");
			int n= sc.nextInt();
			if(n==0)
				break;
			
			ac1.remote(n);
		}
	}

}
