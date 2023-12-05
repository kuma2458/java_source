import java.util.Scanner;

public class E32_memo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("마방진 크기 입력 : ");
		int size = sc.nextInt();
		int row = 0, col = size / 2;
		int num = 1, count = size * size;
		int[][] arr = new int[size][size];

		while (num <= count) {
			// 배열에 값을 저장
			arr[row][col] = num++;
			// 행번호,열번호를 계산

			// 1.오른쪽 위로 이동이 기본 -> 행번호-, 열번호+

			int x = row - 1;
			int y = col + 1;
			// 2.이동할 위차가 인덱스 범위를 벗어났느냐?
			if (x == -1)
				x = size - 1;
			if (y == size)
				y = 0;
			// 3.다음 위치에 값이 있냐? 있으면-> 현재 위치 아래로 이동, 없으면 해당 위치로 이동
			if (arr[x][y] != 0) {
				x = row++;
			} else {
				row = x;
				col = y;
			}

			System.out.println((num) + "번째 ");
			for (int i = 0; i < arr.length; i++) {
				for (int d : arr[i]) {
					System.out.printf("%2d ", d);
				}
				System.out.println();
			}
		}

	}

}
