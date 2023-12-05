import java.util.Scanner;
public class E06_Quest3 {

	public static void main(String[] args) {
		//정수형 배열 길이가 10인 배열을 생성한 후에 정수를 입력받아 배열에 저장한 후 배열에 저장된 값들 중 최대,최소,총합 출력
		//필수 : 배열, 최대,최소,총합
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[10];

		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"번째 정수 입력 : ");
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0],sum=0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i])
				max=arr[i]; 
			if(min>arr[i])
				min=arr[i];
			sum+=arr[i];
		}
		System.out.println("최댓값: "+max);
		System.out.println("최솟값: "+min);
		System.out.println("총합: "+sum);
		
		
		
	}

}
