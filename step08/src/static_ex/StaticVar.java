package static_ex;

public class StaticVar {
	//static = 코드 실행부터 종료될때까지 존재하는 변수 or 메서드
	public static int n1= 10;
	public static final double PI= 3.1415;
	public int n2=20;
	public static void main(String[] args) {
		System.out.println(n1);//static 키워드가 붙어있으면 미리 메모리가 할당되어 있어 접근이 가능
		System.out.println(PI);
		//n2는 StaticVar 클래스의 필드이기 때문에 아직 생성이 되지 않음.
		//그래서 static은 static이 아닌 영역에 접근할 수 없다.
		//non-static은 반드시 생성 후에 실행이 된다.
		
		StaticVar SB = new StaticVar();
		System.out.println(SB.n2);
		
		//static 변수나 상수,메서드에 접근하는 방법
		//클래스명.변수명, 클래스명.상수명, 클래스명.메서드()
		//객체명.변수명, 객체명.상수명, 객체명.메서드()
		StaticVar.n1=20;
		System.out.println(StaticVar.n1);
		System.out.println(StaticVar.PI);
		System.out.println(SB.n1);
		System.out.println(SB.PI);
		
	}
}
