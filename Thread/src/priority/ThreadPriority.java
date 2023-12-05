package priority;

public class ThreadPriority extends Thread{
	public ThreadPriority(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			for(int i = 0; i<100; i++)
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(getName()+"-스레드 종료"+getPriority());
	}
	
}
