package test;

public class TestMain {

	public static void main(String[] args) {
		System.out.println((int)'\r' + " " + (int)'\n');// '\r\n' : 엔터
		IoTest io = new IoTest();
		System.out.println(io.readline());
		io.println("안녕하세요");
	}

}
