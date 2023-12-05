package controller;

import java.util.Scanner;

import service.ProductService;
import vo.ProductVO;

public class EditProductVoController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("제품정보 수정...");
		System.out.print("수정하실 제품정보의 제품번호를 입력하세요: ");
		String pdNo = sc.nextLine();
		ProductVO pdvo = ProductService.getInstance().FindProductVO(pdNo);
		if (pdvo == null) {
			System.out.println("입력하신 제품번호에 해당되는 제품정보가 없습니다.");
			return;
		} else {
			System.out.print("수정할 제품명: ");
			pdvo.setProductName(sc.nextLine());
			System.out.print("수정할 제조사: ");
			pdvo.setProductmaker(sc.nextLine());
			System.out.print("수정할 제품명: ");
			pdvo.setProductName(sc.nextLine());
			System.out.print("수정할 재고: ");
			pdvo.setProductmany(sc.nextInt());
			System.out.print("수정할 창고위치: ");
			sc.nextLine();
			pdvo.setProductsave(sc.nextLine());

			System.out.println("수정한 정보");
			pdvo.printProductVO();
		}
	}

}
