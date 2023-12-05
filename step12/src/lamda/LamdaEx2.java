package lamda;

public class LamdaEx2 {

	public static void calc(int x, int y, Calcurator cal) {
		System.out.println(cal.calc(x, y));
	}

	public static void main(String[] args) {
		calc(10, 5, new Calcurator() {

			@Override
			public int calc(int x, int y) {
				return x - y;
			}
		});
		// 고배서 출력하는 기능을 람다식으로 표현

		calc(10, 5, (a, b) -> a * b);
		

	}

}
