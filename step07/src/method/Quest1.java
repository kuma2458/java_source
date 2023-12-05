package method;

public class Quest1 {

	public static void main(String[] args) {
		Circle cc1=new Circle(5);
		System.out.println(cc1.toString());
		System.out.printf("넓이 : %1.1f 원둘레 : %1.1f\n\n",cc1.circleArea(),cc1.circumference());
		
		Triangle tr1 = new Triangle(5, 7);
		System.out.println(tr1.toString());
		System.out.printf("넓이 : %1.1f\n\n",tr1.triArea());
		
		rectangle rt1 = new rectangle(4, 6);
		System.out.println(rt1.toString());
		System.out.printf("넓이 : %d 둘레 : %d\n\n",rt1.rectangleArea(),rt1.rectangleround());
		
	}

}
