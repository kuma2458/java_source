package Collection;

import java.util.Objects;

public class Person implements Comparable<Person> {
	// 이름 나이
	// 생성자로 필드 초기화
	// toString
	// hashCode
	// equals

	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Person hashCode - " +Objects.hash(name, age));
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Person equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && age == other.age;
	}

	// 기준값=비교값 : 0 / 기준값 < 비교값 : 1 / 기준값 > 비교값 : -1
	@Override
	public int compareTo(Person o) {
		if (this.equals(o)) {
			return 0;
		} else if (hashCode() > o.hashCode()) {
			return 1;

		} else
			return -1;
	}

}
