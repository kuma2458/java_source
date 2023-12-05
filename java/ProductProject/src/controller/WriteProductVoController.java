package controller;

import java.util.Scanner;

import service.ProductService;

public class WriteProductVoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품 정보 등록....");
		System.out.print("제품번호:");
		String productNo=sc.nextLine();
		System.out.print("제품명:");
		String productName=sc.nextLine();
		System.out.print("제조사:");
		String productmaker=sc.nextLine();
		System.out.print("재고:");
		int productmany=sc.nextInt();
		sc.nextLine();
		System.out.print("창고위치:");
		String productsave=sc.nextLine();
		
		boolean result=ProductService.getInstance().WriteProductVo(productNo,productName,productmaker,productmany,productsave);
		
		if(result) {
			System.out.println("등록완료");
		}
		else {
			System.out.println("중복된 제품번호입니다");
		}
	}

}
