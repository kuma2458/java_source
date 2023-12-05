
public class E08_SwitchEx1 {
	/*
	 * 			switch는 case 옆에 있는 비교값과 일치하면 일치하는 순간부터 switch 내부의 코드들을 전부 순서대로 실행한다
	 * 			break 은 switch를 강제로 종료하는 명령어
	 * 			비교가는한 값: 정수,문자,문자열
	 * 			default : case에 맞는 값이 없을때 실행
	 */
	public static void main(String[] args) {
		
		int no = 2;
		switch(no) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("X");
		}
	}

}
