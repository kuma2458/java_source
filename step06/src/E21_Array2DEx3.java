
public class E21_Array2DEx3 {

	public static void main(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9 10
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j : arr[i]) {
				System.out.printf("%02d ",j);
			}
			System.out.println();
		}

	}

}
