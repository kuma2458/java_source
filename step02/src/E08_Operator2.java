
public class E08_Operator2 {
	/*
	 * 			복합 대입 연산자: 연산 결과를 왼쪽에 있는 변수에 연산 후 저장( 누적 )
	 * 			+= -= *= /=
	 */
	public static void main(String[] args) {
		//미션1. 정수형 변수를 하나 선언해서 10을 저장한 뒤 해당 변수에 10을 더해서 저장하는 코드를 작성
		
		int a = 10;
		
		a += 10;
//		a=a+10;
		System.out.println(a);
		
		a -= 5;
		System.out.println(a);
		
		a *= 8;
		System.out.println(a);
		
		a /= 6;
		System.out.println(a);
		
		String address = "서울시 ";
		address +="강서구 ";
		address +="화곡동 ";
		address +="xx호";
		
		System.out.println(address);
		
		
		
	}

}
