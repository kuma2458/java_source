
public class E02_ArrayEx2 {

	public static void main(String[] args) {
		// 배열 생성과 동시에 초기화 하는 방법

		int[] arr1 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("--------------");

		// 배열 생성과 동시에 초기화 하는 방법2

		int[] arr2 = new int[] { 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		//정수형 배열 길이가 7인 배열을 생성 후 바로 출력
		
		System.out.println("--------------");
		
		
		int[] arr3=new int[7];
		for(int i = 0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		
	}

}
