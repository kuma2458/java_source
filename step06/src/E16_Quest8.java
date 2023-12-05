import java.util.Arrays;
import java.util.Scanner;

public class E16_Quest8 {

	public static void main(String[] args) {
		//길이가 10인 정수형배열을 선언한 후 입력한 숫자가 짝수는 뒤부터, 홀수는 앞부터 저장
		//입력이 끝나면 전체 내용을 출력
		
		Scanner sc=new Scanner(System.in);
		int[] arr= new int[10];
		System.out.println(Arrays.toString(arr));
		int i=0;
		int n1=0,n2=arr.length-1;
		while(n1<=n2) {
			System.out.print("숫자 입력: ");
			int n=sc.nextInt();
			if(Math.abs(n%2)==1) {
				arr[n1]=n;
				n1++;
			}
			else {
				arr[n2]=n;
				n2--;
			}
			System.out.println(Arrays.toString(arr));
			i++;
		}
	}

}
