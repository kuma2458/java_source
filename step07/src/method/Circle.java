package method;

public class Circle {
	//변수 : 반지름
	//메서드 : 원넓이 구하는 메서드, 원둘레 구하는 메서드
	int r;
	
	public Circle() {
	}

	public Circle(int r) {
		super();
		this.r = r;
	}

	/**
	 * 원넓이 구하는 메서드
	 */	
	double circleArea() {
		return r*r*Math.PI;
	}
	/**
	 * 원둘레 구하는 메서드
	 */	
	double circumference() {
		return r*2*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}


	
	
}
