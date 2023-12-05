import java.util.Scanner;

public class E05_Quest1 {

	public static void main(String[] args) {
		//문제1. 정수형 변수 두개를 선언 후 입력 받아 두 값의 사칙연산 출력
		Scanner sc = new Scanner(System.in);//scanner 선언

		int num1 = 0, num2 = 0;//정수형 변수 선언
		
		System.out.print("두 수를 입력하시오: ");
		
		num1 = sc.nextInt();//숫자1 입력
		num2 = sc.nextInt();//숫자2 입력
		
		System.out.println("덧셈: "+(num1 + num2));//덧셈 출력
		System.out.println("뺄셈: "+(num1 - num2));//뺄셈 출력
		System.out.println("곱셈: "+(num1 * num2));//곱셈 출력
		System.out.println("몫 나눗셈: "+(num1 / num2));//몫 나눗셈 출력
		System.out.println("나머지 나눗셈: "+(num1 % num2));//나머지 나눗셈 출력
		
		
//		sc.close();
	}

}
