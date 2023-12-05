import java.util.Scanner;

public class E04_ElseQuest {

	public static void main(String[] args) {
		//사용자로부터 나이를 입력 받아서 입력받은 나이가 20세 이상이면 성인  미만이면 미성년자 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요 : ");
		int age =sc.nextInt();
		
		if(age>=20) {
			System.out.println("성인입니다");
		}
		else {
			System.out.println("미성년자입니다");
		}
		
		
	}

}
