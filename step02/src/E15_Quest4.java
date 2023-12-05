import java.util.Scanner;

public class E15_Quest4 {

	public static void main(String[] args) {
		//문제4. 숫자 하나를 입력받아서 해당 숫자가 짝수인지 홀수인지 출력, 짝수에 0을 포함, 변수는 1개만 사용
		
		Scanner sc = new Scanner(System.in);
		
		//1.변수선언
		int num=0;
		System.out.print("숫자 입력 : ");
		
		//2.입력
		num=sc.nextInt();
		
		//3.출력
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
	}

}
