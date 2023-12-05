import java.util.Scanner;

public class E12_Quest7 {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받은 후 입력 받은 숫자의 팩토리얼 결과값을 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		for (int i = 1; i < num; i++) {
			sum *= i;
		}
		System.out.println("1~" + num + "까지 곱한 결과 : " + sum);
		// 서식 문자열: %d- 정수 %f -실수 %s - 문자열
		System.out.printf(" 1 ~ %d까지 곱한 결과 : %d", num, sum);
	}

}
