package access;

public class Employee {
	// 사번
	// 이름
	// 급여
	// 부서명

	String epNO;
	String epName;
	private int money;
	String department;

	public Employee(String epNO, String epName, int money, String department) {
		super();
		this.epNO = epNO;
		this.epName = epName;
		this.money = money;
		this.department = department;
	}

	/**
	 * 급여수정 메서드
	 */

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getEpNO() {
		return epNO;
	}

	public void setEpNO(String epNO) {
		this.epNO = epNO;
	}

	public String getEpName() {
		return epName;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	void printEmployeeInfo() {
		System.out.printf("%s %s %d %s", epNO, epName, money, department);
	}

}
