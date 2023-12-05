import java.util.Scanner;

public class E07_Quest3 {

	public static void main(String[] args) {
		//문제3. 삼각형의 밑변과 높이를 정수로 입력 받은 후 입력한 값을 이용해 삼각형의 넓이를 출력
		Scanner sc = new Scanner(System.in);
		
		//1.변수 선언
		int trinum1 = 0, trinum2 = 0;
		
		//2.입력
		System.out.print("삼각형의 밑변과 높이를 순서대로 입력하시오 : ");
		trinum1=sc.nextInt();
		trinum2=sc.nextInt();
		
		//3.계산
		double area= (trinum1*trinum2)/2.0;
		
		System.out.println("삼각형의 넓이 : "+area);
		
	}

}
