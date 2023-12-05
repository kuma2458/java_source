package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class SearchProductVoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 검색....");
		System.out.print("검색하고 싶은 제품정보의 제품번호를 입력하세요 : ");
		String productNo=sc.nextLine();
		ProductVO pdvo=ProductService.getInstance().FindProductVO(productNo);
		
		if(pdvo==null) {
			System.out.println("입력하신 제품번호와 일치하는 제품정보가 없습니다.");
			return;
		}
		else {
			pdvo.printProductVO();
			System.out.println("출력완료");
		}
	}

}
