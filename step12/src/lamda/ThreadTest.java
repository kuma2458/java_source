package lamda;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				int total=0;
				for(int i=1; i<=100;i++)
					total+=i;
				System.out.println(total);
			}
		});
		t1.start();
		//익명클래스 버전을 람다로 바꿔서 작성
		
		Thread t2=new Thread(()->{
			int total=0;
			for(int i=1; i<=100;i++)
				total+=i;
			System.out.println(total);
		});
		t2.start();
	}

}
