package has_a_1;
/*
 * 경찰이 총을 상속 받아서 
 * 경찰이 총을 쏘는 행위를 하면 총 클래스에 있는 shot을 호출하게끔 처리
 * 재장전도 총 클래스에 있는 reload를 호출해서 처리
 * 경찰이 수갑을 가지고 있게 하고 수갑을 사용하는 메서드도 하나 작성
 */

/*
 * 객체와 객체의 Has a 관계의 경우 이렇게 총과 경찰관 사례를 보면
 * 경찰이 총기를 자유롭게 다양하게 교체해야되지만
 * 상솟으로 표현하면 총기 하나에 귀속, 확장성 떨어지는 문제가 생김
 * 총기 교체할려면 코드를 수정해야 되는 문제 발생
 * 
 * 
 * 
 * 
 *
 */

public class Police extends K2{
	private int handcuffs;
//	Gun gun= new Gun();
	public Police() {
		handcuffs=5;
	}
	
	public void policeShot() {
		super.shot();
	}

	public void policereload() {
		super.reload();
	}
	
	public void handcuffs() {
		handcuffs--;
		System.out.println("수갑 사용");
	}
	
	
}
