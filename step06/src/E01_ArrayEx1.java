import java.util.Scanner;
public class E01_ArrayEx1 {
	/*
	 * 		배열(Array)
	 * 			변수 선언시 하나의 변수명으로 동시에 여러개 값을 저장할 공간을 만드는 자료구조
	 * 			
	 * 		인덱스(Index)
	 * 			0부터 배열길이-1까지 
	 * 			동시에 여러개 선언된 배열의 요소들을 구분하는 번호표
	 * 		
	 * 		배열 생성 방법
	 * 			변수타입[] 변수명 = new 변수타입[개수];	
	 * 
	 * 		
	 */
	public static void main(String[] args) {
		//정수형 배열 5개짜리로 선언

		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		Scanner sc =new Scanner(System.in);
		
		
	}

}
