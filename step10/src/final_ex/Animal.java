package final_ex;

public class Animal {
	//클래스에 final이 붙어 있으면 해당 클래스를 상속 받을 수가 없다.
	private final int age;//이렇게 선언만할거면 생성자에서 초기화를 해줘야함
	
	public Animal(int age) {
		this.age = age;
	}

	//final이 붙은 메서드는 오버라이드가 안됨
	public final void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	private void test() {
		System.out.println("Animal test");
	}
}
