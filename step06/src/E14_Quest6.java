import java.util.Arrays;
import java.util.Scanner;

public class E14_Quest6 {

	public static void main(String[] args) {
		// 길이가 10인 정수형 배열을 생성하고, 랜덤으로 1~20까지의 숫자를 생성해 배열에 저장
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20) + 1;
		}

		System.out.println(Arrays.toString(arr));

		// 배열에 있는 데이터를 삭제
		Scanner sc = new Scanner(System.in);
		// 삭제할 숫자 입력
		while(true) {
			System.out.println("삭제하고 싶은 숫자를 입력하세요");
			int num = sc.nextInt();
			if(num==-1) break;
			int check = -1;
			for (int i = 0; i < arr.length; i++) {
				if (check == 0)
					i = 0;
				if (num == arr[i]) {
					check = i;
					for (int j = i; j < arr.length - 1; j++) {
						arr[j] = arr[j + 1];
						if (j + 1 == arr.length - 1) {
							arr[arr.length - 1] = 0;
						}
					}
//					arr[arr.length-1]=0;
					System.out.println(Arrays.toString(arr));
					continue;
				}
			}

		}
		System.out.println(Arrays.toString(arr));
		// 반복문 1. 삭제할 데이터가 있는 인덱스 찾기
		// 배열의 내용을 한칸씩 앞으로 땡기기
		// 출력

	}

}
