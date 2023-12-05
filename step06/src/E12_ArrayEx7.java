import java.util.Arrays;
import java.util.Scanner;

public class E12_ArrayEx7 {

	public static void main(String[] args) {
		// 최초의 정수형 배열은 길이가 5인 배열을 생성 배열에 숫자를 순서대로 입력해 나가면서 -1을 입력할때까지 계속해서 배열에 숫자를 입력
		// 입력이 끝나면 내용을 출력하고 평균 출력

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int i = 0, sum = 0;
		while (true) {
			if (i == arr.length) {
				int[] temp = new int[arr.length + 3];
				for (int j = 0; j < arr.length; j++) {
					temp[j] = arr[j];
				}
				arr = temp;
			}
			System.out.print("정수 입력: ");
			arr[i] = sc.nextInt();
			if (arr[i] == -1)
				break;
			i++;
		}
		System.out.println(Arrays.toString(arr));

		for (int j = 0; j < i; j++) {
			sum += arr[j];
		}

		System.out.println(sum / (double) i);
	}
}
