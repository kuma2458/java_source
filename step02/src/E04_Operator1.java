
public class E04_Operator1 {
	/*
	 * 		사칙 연산자
	 * 		1.덧셈 + 2.뺄셈 - 3.곱셈 * 4.나눗셈 / % 
	 */
	public static void main(String[] args) {
		//정수형 변수 2개 선언해서 임의의 값으로 초기화 
		int a = 10, b = 20;
		int result = 0;
		
		result = a + b;
		System.out.println(result);
		
		result = a - b;
		System.out.println(result);
		
		result = a * b;
		System.out.println(result);
		
		result = a / b;
		System.out.println(result);
		
		result = a % b;
		System.out.println(result);
		
		//실수형 변수 두개 선언한 뒤에 임의의 값으로 초기화
		//사칙연산 결과
		
		double ad=123.142, bd=1.563490;
		double resultd;
		
		resultd=ad+bd;
		System.out.println(resultd);
		
		resultd=ad-bd;
		System.out.println(resultd);
		
		resultd=ad*bd;
		System.out.println(resultd);
		
		resultd=ad/bd;
		System.out.println(resultd);
		
		resultd=ad%bd;
		System.out.println(resultd);
		
		
		
		
	}

}
