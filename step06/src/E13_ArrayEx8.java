import java.util.Arrays;

public class E13_ArrayEx8 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 배열 크기 줄이기
		// 배열을 줄이면 데이터 손실이 발생할 수 있다.
		// 1. 임시배열 작성
		int[] temp = new int[arr.length - 3];

		// 2. 임시배열에 데이터 작성
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}

		// 3. 임시배열을 본래 배열에 연결
		arr = temp;

		System.out.println(Arrays.toString(arr));

	}

}
