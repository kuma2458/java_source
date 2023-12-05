package lamda;

public class LamdaEx3 {

	public static void main(String[] args) {
		Method<String> m1 = (a) -> System.out.println(a);
		m1.run("hello");

		Method<Integer> m2 = (a) -> System.out.println(a * a);
		m2.run(5);

		Method<Double> m3 = (a) -> System.out.println(a * a * Math.PI);
		m3.run(15.0); // 람다는 래퍼런스 타입을 써서 정확히 입력 해 줘야 함

	}

}
