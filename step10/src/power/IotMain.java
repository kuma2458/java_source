package power;

import java.util.Scanner;

public class IotMain {
	public static PowerOnOff addiots(Scanner sc) {
		System.out.println("\n기기등록....");
		System.out.println("----기기목록----");
		System.out.println("1.TV");
		System.out.println("2.에어컨");
		System.out.println("3.라이트");
		System.out.println("--------------");
		System.out.print("등록할 기기번호를 입력하세요. 최대 10개까지 가능합니다 : ");
		int iotnum = sc.nextInt();
		PowerOnOff power = null;
		switch (iotnum) {
		case 1:
			power = new Tv();
			break;
		case 2:
			power = new Aircon();
			break;
		case 3:
			power = new Light();
			break;
		}
		return power;
	}
	/*
	 * 1.기기등록 2.전체 전원 On 3.전체 전원 Off 0.프로그램 종료
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IotApp iotApp = new IotApp();
		while (true) {
			System.out.println("-------MENU-------");
			System.out.println("1.기기등록");
			System.out.println("2.전체 전원 On");
			System.out.println("3.전체 전원 Off");
			System.out.println("0.프로그램 종료");
			System.out.println("------------------");
			System.out.print("원하는 메뉴번호를 입력하세요 : ");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			switch (num) {
			case 1:
				iotApp.addIot(addiots(sc));
				break;
			case 2:
				System.out.println("전체 전원 On 하는중....\n");
				iotApp.allIotPowerOn();
				System.out.println("\n전체 전원 On 완료....");
				break;
			case 3:
				System.out.println("전체 전원 Off....\n");
				iotApp.allIotPowerOff();
				System.out.println("\n전체 전원 Off 완료....");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}

	}

}
