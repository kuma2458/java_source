package constructor;

public class Employee {
	//사번,이름,부서,급여
	
	String emNum;
	String emName;
	String part;
	int money;
	
	public Employee(String emNum, String emName, String part, int money) {
		super();
		this.emNum = emNum;
		this.emName = emName;
		this.part = part;
		this.money = money;
	}

	public Employee() {
		System.out.println("기본 생성자");
	}

	@Override
	public String toString() {
		return "Employee [emNum=" + emNum + ", emName=" + emName + ", part=" + part + ", money=" + money + "]";
	}
	
	
	
}
