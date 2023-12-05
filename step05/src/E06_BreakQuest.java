import java.util.Scanner;

public class E06_BreakQuest {

	public static void main(String[] args) {
		// 숫자 0을 입력할때까지 숫자를 입력 받아서 0을 입력하면 입력을 멈추고 그동안 입력한 숫자들의 총합과 평균을 출력
		Scanner sc = new Scanner(System.in);
		int sum = 0, count = 0;
		
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num == 0)
				break;
			sum += num;
			count++;
		}
		
		System.out.println("입력한 숫자들의 총합 : " + sum);
		System.out.println("입력한 숫자들의 평균 : " + sum / (double) count);

	}

}
