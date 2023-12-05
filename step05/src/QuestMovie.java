import java.util.Scanner;

public class QuestMovie {
	/*
	 * 영화 평점을 1~5까지의 정수로 입력을 
	 * 받음 입력 받은 평점 만큼 ★을 출력하시오 
	 * 별 출력 후 프로그램이 종료
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("이번 영화의 평점을 입력 하세요 : ");
			int score = sc.nextInt();
			if (score > 5 || score < 1) {
				System.out.println("평점은 1~5 사이만 입력할 수 있습니다.");
				continue;
			} else {
				System.out.print("평점 : ");
				for (int i = 0; i < score; i++) {
					System.out.print("★");
				}
				break;
			}

		}

	}

}
