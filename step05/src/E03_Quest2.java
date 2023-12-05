import java.util.Scanner;

public class E03_Quest2 {

	public static void main(String[] args) {
		//숫자 하나를 입력 받아 입력 받은 숫자 만큼 정수를 입력 받아서 입력 받은 정수의 총합과 평균을 출력. 단, 평균을 출력 했을때 소수점도 같이  출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 숫자 개수 : ");
		int num=sc.nextInt();
		int sum=0;
		double aver=0.0;
		for(int i =0; i<num; i++) {
			System.out.print("숫자 입력 : ");
			int num2=sc.nextInt();
			sum+=num2;   
		}
		aver=(double)sum/num;
		System.out.println("입력하신 숫자들의 총합 : "+sum);
		System.out.println("입력하신 숫자들의 평균 : "+aver);	
	}

}
