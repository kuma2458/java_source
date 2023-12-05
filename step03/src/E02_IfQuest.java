import java.util.Scanner;

public class E02_IfQuest {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받아서 해당 숫자가 짝수인지 홀수인지 0인지 구분해서 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		int num1 = sc.nextInt();

		if (num1 == 0) {
			System.out.println("0입니다");
		}
		if (num1 % 2 == 0 && num1 != 0) {
			System.out.println("짝수입니다");
		}

		if (num1 % 2 == 1) {
			System.out.println("홀수입니다");
		}

	}

}
