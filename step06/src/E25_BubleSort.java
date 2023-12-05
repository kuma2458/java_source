import java.util.Arrays;

public class E25_BubleSort {

	public static void main(String[] args) {
		// 기준값이랑 뒤에값이랑 비교해서 큰 값을 뒤로, 작은 값을 앞으로 전환
		// 버블 = 앞뒤로 비교해서 오름내림차순으로 정렬
		int[] arr = { 5, 7, 9, 3, 1 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 시작");
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
//				System.out.println(Arrays.toString(arr));
			}

			System.out.println(Arrays.toString(arr));
			

		}
		System.out.println("---결과---");
		System.out.println(Arrays.toString(arr));
	}

}
