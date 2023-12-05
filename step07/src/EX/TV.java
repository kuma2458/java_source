package EX;

public class TV {
	//필드 전원, 채널번호 , 볼륨, 음소거
	//메서드 전원onoff, 채널번호+-, 볼륨-+, 음소거onoff원하는 채널번호 직접입력

	private final int MAX_TVNUM=356;
	private final int MIN_TVNUM=1;
	private final int MAX_TVVOLUME=40;
	private final int MIN_TVVOLUME=0;
	private boolean Tvpower;
	private int Tvnum;
	private int Tvvolume;
	private boolean Tvnovol;
	public TV() {
		Tvpower=false;
		Tvnum=1;
		Tvvolume=0;
	}
	
	public void TvOnOff() {
		Tvpower=!Tvpower;
		System.out.println(Tvpower?"TV 전원 ON":"TV 전원 OFF");
	}
	
	public void TvNumUp() {
		if(!Tvpower) return;

		Tvnum++;
		if(Tvnum>MAX_TVNUM) {
			Tvnum=0;
		}
		System.out.println("현재 채널 번호 : "+Tvnum);
	}
	public void TvNumDown() {
		if(!Tvpower) return;
		if(Tvnum>MIN_TVNUM)
			Tvnum--;
		else
			Tvnum=MAX_TVNUM;
		
		System.out.println("현재 채널 번호 : "+Tvnum);
	}
	
	public void TvVolumeUp() {
		if(!Tvpower) return;
		if(Tvnovol) {
			TvVolumeOnOff();
		}

		if(Tvvolume<MAX_TVVOLUME)
			Tvvolume++;
		else
			Tvvolume=MAX_TVVOLUME;
		System.out.println("볼륨량 : "+Tvvolume);
	}
	public void TvVolumeDown() {
		if(!Tvpower) return;
		if(Tvnovol) {
			TvVolumeOnOff();
		}
 
		if(Tvvolume>MIN_TVVOLUME)
			Tvvolume--;
		else
			Tvvolume=MIN_TVVOLUME;
		System.out.println("볼륨량 : "+Tvvolume);
	}
	
	public void TvVolumeOnOff() {
		if(!Tvpower) return;
		Tvnovol=!Tvnovol;
		System.out.println(Tvnovol?"음소거on":"음소거off");
	}
 
	public void remote(int n) {

		switch(n) {
		case 1:
			TvOnOff();
			break;
		case 2:
			TvNumUp();
			break;
		case 3:
			TvNumDown();
			break;
		case 4:
			TvVolumeUp();
			break;
		case 5:
			TvVolumeDown();
			break;
		case 6:
			TvVolumeOnOff();
			break;
		}
		
	}
}
