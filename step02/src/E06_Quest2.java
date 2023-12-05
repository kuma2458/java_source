import java.util.Scanner;
public class E06_Quest2 {

	public static void main(String[] args) {
		//문제2. 반지름 하나 정수로 입력 받아서 입력 받은 반지름의 원넓이를 출력
		//단 원넓이는 소수점까지 출력
		
		Scanner sc = new Scanner(System.in);
		
		//1.변수선언
		int circlenum=0;
		double circle=0.0;	
		double pi=3.1415;
		
		System.out.print("반지름을 입력하시오 : "); 
		
		//2.계산
		circlenum=sc.nextInt();		
		circle=(circlenum*circlenum)*pi;
		
		//3.출력
		System.out.println("원 넓이 : "+circle);
		
	}

}
