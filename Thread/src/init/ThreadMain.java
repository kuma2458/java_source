package init;

import java.util.ArrayList;

public class ThreadMain {

	public static void main(String[] args) {
		ArrayList<ThreadRun> list =new ArrayList<ThreadRun>();
		
		for(int i = 0; i<10; i++) {
			list.add(new ThreadRun("스레드"+i));
			
		}
		
		list.forEach(a->a.start());
		
	}

}
