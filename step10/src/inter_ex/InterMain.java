package inter_ex;

public class InterMain {
	public static void main(String[] args) {
		InterClass ic=new InterClass();
		ic.interA();
		System.out.println(ic.pi);
		
		InterA intera = ic;
		System.out.println(ic.circleArea(6));
	}

}
