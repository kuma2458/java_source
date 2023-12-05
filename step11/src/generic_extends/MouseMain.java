package generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		MouseHub<GamingMouse> hub=new MouseHub<GamingMouse>(new GamingMouse());
		hub.click(3);
	}

}
