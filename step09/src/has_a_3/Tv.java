package has_a_3;

public class Tv extends PowerOnOff {

	@Override
	public void PowerOn() {
		power=true;
		System.out.println("TV 전원 On");
	}

	@Override
	public void PowerOff() {
		power=false;
		System.out.println("TV 전원 Off");
	}

	@Override
	public void PowerOnOffs() {
		power=!power;
		if(power)
			System.out.println("TV 전원 On");
		else
			System.out.println("TV 전원 Off");
	}

	
}
