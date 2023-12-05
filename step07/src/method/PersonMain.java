package method;

public class PersonMain {

	public static void main(String[] args) {
		Person ps1 = new Person("김둥현", 26, true);
		ps1.printPersonInfo();
		ps1.updateName("김동현");
		System.out.println(ps1.getGender());
		
	}

}
