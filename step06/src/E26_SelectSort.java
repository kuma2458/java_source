import java.util.Arrays;

public class E26_SelectSort {

	public static void main(String[] args) {
		// 기준값이랑 나머지랑 비교해서 오름내림순으로 작거나 큰값의 인덱스를 저장한후
		// 기준값이랑 그거만 바꿔줌
		int[] arr = { 5, 7, 9, 3, 1 };

		for (int i = 0; i < arr.length; i++) {
			int min=i;
			System.out.println((i + 1) + "번째 시작");
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min=j;
				}
//				System.out.println(Arrays.toString(arr));
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			System.out.println(Arrays.toString(arr));
			

		}
		System.out.println("---결과---");
		System.out.println(Arrays.toString(arr));
	}

}
