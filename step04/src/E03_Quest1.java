import java.util.Scanner;

public class E03_Quest1 {

	public static void main(String[] args) {
		// 양수 하나을 입력받아서 입력받은 개수 만큼 Hello World 출력 ex) 숫자입력 6하면 Hello World 6번

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		
		int i = sc.nextInt();
		
		while (i--> 0) {
			System.out.println("Hello World");
		}
 
	}

}
