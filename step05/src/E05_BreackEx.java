
public class E05_BreackEx {
	/*
	 * 		break
	 * 			break를 직접 감싸고 있는 반복문 1개만 종료
	 * 			일반적으로 if문과 같이 사용(특정 조건을 만족할 때 종료하기 위함)
	 * 		
	 */
	public static void main(String[] args) {

		int i = 1, sum = 0;

		while (true) {
			sum += i;
			i++;
			if (sum > 5000)
				break;
		}
		System.out.println(sum);

	}

}
