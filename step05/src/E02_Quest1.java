
public class E02_Quest1 {

	public static void main(String[] args) {
		//알파벳 A부터 Z까지 출력. 단, 출력은 대문자와 소문자를 다음과 같은 형식으로 출력 A - a ... Z - z
		char alpha1='a';
		int i=0;
		
		//case1. char 변수 하나로 해결
		while(alpha1<='z') {
			System.out.print((char)(alpha1-32)+" - "+(char)(alpha1)+"\n");
			alpha1++;
		}
		
		//case2. char 변수 두개로 해결		
		i=0;
		char alpha2='A';
		while(i<26) {
			System.out.println((char)(alpha2+i)+" - "+(char)(alpha1+i));
			i++;
		}
		
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch + " - " + (char) (ch+32));
		}
		
		
		
		
		
		
		
	}

}
