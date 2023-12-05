import java.util.Scanner;

public class E13_Quest3 {

	public static void main(String[] args) {
		// 100~95 A+ 94~90A 89~85 B+ 84~80 B 79~75C+ 74~70C
		Scanner sc = new Scanner(System.in);

		// 1.점수입력
		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();

		// 2.출력
		switch (score / 5) {
		case 20:
		case 19:
			System.out.println("A+");
			break;
		case 18:
			System.out.println("A");
			break;
		case 17:
			System.out.println("B+");
			break;
		case 16:
			System.out.println("B");
			break;
		case 15:
			System.out.println("C+");
			break;
		case 14:
			System.out.println("C");
			break;
		case 13:
			System.out.println("D+");
			break;
		case 12:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}

	}

}
