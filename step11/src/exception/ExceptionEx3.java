package exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(5/2);
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println(3);
		}
		finally {//에러가 나든안나든 무조건 실행되야하는 코드가 들어갈 영역
			System.out.println(4);
		}
		System.out.println("end");
		
		
	}

}
