package has_a_3;

public class PowerOnOff {
	// 전원 값 저장할 변수
	// 켜고 끄는 메서드 하나, 전원 onoff하는 메서드 3개

	protected boolean power;

	public void PowerOn() {
		power = true;
		System.out.println("전원 On");
	}

	public void PowerOff() {
		power = false;
		System.out.println("전원 Off");
	}

	public void PowerOnOffs() {
		power = !power;
		if(power)
			System.out.println("전원 On");
		else
			System.out.println("전원 Off");
			
	}

}
