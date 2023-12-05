package controller;

import java.util.Scanner;


import service.ProductService;

public class PrintForJSONProduct implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보를 JSON 데이터로 뽑기...");
		ProductService.getInstance().printJSON();
//		String str=ProductService.getInstance().printJSON1();
//		System.out.println(str);
		System.out.println("출력 완료");
		
		
		
	}

}
