
public class E10_Quest5 {

	public static void main(String[] args) {
		// 문자형 배열에 저장된 내용을 전부 거꾸로 뒤집어서 저장한 후에 문자열로 만들어서 출력
		String str = "Hello World";
		char[] arr = str.toCharArray();
//		char[] arr1 = new char[11];
		char arr2;

		// case1. 새로운 문자형배열 선언해서 새로 저장
//		for (int i = 0; i < arr.length; i++) {
//			arr1[i] = arr[(arr.length - 1) - i];
//		}
           
		// case2. for문을 문자형배열길이의 절반까지만 돌리기
		for (int i = 0; i < (arr.length) / 2; i++) {

			arr2 = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr2; 
		}
		
		// case3. 인덱스가 배열길이 절반넘어갈때 break걸기
//		for (int i = 0; i < arr.length; i++) {
//			if (i >= arr.length / 2)
//				break;
//			arr2 = arr[i];
//			arr[i] = arr[arr.length - 1 - i];
//			arr[arr.length - 1 - i] = arr2;
//		}

		str = new String(arr);
		System.out.println(str);

	}

}
