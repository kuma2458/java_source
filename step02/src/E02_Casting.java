
public class E02_Casting {
	/*
	 * 			데이터 형변환 : 데이터 타입을 바꾸는 행위
	 * 			
	 * 				1. 자동으로 형변환(오토캐스팅)
	 * 					-수의 체계상 작은 개념이 큰 개념과 계산하는 부분에서 자동으로 형변환
	 * 						-정수와 실수를 계산 했을때 둘 중 더 큰 실수로 형변환 됨
	 * 					-메모리 바이트 수가 작은 타입이 큰 타입과 계산했을 때 
	 * 					 바이트 수가 작은 타입이 큰 타입으로 형변환된다.
	 * 					
	 * 				2. 강제로 형변환(캐스팅) : 데이터 손실이 일어날 수 있음
	 * 					-수의 체계상 큰 개념을 작은 개념으로 바꿔야 할 때 
	 * 					 ex) 실수를 정수로 변환할 때
	 * 					-메모리 바이트 수가 큰 타입이 작은 타입으로 바꿔야 할 떄
	 * 				  	 ex) double을 float로 변환할 때
	 * 
	 */

	public static void main(String[] args) {
		//자동 형변환
		int n =120;
		double d = n;
		System.out.println(d);
		System.out.println(d/7);

		short s = 1000;//byte short는 int형에서 자동으로 형변환 되서 저장
		System.out.println(s);
		
		long l =100l;
		System.out.println(l+s);
		
		float f= 3.1415f;
		System.out.println(d+f);
		
		//문자를 계산하면 정수형으로 자동으로 형변환
		System.out.println('A'+1);
		System.out.println('A'+'B');
		
		//강제 형변환하는 방법 (바꾸고싶은 타입명)값or변수;
		double pi = -3.1415;
		int i = (int)pi;
		System.out.println(i);
		System.out.println(pi);
		
		int a = 65;
		//a를 출력할 때 대문자 A가 나오게끔 처리하기
		System.out.println((char)a);
		
		
	}

}
