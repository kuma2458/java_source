package inheritance_02;

public class SalaryEmployee extends Employee{

	
	
	public SalaryEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("직원이 영업을 합니다.");
	}

}
