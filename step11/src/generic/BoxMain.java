package generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box= new Box();
		box.setObj(200);
		System.out.println(box.getObj());
		
		box.setObj(new Apple());
		System.out.println(box.getObj());
	}

}
