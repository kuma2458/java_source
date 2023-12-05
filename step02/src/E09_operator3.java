
public class E09_operator3 {
	/*
	 * 		증감 연산자 : 변수의 값을 1씩 증가, 감소하는 연산자
	 * 				   =이 없어도 값을 변경시켜서 저장하는 연산자
	 * 
	 * 		ex) 변수++; 변수--; ++변수; --변수;
	 * 
	 * 			전위형 : 앞에 ++ 혹은 --가 붙어있는 형태, 변수가 속한 연산을 하기 전에 증감한다
	 * 			후위형 : 뒤에 ++ 혹은 --가 붙어있는 형태, 변수가 속한 연산을 한 후에 증감
	 */
	public static void main(String[] args) {
		
		int n = 10;
		n++;
		System.out.println(n);
		++n;
		System.out.println(n);
		
		
		
		int a = 10;
		
		System.out.println(a);//10
		System.out.println(a++);//10
		System.out.println(a);//11
		
		int b = 10;
		
		System.out.println(b);//10
		System.out.println(++b);//11
		System.out.println(b);//11
		
	}

}
