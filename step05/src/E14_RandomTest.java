import java.util.Random;

public class E14_RandomTest {

	public static void main(String[] args) {
		// 1~10
		for (int i = 0; i < 10; i++) {
			int k = (int) (Math.random() * 10) + 1;
			System.out.println(k);
		}
		// 7~15
		for (int i = 0; i < 10; i++) {
			int k = (int) (Math.random() * 9) + 7;
			System.out.println(k);
		}
		// 로또번호 뽑기 = 1~40or45
		for (int i = 0; i < 10; i++) {
			int k = (int) (Math.random() * 45) + 1;
			System.out.print(k + " ");
		}
	}

}
