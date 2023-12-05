import java.util.Arrays;

public class E17_Quest9 {

	public static void main(String[] args) {
		// 배열 선언 로또 1~45 중복x 반복문중첩x

		int arr[] = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}

			}
			System.out.println(Arrays.toString(arr));

		}
	}
}
