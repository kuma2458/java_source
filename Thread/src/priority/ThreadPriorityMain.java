package priority;

import java.util.ArrayList;

public class ThreadPriorityMain {
	public static void main(String[] args) {
		ArrayList<ThreadPriority> list =new ArrayList<ThreadPriority>();
		for(int i =0; i<10; i++) {
			ThreadPriority t =new ThreadPriority("스레드"+i);
			t.setPriority(Thread.MIN_PRIORITY);
			list.add(t);
		}
		list.get(list.size()-1).setPriority(Thread.MAX_PRIORITY);
		list.forEach(a->a.start());
		System.out.println("main 종료");
	}

}
