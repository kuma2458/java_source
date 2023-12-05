import java.util.Scanner;

public class QuestPrimeNumber {
	/*
	 * 숫자 하나 입력 받아서
	 * 입력 받은 숫자가 소수 인지 출력을 하시오.
	 * 소수는 1과 자기자신으로만 나누어지는 숫자
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("숫자를 입력 하시오 : ");
		int pn=sc.nextInt();
//		int count=0;
//		for(int i = 1; i<=pn; i++) {
//			if(pn%i==0)
//				count++;
//		}
//		if(count==2) {
//			System.out.println("소수입니다.");
//		}
//		else
//			System.out.println("소수가 아닙니다.");
		boolean t=true;
		for(int i =2; i<pn; i++) {
			if(pn%i==0){
				t=false;
				break;
			}
		}
		
		System.out.println(t?"소수":"소수아님");
	}

}
