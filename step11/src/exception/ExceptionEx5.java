package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {
	public static double div(double a, double b){
			return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		try {
			System.out.print(" 숫자 입력 : ");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			if(b==0)
				throw new Exception("0으로 나눌 수 없습니다.");
			System.out.println(div(a, b));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
