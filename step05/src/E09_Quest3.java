import java.util.Scanner;

public class E09_Quest3 {

	public static void main(String[] args) {
		// 숫자 두개를 입력 받은 후에 입력 한 두 숫자의 최대 공약수를 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 입력: ");
		int num2 = sc.nextInt();
		int i = 1, max = 0;

		while (true) {
			if (i > num1 || i > num2)
				break;
			if (num1 % i == 0 && num2 % i == 0) {
				if (i > max) {
					max = i;
				}
			}
			i++;
		}

		i = 1;
		// case2 break안쓰기
		while (i <= num1 || i <= num2) {
			if (num1 % i == 0 && num2 % i == 0) {
				if (i > max) {
					max = i;
				}
			}
			i++;
		}
		System.out.println("최대 공약수 : " + max);
	}

}
