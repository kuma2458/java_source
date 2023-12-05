package vo;

import java.util.Objects;

import org.json.JSONPropertyName;

public class ProductVO {
	//제품번호, 제조사, 재고, 창고위치
	private String productNo;
	private String productName;
	private String productmaker;
	private int productmany;
	private String productsave;
	public ProductVO(String productNo, String productName, String productmaker, int productmany, String productsave) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.productmaker = productmaker;
		this.productmany = productmany;
		this.productsave = productsave;
	}
	@JSONPropertyName("제품번호")
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	@JSONPropertyName("제품이름")
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@JSONPropertyName("제조사")
	public String getProductmaker() {
		return productmaker;
	}
	public void setProductmaker(String productmaker) {
		this.productmaker = productmaker;
	}
	@JSONPropertyName("재고")
	public int getProductmany() {
		return productmany;
	}
	public void setProductmany(int productmany) {
		this.productmany = productmany;
	}
	@JSONPropertyName("창고위치")
	public String getProductsave() {
		return productsave;
	}
	public void setProductsave(String productsave) {
		this.productsave = productsave;
	}
	@Override
	public int hashCode() {
		return Objects.hash(productName, productNo, productmaker, productmany, productsave);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVO other = (ProductVO) obj;
		return Objects.equals(productNo, other.productNo);
	}
	
	public void printProductVO() {
		System.out.printf("제품번호: %s 제품명: %s 제조사: %s 재고: %d 창고위치: %s\n",
				productNo,productName,productmaker,productmany,productsave);
	}
}
