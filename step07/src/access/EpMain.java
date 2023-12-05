package access;
/*
 * 접근 제어자
 * 		변수와 메서드를 접근할 수 있는 범위를 설정하는 옵션
 * 
 * 		private : 해당 클래스 내에서만 접근 가능(외부에서 접근x)
 * 		protected : 해당 클래스를 상속 받는 자식 클래스들까지 접근이 가능
 * 		default : 접근 제어자를 사용을 안했을때 자동으로 붙음, 같은 패키지 내에 있는 클래스들까지 접근이 가능
 * 		public : 누구나 접근이 가능
 * 
 * 
 */
public class EpMain {
	public static void main(String[] args) {
		Employee ep11 = new Employee("1", "김철수", 3300, "A부");
		ep11.printEmployeeInfo();
		ep11.setMoney(3000);
		System.out.println(ep11.getMoney());

	}


}
