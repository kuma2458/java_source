package service;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();
	private static ArrayList<ProductVO> list;

	public ProductService() {
		list = new ArrayList<ProductVO>();
	}

	public static ProductService getInstance() {
		if (instance == null)
			instance = new ProductService();
		return instance;
	}

	public boolean WriteProductVo(String productNo, String productName, String productmaker, int productmany,
			String productsave) {
		if (list.contains(new ProductVO(productNo, null, null, 0, null)))
			return false;
		else
			return list.add(new ProductVO(productNo, productName, productmaker, productmany, productsave));
	}

	public ArrayList<ProductVO> getlist() {
		return list;
	}

	public ProductVO FindProductVO(String productNo) {
		if (list.indexOf(new ProductVO(productNo, null, null, 0, null)) == -1) {
			return null;
		}
		return list.get(list.indexOf(new ProductVO(productNo, null, null, 0, null)));
	}

	public void printJSON() {
		if (list.isEmpty()) {
			System.out.println("저장된 정보가 없습니다");
			return;
		}
		JSONArray arr = new JSONArray(list);
		for (int i = 0; i < arr.length(); i++) {
			JSONObject js = arr.getJSONObject(i);
			System.out.println(js.toString());
		}
	}
	
	public String printJSON1() {
		JSONArray arr=new JSONArray(list);
		return arr.toString();
	}

}
