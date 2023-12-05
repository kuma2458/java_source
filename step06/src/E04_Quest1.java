import java.util.Scanner;

public class E04_Quest1 {

	public static void main(String[] args) {
		// 정수형 배열 길이가 7인 배열을 생성한뒤에 배열에 숫자를 전부 사용자로부터 입력받아 저장

		Scanner sc = new Scanner(System.in);

		int[] arr1 = new int[7];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			int n = sc.nextInt();
			arr1[i] = n;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
