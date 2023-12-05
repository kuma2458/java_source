
public class E01_VariableType {
	/*
	 * 		변수 타입
	 * 			정수형 : byte(1) short(2) int(4) long(8)
	 * 			실수형 : float(4) double(8)
	 * 			문자형 : char(2)
	 * 			논리형 : boolean(1)
	 * 
	 * 		변수명 문법
	 * 			1.알파벳 대소문자,숫자,언더바,$
	 * 			2.키워드와 다른 이름으로 해야 됨
	 * 			3.첫 글자로는 숫자 불가능
	 * 			4.중복 변수명 x	
	 * 		
	 * 		변수명 네이밍 규칙
	 * 			1.변수명의 첫 글자는 소문자로 시작
	 * 			2.합성어의 두번째 단어부터 첫글자는 대문자
	 * 			
	 */
	public static void main(String[] args) {
		
		//정수형
		long l = 4294967296L;
		System.out.println(l);
		
		short s = 100;
		System.out.println(s);
		
		byte b = 127;
		System.out.println(b);
		
		b++;
		System.out.println(b);
		
		//실수형
		double d = 3.1415;
		System.out.println(d);
		
		float f = 3.1415f;
		System.out.println(f);
		
		//논리형
		boolean bl =  true;
		System.out.println(bl);
		bl = false;
		System.out.println(bl);
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = 'B';
		System.out.println(ch2);
		
		int i1 = ch1,i2=ch2;
		System.out.println(i1+", "+i2);
		
		i1='a';
		System.out.println(i1);
		
		char ch3='가';
		
		int i3 = ch3;
		System.out.println(i3+" "+ch3);
		
		//문자열
		String str ="안녕하세요";
		System.out.println(str);
		
		str = "Hello World";
		System.out.println(str);
		
		//다른 변수 : 고정형 / 문자열 : 참조형
		
		
		
		
		
	}

}
