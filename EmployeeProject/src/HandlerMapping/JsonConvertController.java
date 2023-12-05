package HandlerMapping;

import java.util.Scanner;


import controller.Controller;
import employeeService.EmployeeService;

public class JsonConvertController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("json 변환 저장");
		String result = EmployeeService.getInstance().employeeToJson();
		
		System.out.println(result);
//		ArrayList<EmployeeVo> list = EmployeeService.getInstance().getlist();
//		JSONArray arr= new JSONArray(list);
//		System.out.println(arr);
	}

}
