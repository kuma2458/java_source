
public class VariableEx {

	public static void main(String[] args) {
		/*
		 * 데이터 형태
		 * 정수 : 양수, 음수, 0
		 * 실수 : 정수에서 소수점이 추가된 형태 
		 * 문자 : 한글자
		 * 문자열 : 문자가 한 개 이상 구성된 형태 
		 * 논리값 : true, false 값
		 * 
		 * 변수(Variable) : 데이터를 하나 저장할 공간
		 * 
		 * 변수 선언 방법 : 변수타입 변수명; 
		 */
		
		int num; //num이라는 이름으로 정수를 저장할 공간을 임대 받았다.
//		초기화(initialize) : 변수를 만든 후에 데이터를 저장하는 행위
		num = 100;//100을 변수 num에 저장하겠다.
		System.out.println(num);
		
		num = 200;
		System.out.println(num);  
		
		num = 300;
		System.out.println(num);
		
		int age =10;//변수를 선언하자마자 초기화
		System.out.println(age);
		
		//정수형 변수를 세 개 선언한 뒤 데이터를 각각 10 20 30으로 초기화 후에 출력
		int a=10,b=20,c=30;
		System.out.println(a+", "+b+", "+c);
		
		
	}

}
