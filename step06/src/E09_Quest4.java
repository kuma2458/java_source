
public class E09_Quest4 {

	public static void main(String[] args) {
		// 모든 소문자를 대문자로 바꿔서 저장

		String str = "Hello World";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z')
				arr[i] -= 32;
			else
				continue;
		}

		str = new String(arr);
		System.out.println(str);

	}

}
