import java.util.Scanner;

public class E11_Quest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1.점수입력
		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();
		while(score<0||score>100) {
			System.out.println("범위 벗어남");
			System.out.print("성적을 입력하세요 : ");
			score = sc.nextInt();
		}
		// 2.출력
		switch (score / 10) {
		case 10:
//			System.out.println("A");
//			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}

	}

}
