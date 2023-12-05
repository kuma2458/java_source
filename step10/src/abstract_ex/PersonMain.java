package abstract_ex;

class PersonMain {

	public static void main(String[] args) {

		Person ps=new Person();
		ps.eat();
		ps.run();
		
		
		//추상화 클래스는 직접적인 생성은 안되지만 업캐스팅은 가능
		Animal animal=ps;
		
		animal.eat();
		
		Dog dog=new Dog();
		dog.run();
		
	}

}
