package object;

public class Person {
	//이름, 나이
	// 필드 전체 초기화 하는 생성자
	private String name;
	private int age;
	
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//객체가 가지고 있는 정보나 값들을 문자열로 리턴하는 메서드
	//객체를 문자열 연산이나 출력시 자동으로 호출되는 메서9드
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//1. 메모리 주소가 같으면 같은 객체
		if (this==obj) return true;
		//2. 받아온 obj가 현재 객체랑 비교할 수 있는 타입인지 확인
		// instanceof 쓰는 방법, getclass로 비교하는 방법 한번
		if(obj.getClass().getSimpleName().equals(this.getClass().getSimpleName()))
			return true;
		if(obj instanceof Person) {
			//3.받아온 객체를 형변환
			Person temp=(Person) obj;
			//4. 내부에 있는 값을 비교해서 비교 결과를 리턴
			return name.equals(temp.name)&&age==temp.age;			
		}
				
		return false;
	}
	
	//객체를 식별하는 고유한 정수값을 반환하는 메서드
	@Override
	public int hashCode() {
		//객체들을 식별하기 위한 ID코드
		return name.hashCode()+ age;
	}
	
	
	
}
