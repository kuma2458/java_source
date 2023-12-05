package inter_ex;

/*
 * 	인터페이스(interface)
 * 	클래스 대용품으로 기능을 기준으로 묶기위해 사용함. 메모리가 직접적으로 할당되지 않아 생성불가능
 * 	전역상수, 추상메서드, 디폴트 메서드. 인터페이스들 끼리도 상속 및 다중 상속 가능
 * 
 * 
 */
public interface InterA {
	public static final double pi = 3.14;
	// 인터페이스 안에는 메모리를 잡아먹는건 안됨. static,final같은 거 붙일수있음
	// 전역상수 : 누구든지접근가능하지만 변경불가능
	// 인터페이스에서는 public, abstract 생략 가능
	// 인터페이스는 생성x
	void interA();
	
	
	default double circleArea(double r) {
		return r*r*pi;
	}
}
