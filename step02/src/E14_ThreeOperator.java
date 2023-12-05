
public class E14_ThreeOperator {
	/*
	 * 		삼항 연산자 
	 * 		조건식이 true/false 일 때 실행할 연산을 구분해주는 연산자 
	 * 		ex) 조건식 ?(조건식이 참일때 출력될 값):(조건식이 거짓일때 출력될 값);
	 */
	public static void main(String[] args) {
		int n1 = 10, n2 = 7;
		int result = n1 > n2 ? n1 : n2;
		System.out.println(result);
	}

}
