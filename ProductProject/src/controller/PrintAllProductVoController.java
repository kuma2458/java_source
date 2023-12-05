package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class PrintAllProductVoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("전체 제품정보 출력.....");
		
		ArrayList<ProductVO> list=ProductService.getInstance().getlist();
		if(list.isEmpty()) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		list.forEach(a->a.printProductVO());
		System.out.println("출력 완료");
	}

}
