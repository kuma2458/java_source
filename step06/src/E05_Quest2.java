
public class E05_Quest2 {

	public static void main(String[] args) {
		// 정수형 배열 길이가 10인 배열일 선언할때 원하는 값으로 초기화 한후 짝수 홀수 구분
		// 필수요소 : 배열, 짝수 홀수 개수

		int[] arr = { 414, 5, 0, 26, 68, 44, 45, 78, 99, 100 };

		int odd = 0, even = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("짝수 개수 : " + even);
		System.out.println("홀수 개수 : " + odd);

	}

}
