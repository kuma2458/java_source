import java.util.Scanner;

public class E11_Quest5 {

	public static void main(String[] args) {
		// 6 입력하면 역 삼각형

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int k = 0; k < num - i-1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
