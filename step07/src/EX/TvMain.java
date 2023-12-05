package EX;

import java.util.Scanner;

public class TvMain {

	public static void main(String[] args) {
		TV tv1 = new TV();
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 메뉴 출력
			System.out.println("1. 티비 전원 ON/OFF");
			System.out.println("2. 티비 채널 UP");
			System.out.println("3. 티비 채널 DOWN");
			System.out.println("4. 티비 볼륨 UP");
			System.out.println("5. 티비 볼륨 DOWN");
			System.out.println("6. 티비 음소거 ON/OFF");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하는 번호를 입력하세요 : ");
			int n = sc.nextInt();
			if (n == 0)
				break;

			tv1.remote(n);
		}
	}

}
