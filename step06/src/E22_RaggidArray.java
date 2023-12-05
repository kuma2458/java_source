
public class E22_RaggidArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
