
public class E11_Operator4 {
	/*
	 * 		관계(비교) 연산자 : 명제, 부등식 
	 * 			결과 값은 true(1) false(0)가 나옴 
	 * 		
	 * 		> < >= <= == !=  
	 */
	public static void main(String[] args) {
		int a = 10 , b = 7;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		double d1 = 0.1, d2 = 0.2;
		
		System.out.println(d1 + d2 == 0.3);//false
		System.out.println(d1+d2);
	
		boolean result= a==b;
		System.out.println(result);
		
		
		
		
		
	}

}
