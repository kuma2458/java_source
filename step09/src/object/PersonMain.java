package object;

public class PersonMain {

	public static void main(String[] args) {
		Person ps1= new Person("홍길동",26);
		
		System.out.println(ps1);
		System.out.println(System.identityHashCode(ps1));
		System.out.println(Integer.toHexString(System.identityHashCode(ps1)));

		
		Person ps2= new Person("홍길동",26);
		
		System.out.println(ps1==ps2);
		System.out.println(ps1.equals(ps2));
		System.out.println(ps1.hashCode());
		System.out.println(ps2.hashCode());
		
		
	}

}
