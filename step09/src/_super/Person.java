package _super;

public class Person extends Animal {

	private String name;

	// 자식 생성자가 부모 생성자에 필요한 값을 받아서
	// 부모 생성자에게 전달함 --> super(값...) : 부모 생성자를 호출하는 부분
	// 자식 생성자에서 제일 먼저 해야될 일이 부모 생성자를 호출하는 부분
	public Person(int age, String name) {
		super(age);// 부모 생성자를 호출
		this.name = name;
		System.out.println("Person(int , String)");
	}
	
	//printage 재정의
	@Override
	public void printAge() {
		super.printAge();
	}
	
	
	
	
}
