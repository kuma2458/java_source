import java.util.Scanner;

public class E16_Quest5 {

	public static void main(String[] args) {
		//숫자 두 개를 입력 받은 다음 두 수의 뺄셈 결과를 무조건 양수로 출력하시오
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("숫자 입력 ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 ");
		int n2 = sc.nextInt();
		
//		int result = n1 > n2 ? n1 - n2 : n2 - n1;
		int result = n1 - n2;
		result = result > 0 ? result : -result;
		System.out.println(result);
	}

}
