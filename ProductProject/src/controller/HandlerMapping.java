package controller;

public class HandlerMapping {
	
	private static HandlerMapping instance=new HandlerMapping();
	
	private HandlerMapping() {
	}
	
	public static HandlerMapping getInstance() {
		if(instance==null)
			instance=new HandlerMapping();
		return instance;
	}


	public Controller createController(int no) {
		Controller controller= null;
		switch(no) {
		case 1:
			controller=new WriteProductVoController();
			break;
		case 2:
			controller=new SearchProductVoController();
			break;
		case 3:
			controller=new EditProductVoController();
			break;
		case 4:
			controller=new PrintAllProductVoController();
			break;
		case 5:
			controller=new PrintForJSONProduct();
			break;
		}
		return controller;
	}
}








