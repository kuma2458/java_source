
public class E04_LoopInLoop {

	public static void main(String[] args) {
		// 구구단을 2단부터 9단까지 출력. EX) --2단--

		for (int i = 2; i < 10; i++) {
			System.out.println("--" + i + " 단--");
			// 1~9까지 곱한 결과 출력
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}

		int i = 2;

		while (i < 10) {
			System.out.printf("--%d 단--\n", i);
			int j = 1;
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
