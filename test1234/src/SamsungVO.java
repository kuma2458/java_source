public class SamsungVO {
	private String info;// 제품명
	private String madeby;// 제조사
	private int price;// 금액
	private String madein;// 원산지

	public SamsungVO() {//필드 초기화 생성자
		info = "갤럭시S23";
		madeby = "삼성";
		price = 1200000;
		madein = "한국";
	}

	public String getInfo() {// 제품명 get()
		return info;
	}

	public void setInfo(String info) {// 제품명 set()
		this.info = info;
	}

	public String getMadeby() {// 제조사 get()
		return madeby;
	}

	public void setMadeby(String madeby) {// 제조사 set()
		this.madeby = madeby;
	}

	public int getPrice() {// 금액 get()
		return price;
	}

	public void setPrice(int price) {// 금액 set()
		this.price = price;
	}

	public String getMadein() {// 원산지 get()
		return madein;
	}

	public void setMadein(String madein) {// 원산지 set
		this.madein = madein;
	}

	@Override
	public String toString() {// toString()
		return "SamsungVO [Info=" + info + ", madeby=" + madeby + ", price=" + price + ", madein=" + madein + "]";
	}

	public void printinfo() {// 제품정보 출력
		System.out.print(info + " " + madeby + " " + price + " " + madein + " ");
	}

}
