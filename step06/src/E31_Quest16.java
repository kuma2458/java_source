import java.util.Scanner;

public class E31_Quest16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("마방진 크기 입력: ");
		int n = sc.nextInt();
		int magicn = n * (n * n + 1) / 2;
		System.out.println("마법상수 : " + magicn);
		int[][] arr = new int[n][n];

		System.out.println();
		if (n % 4 == 0) {// n이 4의 배수일경우의 마방진,대각선을 제외한 나머지 수들의 위치를 거울처럼 반전시켜 이동시킨다
			int k = 1;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = k;
					k++;
				}

			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length - 1 - i; j++) {
					System.out.printf("%d %d \n", i, j);
					if (i == j || i + j == arr.length) {
						continue;
					} else {

						int temp = arr[i][j];
						arr[i][j] = arr[arr.length - 1 - i][arr.length - 1 - j];
						arr[arr.length - 1 - i][arr.length - 1 - j] = temp;
					}
				}

			}

		} else if (n % 6 == 0) {// n이 6의 배수일 경우의 마방진, 미구현
		} else if (n % 2 == 1) {// n이 홀수일 경우의 마방진, 1을 0번행 중앙에 두고 시작을 한다.
			int x = 0, y = arr.length / 2;
			arr[x][y] = 1;
			for (int k = 2; k < n * n + 1; k++) {
				int a = x - 1;
				int b = y + 1;
				if (a == -1) {
					a = arr.length - 1;
				}
				if (b == arr.length) {
					b = 0;
				}
				if (arr[a][b] != 0) {
					x++;
				} else {
					x = a;
					y = b;

				}
				arr[x][y] = k;
				System.out.println((k) + "번째 ");
				for (int i = 0; i < arr.length; i++) {
					for (int d : arr[i]) {
						System.out.printf("%2d ", d);
					}
					System.out.println();
				}
			}

		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int d : arr[i]) {
				System.out.printf("%3d ", d);
			}
			System.out.println();
		}

	}

}
