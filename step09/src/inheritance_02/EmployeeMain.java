package inheritance_02;

public class EmployeeMain {
	public static void work(Employee e) {
		e.work();
	}
	
	public static void main(String[] args) {
		Employee ep1=new Employee();
		SalaryEmployee sp1=new SalaryEmployee();
		DispatchEmployee dp1=new DispatchEmployee();
		
		work(ep1);
		work(sp1);
		work(dp1);
		
	}

}
