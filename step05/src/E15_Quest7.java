
public class E15_Quest7 {

	public static void main(String[] args) {
		// 주사위를 두번 굴려서 더블이 나올때까지
		int count = 0;
		while (true) {
			count++;
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println(num1 + " " + num2);
			if (num1 == num2) {
				System.out.println("더블!");
				break;
			} else {
				System.out.println("실패!");
			}
		}

		System.out.println("굴린 횟수 : " + count);
//
//		count = 0;
//
//		int n1 = 1, n2 = 0;
//		while (n1 != n2) {
//			n1 = (int) (Math.random() * 6) + 1;
//			n2 = (int) (Math.random() * 6) + 1;
//			System.out.println(n1 + " " + n2);
//			count++;
//		}
//		System.out.println("더블!");
//		System.out.println("굴린 횟수 : " + count);
//
//		do {
//			n1 = (int) (Math.random() * 6) + 1;
//			n2 = (int) (Math.random() * 6) + 1;
//			System.out.println(n1 + " " + n2);
//			count++;
//		} while (n1 != n2);
	}

}
