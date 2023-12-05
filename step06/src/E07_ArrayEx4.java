import java.util.Arrays;

public class E07_ArrayEx4 {

	public static void main(String[] args) {
		int[] arr= {3,2,5,6,2,1,5,6,3};
		
		for(int n: arr) {
			System.out.print(n+" ");
			n++;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
