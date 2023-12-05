import java.util.Scanner;

public class E10_Quest4 {
	public static void main(String[] args) {
		//삼각형 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
