import java.util.Scanner;

public class E07_Quest5 {

	public static void main(String[] args) {
		// 약수 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("약수 출력할 숫자 입력 > ");
		int num = sc.nextInt();
		int i = 0;
		while (i < num) {
			i++;
			if (num % i == 0) {
				System.out.print(i + " ") ;
			}
		}
	}

}
