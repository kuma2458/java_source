
public class E13_Quest6 {

	public static void main(String[] args) {
		// 각도 사인 코사인 탄젠트
		System.out.println("각도	사인	코사인	탄젠트");
		for (int i = 0; i < 91; i++) {
			double radin = Math.toRadians(i);
			if (i != 90)
				System.out.printf("%d\t%.4f\t%.4f\t%.4f\n", i, Math.sin(radin), Math.cos(radin), Math.tan(radin));
			else
				System.out.printf("%d\t%.4f\t%.4f\t∞\n", i, Math.sin(radin), Math.cos(radin));

		}
	}

}
