package abstract_ex;

public class Person extends Animal {

	@Override
	public void eat() {
		System.out.println("Person Constructor");
		// TODO Auto-generated method stub
		super.eat();
	}
	//추상 메서드는 반드시 오버라이딩 해줘야 한다.
	//오버라이딩을 안할경우에는 해당 클래스도 추상 클래스로 작성해야됨
	@Override
	public void run() {
		System.out.println("사람이 달립니다.");
		
	}

}
