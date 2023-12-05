package join;

public class JoinThreadMain {

	public static void main(String[] args) {
		JoinThread join1=new JoinThread("JoinThread-1");
		JoinThread join2=new JoinThread("JoinThread-2");
		JoinThread join3=new JoinThread("JoinThread-3");
		
		join1.start();
		join2.start();
		join3.start();
		
		try {
			join1.join();
			join2.join(1000);//main이 join2의 작업을 1초동안만 기다려준다
			join3.join();
		} catch (InterruptedException e) {
		}
		System.out.println("main 종료");
	}

}
