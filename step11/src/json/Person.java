package json;

import org.json.JSONPropertyIgnore;
import org.json.JSONPropertyName;

//이름 나이
//생성자 초기화
//set,get 
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@JSONPropertyName("nn")
//	@JSONPropertyIgnore
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
