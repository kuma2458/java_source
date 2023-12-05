package wrapper;

public class WrapperClass {
	/*
	 * Wrapper 클래스는 primitivie 변수 타입을 reference 형 타입으로 바꿀때 사용되는 클래스 Wrapper Integer
	 * <> int Double <> double Float <>float Boolean <> boolean Character <> char
	 */
	public static void main(String[] args) {
		Integer n1 = new Integer(100);
		Integer n2 = 200;

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1 + n2);

		System.err.println(Integer.MAX_VALUE);
		System.err.println(Integer.MIN_VALUE);
		System.err.println(Integer.BYTES);
		System.err.println(Integer.SIZE);

		System.out.println();
		System.out.println(Integer.parseInt("100"));
		System.out.println(Integer.toHexString(65));
		System.out.println(0x41);

		int i1 = 100;
		// auto boxing
		Integer i2 = i1;
		// auto unboxing
		int i3 = i2;
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i2.equals(i3));

		// 1.5 이전 버전에서의 boxing, unboxing
		int i4=100;
		Integer i5=new Integer(i4);//boxing
		int i6=i5.intValue();//unboxing
	}
}
