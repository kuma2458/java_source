import java.util.Scanner;

public class E09_ForEx2 {

	public static void main(String[] args) {
		// 숫자 하나를 입력 받아서 입력한 숫자의 구구단을 출력 실행 예

		Scanner sc = new Scanner(System.in);

		System.out.print("단 입력 > ");

		int num = sc.nextInt();

		for(int i=1;i<10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
