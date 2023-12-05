
public class E24_Quest12 {

	public static void main(String[] args) {
		// 2차원 배열 5행 5열 짜리를 선언, 배열에 데이터를 자동으로 채움,
		int[][] arr = new int[5][5];
		int n = 1, col = 0, sw = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][col] = n++;
				col += sw;
			}
			sw = -sw;
			col += sw;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int d : arr[i]) {
				System.out.printf("%2d ", d);
			}
			System.out.println();
		}
	}
}
