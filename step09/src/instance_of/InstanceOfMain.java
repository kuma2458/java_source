package instance_of;

public class InstanceOfMain {

	public static void main(String[] args) {
		Person p = new Person();
		Animal a = p; // 자동으로 형변환, 작은개념이 큰 개념이 되는 경우
		Person s = (Person) a;
//		dog d= (dog)a;

		System.out.println(p instanceof Person);
		System.out.println(p instanceof Animal);
		System.out.println(a instanceof dog);
		System.out.println(a instanceof Person);

		System.out.println(p.getClass().getSimpleName());
		System.out.println(a.getClass().getSimpleName());
		System.out.println(s.getClass().getSimpleName());
		System.out.println(Person.class.getSimpleName());

	}

}
