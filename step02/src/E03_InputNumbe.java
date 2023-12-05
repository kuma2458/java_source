import java.util.Scanner;

public class E03_InputNumbe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("숫자 입력 : ");
		
		//입력 받기
		
		int n= sc.nextInt();
//		System.out.println(n);
		
		//숫자 하나 더 입력을 받아서 n에 입력된 값과 더해서 출력
//		System.out.print("숫자 입력 : ");
		
		int m = sc.nextInt();
//		System.out.println(m);
		System.out.println("두 수의 합: "+(n+m));
		
		
	}

}
