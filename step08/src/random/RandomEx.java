package random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random r = new Random();
		//r.nextInt(최댓값+1-최소값)+최소값=최소값~최댓값
		System.out.println(r.nextInt(45)+1);
		System.out.println(r.nextBoolean());
		System.out.println(r.nextDouble());
	
	}
}
