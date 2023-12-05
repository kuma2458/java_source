import java.util.Scanner;

public class E06_ElseifQuest {
	/*
	 *  점수를 입력 받아서
	 *  100~90 A
	 *   89~80 B
	 *   79~70 C
	 *   69~60 D
	 *   59~0  F
	 *   성적 등급을 출력
	 *  
	 */
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);

		// 1.점수입력
		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();

		// 2.출력
		if (score > 89) {
			System.out.println("A등급입니다.");
		} else if (score > 79) {
			System.out.println("B등급입니다.");
		} else if (score > 69) {
			System.out.println("C등급입니다.");
		} else if (score > 59) {
			System.out.println("D등급입니다.");
		} else {
			System.out.println("F등급입니다.");
		}

		if (score < 60) {
			System.out.println("F등급입니다.");
		} else if (score < 70) {
			System.out.println("D등급입니다.");
		} else if (score < 80) {
			System.out.println("C등급입니다.");
		} else if (score < 90) {
			System.out.println("B등급입니다.");
		} else {
			System.out.println("A등급입니다.");
		}
	}

}
