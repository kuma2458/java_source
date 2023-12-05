package init;

import java.util.ArrayList;

public class RunnableMain {

	public static void main(String[] args) {
		ArrayList<Thread> list=new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			list.add(new Thread(new RunnableRun(),"스레드"+i));
			
		}
		list.forEach(a->a.start());
		
	}

}
