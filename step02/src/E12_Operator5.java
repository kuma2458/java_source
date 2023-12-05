
public class E12_Operator5 {
	/*
	 * 		논리연산자 : 조건식들을 두 개 이상 사용하거나, 조건식의 결과를 반대로 뒤집을 떄 사용
	 * 			AND : 양쪽의 조건식들이 모두 TRUE일때 TRUE, 하나라도 FALSE면 FALSE &&
	 * 			OR  : 양쪽의 조건식들이 하나라도 TRUE일때 TRUE, 둘 다 FALSE일때만 FALSE ||
	 * 			NOT : 조건식의 결과를 반대로 뒤집는 연산 !
	 */
	public static void main(String[] args) {
		int n1 = 10, n2 = 5;
		 
		//n1이 5보다 크고, 20보다 작냐?
		System.out.println((n1>5)&&(n1<20));
		
		//n1이 5보다 크거나 n2가 10이냐?
		System.out.println(n1>5||n2==10);
		
		//n1이 짝수이거나 n2가 5보다 크고 10보다 작냐?
		boolean result =  n1 % 2 == 0 || (n2 > 5 && n2 < 10);
		System.out.println(result);
		System.out.println(!result);
		
	}	

}
