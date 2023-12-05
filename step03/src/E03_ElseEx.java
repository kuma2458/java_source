
public class E03_ElseEx {

	/*
	 * 			else: else 이전의 모든 조건문들이 거짓일때 실행되는 영역
	 * 			      else는 마지막 조건문에 해당되기 때문에 조건식이 없음
	 */
	public static void main(String[] args) {
		int n = 32;
		if(n%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else{
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
