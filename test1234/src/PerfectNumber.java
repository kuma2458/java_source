import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num=sc.nextInt();//입력
		int sum=0;//약수들의 합 저장할 변수
		for(int i =1; i<num; i++) {
			if(num%i==0)
				sum+=i;
		}
		if(sum==num) 
			System.out.println("입력하신 숫자는 완전수 입니다.");
		else
			System.out.println("입력하신 숫자는 완전수가 아닙니다.");
		
		
	}

}
