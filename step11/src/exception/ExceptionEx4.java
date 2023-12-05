package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {
	//static 메서드 하나 만들기
	//숫자 두개를 받아서 나눈 결과를 리턴하는 메서드
	
	public static double div(double a, double b) throws ArithmeticException {
		try {
			return a/b;
			
		} catch (ArithmeticException e) {
		}
		return a/b;
	}
	public static void main(String[] args) {
		//숫자 두개 입력 받아서 위에 만든 메서드 실행 후 결과 출력
		Scanner sc =new Scanner(System.in);
		try {
			System.out.print(" 숫자 입력 : ");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println(div(a, b));
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} 
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
