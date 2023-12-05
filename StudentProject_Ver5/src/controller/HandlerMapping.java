package controller;

public class HandlerMapping {

	// 싱글턴 패턴
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {

	}

	public static HandlerMapping getInstance() {
		if (instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(int no) {
		Controller controller =null;
		switch(no) {
		case 1:
			controller=new AddStudentController();
			break;
		case 2:
			controller=new SearchStudentController();
			break;
		case 3:
			controller=new EditStudentController();
			break;
		case 4:
			controller=new DeleteStudentController();
			break;
		case 5:
			controller=new PrintStudentController();
			break;
		case 6:
			controller=new PrintFirstStudentController();
			break;
		case 7:
			controller=new SearchStudentNameController();
			break;
		case 8:
			controller=new PrintDepartmentController();
			break;
		}
		return controller;
	}
	
	
	
	
	
	
	
}
