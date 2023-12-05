package static_ex;

public class Number {

	private static int count = 0;
	private static Number instance=new Number();
	
	// private 생성자는 외부에서 생성을 못하게 막음
	private Number() {
		System.out.println("Number 객체 생성 완료");
		count++;
	}

	public static Number getInstance() {
		if(instance==null)
			instance=new Number();
		return instance;
	}

	public static int getCount() {
		return count;
	}


	
}
