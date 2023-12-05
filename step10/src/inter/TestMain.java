package inter;

public class TestMain {

	public static void eat(Eat e) {
		e.eat();
	;
	}
	public static void main(String[] args) {
		HighScoolStudent hs=new HighScoolStudent();
		Dog dog= new Dog();
		Animal animal =new Animal();
		
		hs.eat();
		dog.eat();
		animal.eat();
		
		eat(hs);
		eat(dog);
		eat(animal);
		
		
	}

}
