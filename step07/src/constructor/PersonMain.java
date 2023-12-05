package constructor;

public class PersonMain {

	public static void main(String[] args) {
		Person ps = new Person();
		ps.name = "김철수";
		ps.age = 20;
		System.out.println(ps.name + " " + ps.age);
		Person ps2 = new Person("영희", 27);
		System.out.println(ps2.name + " " + ps2.age);
		Person ps3 = new Person("훈이");
		System.out.println(ps3.name + " ");
		
	}
}
