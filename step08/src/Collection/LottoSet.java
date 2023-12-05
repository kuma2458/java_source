package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class LottoSet {

	public static void main(String[] args) {
		Random rd = new Random();
		TreeSet<Integer> Lotto = new TreeSet<Integer>();
		while(Lotto.size()<6) {
			Lotto.add(rd.nextInt(45)+1);
		}
		System.out.println(Lotto);
	}
}
