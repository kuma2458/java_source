import java.util.Arrays;

public class E28_Quest13 {

	public static void main(String[] args) {
		// 배운 정렬 아무거나 쓰기
		// 길이가 10인 정수형 배열을 선언해서 숫자를 랜덤으로 1~30까지의 숫자를 저장후 정렬하기(내림/올림 자유,중복도 포함)

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 30) + 1;
		}
		System.out.print("정렬 전 배열 : ");
		for (int d : arr) {
			System.out.print(d + " ");
		}
		System.out.println();

		// case1. 버블정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("버블 정렬 후 배열 : ");
		for (int d : arr) {
			System.out.print(d + " ");
		}

		// case2. 선택정렬
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			int minidx = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[minidx] < arr[j])
					minidx = j;
			}
			int temp = arr[minidx];
			arr[minidx] = arr[i];
			arr[i] = temp;
		}
		System.out.print("선택 정렬 후 배열 : ");
		for (int d : arr) {
			System.out.print(d + " ");
		}

		// case3. 삽입정렬
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}

		System.out.print("삽입 정렬 후 배열 : ");
		for (int d : arr) {
			System.out.print(d + " ");
		}

	}

}
