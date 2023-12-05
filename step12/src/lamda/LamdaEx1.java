package lamda;

public class LamdaEx1 {
	public static void main(String[] args) {
		Calcurator plus = new Calcurator() {

			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};// 익명클래스

		System.out.println(plus.calc(10, 50));

		Calcurator minus = (a, b) -> a - b;
		System.out.println(minus.calc(25, 6));

		Calcurator total = (a, b) -> {
			int sum = 0;

			for (int i = a; i <= b; i++)
				sum += i;
			return sum;
		};
		
		System.out.println(total.calc(1, 100));

	}
}
