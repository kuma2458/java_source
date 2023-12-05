import java.util.Arrays;
import java.util.Scanner;

public class E15_Quest7 {

	public static void main(String[] args) {
		// 길이가 5인 정수형 배열을 생성한 후에 숫자를 입력받아 배열에 저장, 배열이 가득차면 +3, -1을 입력하면 종료
		// 삭제할 숫자를 입력 받아서 배열에 있는 숫자를 삭제 처리 후 전체배열 출력

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int i = 0;
		while (true) {
			if (i == arr.length) {
				int[] temp = new int[arr.length + 3];
				System.arraycopy(arr, 0, temp, 0, arr.length);
				arr=temp;
				System.out.println(Arrays.toString(arr));
			}
			System.out.print("정수 입력: ");
			arr[i] = sc.nextInt();
			if (arr[i] == -1)
				break;
			i++;
		}

		System.out.println(Arrays.toString(arr));

		System.out.println("삭제하고 싶은 숫자를 입력하세요");
		int num = sc.nextInt();
		for (int j = 0; j < i; j++) {
			if (num == arr[j]) {
				for (int k = j; k < i - 1; k++) {
					arr[k] = arr[k + 1];
					if (k + 1 == i- 1) {
						arr[i - 1] = 0;
					}
				}
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
