package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			int[] arr = null;
			arr[0] = 100;
			System.out.println(2);
			arr[5] = 100 / 2;
			System.out.println(3);
		} catch (NullPointerException e) { //nulll값 에러
			System.out.println(4);
			System.out.println(e.getMessage());
			// TODO: handle exception
		} catch (ArithmeticException e) { // 산술 에러
			System.out.println(5);
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {// 범위벗어난 에러
			System.out.println(6);
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(7);
			System.out.println(e.getMessage());
		}
		System.err.println("end");

	}

}
