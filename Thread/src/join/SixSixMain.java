package join;

import java.util.ArrayList;

public class SixSixMain {

//	static int sum = 0;
	public static void main(String[] args) {
		ArrayList<sixsixThread> list = new ArrayList<sixsixThread>();
		for (int i = 0; i < 1000; i++) {
			list.add(new sixsixThread("스레드" + i));
		}

		list.forEach(a -> a.start());
		list.forEach(a -> {
			try {
				a.join();
//				a.sleep(100);
//				sum += a.count;
			} catch (InterruptedException e) {
				System.out.println("오류");
			}catch (NullPointerException e) {
				System.out.println("오류");
			}
		});
		System.out.println("스레드 1000개 평균 횟수 : " + sixsixThread.getAverage());
	}

}
