package String;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String str1= "Hello World";
		//저장하고 있는 문자열을 바이트형 배열로 변환
		
		byte[] arr=str1.getBytes();
		
		System.out.println(Arrays.toString(arr));
		
		//해당 인덱스 번호에 위치한 문자 하나 리턴
		System.out.println(str1.charAt(4));
		
		
		String str2="Hello World Hello Java World";
		//문자열 왼쪽부터 검색
		
		System.out.println(str2.indexOf("z"));
		System.out.println(str2.indexOf("World",7));
		System.out.println(str2.indexOf("World",23));

		//문자열 끝에서부터 검색
		
		//알파벳을 소문자로 변환
		System.out.println(str2.toLowerCase());
		//알파벳을 대문자로 변환
		System.out.println(str2.toUpperCase());

		//문자열 길이 리턴
		System.out.println(str2.length());
		
		//문자열 부분 추출, 10번 인덱스부터 마지막 인덱스까지 문자열을 잘라서 리턴
		System.out.println(str2.substring(10,15));
		
		//문자열 바꾸기
		System.out.println(str2.replace("Hell", "Wolrd "));
		
		String str3= "                  Hello Wolrd                  ";
		
		System.out.println(str3.length());
		System.out.println(str3);
		
		//문자열 양쪽에 필요없는 공백을 제거
		System.out.println(str3.trim());
		System.out.println(str3.trim().length());
		
		String str4="java,html,css,javascript,jsp,spring";
		String[] result=str4.split(",");
		System.out.println(Arrays.toString(result));
		//문자열 배열을 하나의 문자열로 구분자를 넣어서 만들어줌
		System.out.println(String.join(",", result));
		
		
		
		
		
		
		
	}
}
