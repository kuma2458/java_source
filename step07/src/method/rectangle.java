package method;

public class rectangle {
	//변수 : 가로 세로 
	//메서드 : 직사각형 넓이 구하는 메서드 , 직사각형의 둘레 구하는 메서드
	int w;//가로
	int h;//세로
	
	public rectangle() {
	}
	
	public rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}
	/**
	 * 직사각형 넓이 구하는 메서드
	 */	
	int rectangleArea() {
		return w*h;
	}
	/**
	 * 직사각형 둘레 구하는 메서드
	 */	
	int rectangleround() {
		return h*2+w*2;
	}
	@Override
	public String toString() {
		return "rectangle [w=" + w + ", h=" + h + "]";
	}
	
	
}
