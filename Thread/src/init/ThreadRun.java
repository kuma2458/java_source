package init;

public class ThreadRun extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
//			System.out.println(getName()+" - "+i+"번째 일");
		}
		System.out.println(getName()+"스레드 종료");
	}

	public ThreadRun(String name) {
		super(name);
	}	
	
	
	
	
}
