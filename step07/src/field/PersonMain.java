package field;

public class PersonMain {

	public static void main(String[] args) {
		Person ps = new Person();// new 는 메모리 할당, Person 이라는 변수에 Person 객체를 선언해줌
		System.out.println("이름은 "+ps.name+"이고 나이는 "+ps.age+"세입니다");
		ps.age = 26;
		ps.name = "김동현";
		System.out.println("이름은 "+ps.name+"이고 나이는 "+ps.age+"세입니다");

		Person ps2= new Person();
		
		ps2.age=20;
		ps2.name="철수";
		System.out.println("이름은 "+ps2.name+"이고 나이는 "+ps2.age+"세입니다");
		
		
	}

}
