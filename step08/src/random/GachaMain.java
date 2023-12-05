package random;

import java.util.Arrays;

public class GachaMain {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			String[] arr=GachaBox.getInstance().drawItem(10);
			System.out.println(Arrays.toString(arr));
		}

	}

}
