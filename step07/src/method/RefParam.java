package method;

import java.util.Arrays;

public class RefParam {
	/*
	 * Call by Reference : 참조에 의한 호출 ->> 메모리 주소값이 전달
	 * 		메모리 주소가 전달되기 때문에 다른 메서드에서 수정 작업을 하면 원본도 바뀌고 저장됨
	 * Call by Value : 갑을 복사해서 보내기 때문에 원본 값에는 영향을 미치지 않는다.
	 * 
	 */
	public static void resetName(Person p) {
		p.updateName("초기화");
	}
	
	public static void addNumber(int n) {
		n+=1;
	}
	
	//정수형 배열을 매개변수 받는 메서드 생성해서, 받아온 배열에 값을 1씩 증가시키는 메서드를 작성
	
	public static void addone(int ... a) {
		for(int i=0; i<a.length; i++) {
			a[i]++;
		}
	}
	public static void main(String[] args) {
		Person a = new Person("김철수", 25, true);
		a.printPersonInfo();
		resetName(a);
		a.printPersonInfo();
		
		int n = 100;
		System.out.println(n);
		addNumber(n);
		System.out.println(n);
		
		int sum=0;
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		for(int d:arr) {
			sum+=d;
		}
		System.out.println(sum);
		
		addone(arr);
		sum=0;
		System.out.println(Arrays.toString(arr));
		for(int d:arr) {
			sum+=d;
		}
		System.out.println(sum);
		
	}

}
