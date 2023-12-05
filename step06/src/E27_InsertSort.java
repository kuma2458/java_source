import java.util.Arrays;
import java.util.Scanner;

public class E27_InsertSort {

	public static void main(String[] args) {
		// i번째에 데이터 입력을 받음
		// 데이터 정렬 수행
		// 삽입정렬: 삽입한 위치부터 앞으로 가면서 비교
		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("삽입할 숫자 입력 : ");
			arr[i] = sc.nextInt();
			System.out.println("\n" + (i + 1) + "번째 시작");
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
//					System.out.println(Arrays. toString(arr));
			}
			System.out.println(Arrays.toString(arr));

		}
		System.out.println("\n---결과---");
		System.out.println(Arrays.toString(arr));
	}

}
