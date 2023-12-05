package has_a_3;

public class Light extends PowerOnOff{

	@Override
	public void PowerOn() {
		power=true;
		System.out.println("라이트 전원 On");
	}

	@Override
	public void PowerOff() {
		power=false;
		System.out.println("라이트 전원 Off");
	}

	@Override
	public void PowerOnOffs() {
		power=!power;
		if(power)
			System.out.println("라이트 전원 On");
		else
			System.out.println("라이트 전원 Off");
	}
	
}
