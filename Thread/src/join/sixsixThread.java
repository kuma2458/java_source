package join;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class sixsixThread extends Thread {

	public int count = 0;
	private static ArrayList<Integer> list=new ArrayList<Integer>(1000);
	//vector은 동기화가 되어있음. 동기화 : 한명이 쓰면 다른 사람은 못쓰게 막음 syncronize
	public static double getAverage() {
		int sum = 0;
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			sum += it.next();
		}
		System.out.println("횟수 : " + sum+" 맵사이즈 : "+list.size());
		return (double) sum / list.size();
	}

	public sixsixThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("오류");
//			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("오류");
		}
		Random rd = new Random();
		int i, j;
		do {
			i = rd.nextInt(6) + 1;
			j = rd.nextInt(6) + 1;
			count++;
		} while (!(i == 6 && j == 6));
		list.add(count);
		System.out.println(getName() + "가 걸린횟수 : " + count);
	}

}
