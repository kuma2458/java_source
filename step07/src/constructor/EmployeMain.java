package constructor;

public class EmployeMain {

	public static void main(String[] args) {
		Employee em1=new Employee("123","김철수","영업부",2900);
		Employee em2=new Employee();
		System.out.println(em1);
		System.out.println(em2);
		
		
	}

}
