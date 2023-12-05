package power;

public class Tv implements PowerOnOff {

	private boolean power;
	
	@Override
	public void powerOnOff() {
		power=!power;
		if(power)
			System.out.println("TV 전원 on");
		else
			System.out.println("TV 전원 off");
	}

	@Override
	public void powerOn() {
		power=true;
		System.out.println("TV 전원 on");
	}

	@Override
	public void powerOff() {
		power=false;
		System.out.println("TV 전원 off");
		
	}

}
