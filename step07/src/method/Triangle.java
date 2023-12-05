package method;

public class Triangle {
	//변수 : 밑변, 높이
	//메서드 : 삼각형 넓이 구하는 메서드
	int w;//밑변
	int h;//높이
	
	public Triangle() {
	}

	public Triangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	
	/**
	 * 삼각형 넓이 구하는 메서드
	 */	
	double triArea() {
		return h*w/2.0;
	}
	
	@Override
	public String toString() {
		return "Triangle [w=" + w + ", h=" + h + "]";
	}
	
	
	
}
