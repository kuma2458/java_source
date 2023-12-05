import java.util.Scanner;

public class E05_Quest3 {

	public static void main(String[] args) {
		// 숫자 두개를 입력 받아서 작은 숫자부터 큰 숫자까지의 합을출력

		Scanner sc = new Scanner(System.in);

		int num1 = 0, num2 = 0, sum = 0;

		// 입력
		System.out.print("숫자 입력 : ");
		num1 = sc.nextInt();

		System.out.print("숫자 입력 : ");
		num2 = sc.nextInt();
		if (num1 > num2) {
			int a = num1;
			num1 = num2;
			num2 = a;
		}
		// case1. 먼저 대소비교 후 while문을 한번만 작성하여 덧셈

		while (num1 <= num2) {
			sum += num1;
			num1++;
			;
		}

		// case2. 대소 비교 결과에 따라 다르게 while문 실행
//		if (num1 > num2) {
//
//			while (num2 < num1 + 1) {
//				sum += num2;
//				num2++;
//			}
//
//		}
//
//		else {
//
//			while (num1 < num2 + 1) {
//				sum += num1;
//				num1++;
//			}
//
//		}
//
		System.out.println(sum);

	}

}
