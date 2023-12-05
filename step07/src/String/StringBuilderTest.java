package String;

public class StringBuilderTest {

	public static void main(String[] args) {
		//String 타입은 문자열 상수로 저장하기 때문에 문자열을 가지고 값을 변경하면 새로운 메모리가 할당됨
		String str = "Hello";
		System.out.println(System.identityHashCode(str));//변경전 str
		str= str.replace("l", "a");
		System.out.println(System.identityHashCode(str));//변경후 str
		//두 str의 메모리주소가 다른걸 볼 수 있음
		str+=10;
		System.out.println(System.identityHashCode(str));//변경후 str
		
		StringBuilder stringBuilder=new StringBuilder("Hello");
		System.out.println(stringBuilder+" "+System.identityHashCode(stringBuilder));
		stringBuilder.append(" Test");
		System.out.println(stringBuilder+" "+System.identityHashCode(stringBuilder));
		stringBuilder.delete(0, 4);
		System.out.println(stringBuilder+" "+System.identityHashCode(stringBuilder));
		
		
		
		
		
		
		
	}

}
