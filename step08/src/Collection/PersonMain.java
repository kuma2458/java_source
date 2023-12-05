package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class PersonMain {


	public static void main(String[] args) {
		HashSet<Person> set1 = new HashSet<Person>();

		set1.add(new Person("홍길동", 25));
		set1.add(new Person("홍길동", 25));
		set1.add(new Person("김철수", 22));
		set1.add(new Person("박하나", 21));
		set1.add(new Person("김이", 24));
		System.out.println(set1);

		TreeSet<Person> set2 = new TreeSet<Person>();

		set2.add(new Person("홍길동", 25));
		set2.add(new Person("홍길동", 25));
		set2.add(new Person("김철수", 22));
		set2.add(new Person("박하나", 21));
		set2.add(new Person("김이", 24));

		System.out.println(set2);
	}

}
