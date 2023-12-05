package io;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = -4023774257166273831L;
	//문자열: writer , reader
	//객체 : outputstream
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}	
