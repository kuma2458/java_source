package lamda;

public class TV implements Power {
	private Power power;
	private boolean power1;
	
	
	public TV(Power power) {
		super();
		this.power = power;
	}


	public void poweronoff() {
		power.poweronoff();
	}

	

}
