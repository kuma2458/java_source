package HandlerMapping;

import controller.Controller;

public class HandlerMapping {

	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		if (instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createcontroller(int n) {
		Controller controller = null;
		switch (n) {
		case 1:
			controller = new saveEmvoController();
			break;
		case 2:
			controller = new deleteEmvoController();
			break;
		case 3:
			controller = new editEmvoController();
			break;
		case 4:
			controller = new FindEmvoController();
			break;
		case 5:
			controller = new PrintEmvoController();
			break;
		case 6:
			controller = new JsonConvertController();
			break;
		case 7:
			break;
		case 8:
			break;
		}
		return controller;
	}

}
