import java.util.Scanner;

public class E11_Quest6 {

	public static void main(String[] args) {
		// 약수 출력 후 카운팅

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.print("\n약수의 개수 : " + count);

	}

}
