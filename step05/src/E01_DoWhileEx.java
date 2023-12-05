
public class E01_DoWhileEx {

	/*
	 * 		do-while
	 * 			유일하게 선처리 후검사 방식을 취함
	 * 			처음 조건이 거짓이더라도 반드시 한번은 실행을 함
	 */
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("Hello World");
			i++;
		} while (i < 5);

	}

}
