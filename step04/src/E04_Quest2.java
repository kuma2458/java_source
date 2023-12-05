import java.util.Scanner;

public class E04_Quest2 {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받아서 입력한 숫자의 구구단을 출력 실행 예

		Scanner sc = new Scanner(System.in);

		System.out.print("단 입력 > ");

		int num = sc.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		}
	}

}
