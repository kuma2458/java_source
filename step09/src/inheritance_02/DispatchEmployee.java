package inheritance_02;

public class DispatchEmployee extends Employee{

	
	public DispatchEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("직원이 파견을 갑니다.");
	}

	
}
