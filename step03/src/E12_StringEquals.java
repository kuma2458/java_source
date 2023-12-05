
public class E12_StringEquals {

	public static void main(String[] args) {
		String str1 = "안녕하세요";
		String str2 = new String("안녕하세요");
		String str3 = str2;
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1);
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str2));
	}

}
