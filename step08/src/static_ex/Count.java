package static_ex;

public class Count {
	private int count;
	private static int total_count=0;

	public Count() {
		count++;
		total_count++;
		addStaticCount();
		System.out.println(count+" "+total_count);
	}

	public void addStaticCount() {
		//non_static에서는 static에 언제든지 접근이 가능
		//non_static이 실행되는 시점에 static이 이미 메모리에 생성되어 있기 때문
		total_count++;
	}
	
	
	//static-> non_static : 불가능
	//non_static -> static :  가능
	public static void addFieldCount() {
		//count++;
		//static은 non-static에 접근이 불가능
		//static은 사용하는 시점에 non-stataic이 생성되지 않을 수도 있고
		//어떤 객체의 대상인지 알 수 없기 때문
		
		
		
	}
	
	
	
	
}
