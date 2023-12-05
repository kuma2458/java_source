package EX;

//오버로딩= 이름은같고 매개변수 개수가 다르거나 매개변수 타입을 다르게 하기 (이름같은게 여러개 불러와져서 오버로딩?) 
//오버라이딩 = 이름은 같지만 서로 다른 기능을 작성 
public class Calculator {
	// 정수를 두 개 받아서 덧셈 뺄셈 곱셈 나눗셈의 결과를 리턴하는 메서드 4개를 작성
	// 실수를 두 개 받아서 덧셈 뺄셈 곱셈 나눗셈의 결과를 리턴하는 메서드 4개를 작성
	// 메서드명은 매개변수타입이 다르면 이름이 같아도됨 = 오버로딩(메서드 이름을 같게 하고 매개변수만 다르게 하면됨)
	private int addcount = 0, subcount = 0, mulcount = 0, divcount = 0;

	int add(int Inum1, int Inum2) {
		addcount++;
		return Inum1 + Inum2;
	}

	int sub(int Inum1, int Inum2) {
		subcount++;
		return Inum1 - Inum2;
	}

	int mul(int Inum1, int Inum2) {
		mulcount++;
		return Inum1 * Inum2;
	}

	int div(int Inum1, int Inum2) {
		divcount++;
		return Inum1 / Inum2;
	}

	double add(double Dnum1, double Dnum2) {
		addcount++;
		return Dnum1 + Dnum2;
	}

	double sub(double Dnum1, double Dnum2) {
		subcount++;
		return Dnum1 - Dnum2;
	}

	double mul(double Dnum1, double Dnum2) {
		mulcount++;
		return Dnum1 * Dnum2;
	}

	double div(double Dnum1, double Dnum2) {
		divcount++;
		return Dnum1 / Dnum2;
	}

	// 숫자 두개를 매개변수로 받아서 두 숫자 중 큰 숫자를 리턴하는 메서드

	double maxnum(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}

	// 숫자 두개를 매개변수로 받아서 두 숫자 중 작은 숫자를 리턴하는 메서드
	double minnum(double n1, double n2) {
		return n1 < n2 ? n1 : n2;
	}

	int maxnum(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	int minnum(int n1, int n2) {
		return n1 < n2 ? n1 : n2;
	}

	// 사칙연산을 수행 할때마다 각 연산별 실행 횟수를 저장하고, 별도의 메서드를 통해서 사칙연산이 각각 몇번 수행되었는지 출력
	// 출력형태) 덧셈 : 1, 뺄셈 : 2, 곱셈 : 0, 나눗셈 : 4
	void printcount() {
		System.out.printf("덧셈 : %d, 뺄셈 : %d, 곱셈 : %d, 나눗셈 : %d\n", addcount, subcount, mulcount, divcount);
	}

	// 소수 출력하는 메서드, 숫자 n이 소수면 true를 리턴, 아니면 false를 리턴하는 메서드를 작성
	public boolean checkPrimeNumber(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	// 숫자를 여러개를 매개변수로 받아서, 받은 매개변수들의 숫자들의 평균을 리턴하는 매서드
	// 단, 숫자는 몇개를 받을지 모름

	double average(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum / arr.length;
	}

	// (리턴타입 ... 변수명) > 여러개 들어오면 배열로 저장함 > 가변수, 가변수는 맨 마지막에 와야됨
	double average2(double ... arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum / arr.length;
	}

}
