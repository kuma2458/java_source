package generic_extends;

public class MouseHub<T extends Mouse> {
	private T mouse;
	
	
	
	public MouseHub(T mouse) {
		this.mouse = mouse;
	}
	
	
	
	public void click(int n) {
		mouse.click(n);
	}

	public void wheel() {
		mouse.wheel();
	}

	
	
}
