package method;

/*
 * 메서드or메소드
 * ㄴ클래스에서 기능을 담당
 * ㄴ형식 = 리턴타입 메서드명([매개변수]){
 * 				return 결과값; -> 리턴타입이 void가 아닐때는 반드시 나와야 함
 * 			}
 * 
 */
public class Person {
	// 이름, 나이, 성별
	// 필드 전체 초기화하는 생성자, toString, 기본생성자(기본)

	String name;
	int age;
	boolean gender;

	public Person() {
		System.out.println("기본 생성자");
	}

	public Person(String name, int age, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}                                                                                                                                                 
	
	//이름을 수정하는 메서드
	void updateName(String name) {
		this.name=name;
	}
	
	// 인적정보를 출력하는 기능 -> 이름 나이 남자/여자
	void printPersonInfo() {
		System.out.println(name + " " + age + " " + (gender ? "남자" : "여자"));
	}
	
	/**
	 *성별 정보를 외부로 보내는 메서드
	 */
	String getGender() {
		if(gender)
			return "남자";
		else
			return "여자";
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
