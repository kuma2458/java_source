import java.util.Arrays;

public class E23_Quest11 {

	public static void main(String[] args) {
		// 로또 5세트 저장
		int[][] arr = new int[5][6];
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 로또 : ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 45) + 1;
				for (int k = 0; k < j; k++) {
					if (arr[i][j] == arr[i][k]) {
						j--;
						break;
					}

				}
			}
			System.out.println(Arrays.toString(arr[i]));
		}

//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//
//			}
//			System.out.println(Arrays.toString(arr));
//
//		}

	}

}
