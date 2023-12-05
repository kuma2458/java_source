package has_a_2;

public class PoliceMain {

	public static void main(String[] args) {
		Police police = new Police();
		Gun gun=new Gun();
		K2 k2=new K2();
		AK47 ak47=new AK47();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.changeGun(k2);
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.changeGun(gun);
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.changeGun(k2);
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.policeShot();
		police.changeGun(ak47);
		police.policeShot();
		
	}

}
