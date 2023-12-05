package inheritance_01;

public class Person extends Animal{
	
	//오버라이딩(재정의) : 재구현(메서드 명이 동일, 매개변수도 동일, 접근 제어자도 동일, 리턴 타입도 동일)
	//똑같은 틀과 이름을 사용하고 기능만 다르게 작성하는것 : 오버라이딩
	//오버로딩은 기능과 리턴타입,매개변수가 다 다르지만 오버라이딩은 다 같음
	
	public Person() {
		System.out.println("Person 생성자");
	}
	
	public void run() {
		System.out.println("사람이 달립니다.");
	}
	
	//나이 출력 메서드
	public void printAge() {
		System.out.println(age);
	}
	
	
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}
	
	
}
