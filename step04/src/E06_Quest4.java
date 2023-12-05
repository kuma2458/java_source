
public class E06_Quest4 {

	public static void main(String[] args) {
		// 1부터 100까지 숫자들 중에 4와 7의 배수를 출력 / 단, 4와 7의 공배수는 1번만 출력

		int i = 0;
		while (i++ < 100) {
			if (i % 4 == 0 || i % 7 == 0) {
				System.out.println(i);
			}

		}

	}

}
