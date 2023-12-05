
public class E12_MathEx {

	public static void main(String[] args) {
		// 절대값구하기
		System.out.println(Math.abs(-123));
		
		//올림
		
		System.out.println(Math.ceil(-3.4));
		System.out.println(Math.ceil(3.4));
		//내림
		
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(-3.4));
		//반올림
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(-3.4));

		System.out.println(Math.max(20, 30));
		System.out.println(Math.min(20, 30));
		System.out.println(Math.PI);
		
		System.out.println(Math.sin(0.7854));
		System.out.println(Math.cos(45));
		System.out.println(Math.tan(45));
		System.out.println(Math.sin(Math.toRadians(45)));
		
		System.out.println(Math.random());
	}
	

}
