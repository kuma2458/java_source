package EX;

public class CarlculMain {

	public static void main(String[] args) {
		Calculator cc1= new Calculator();
		System.out.printf("정수) 덧셈 :%d 뺄셈 :%d 곱셈 :%d 나눗셈 :%d\n",
				cc1.add(12,24),cc1.sub(12,24),cc1.mul(12,24),cc1.div(12,24));
		System.out.printf("실수) 덧셈 :%1.2f 뺄셈 :%1.2f 곱셈 :%1.2f 나눗셈 :%1.2f\n",
				cc1.add(47.44,19.47),cc1.sub(47.44,19.47),cc1.mul(47.44,19.47),cc1.div(47.44,19.47));
		System.out.println(cc1.maxnum(12, 42.0));
		System.out.println(cc1.maxnum(12, -166));
		cc1.printcount();                         
		System.out.println(cc1.checkPrimeNumber(6));
		
		for(int i =0; i<100; i++) {
			if(cc1.checkPrimeNumber(i))
				System.out.print(i+ " ");

		}
		System.out.println();
		
		System.out.println(cc1.average(new double[] {1,2,3,4,5,6}));
		System.out.println(cc1.average2(12,3,4,5,6,7));
	}

}
