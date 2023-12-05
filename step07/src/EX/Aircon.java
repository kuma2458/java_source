package EX;

public class Aircon {
	// 필드 : 온도, 전원, 모드, 바람세기, 바람각도
	// 기능 : 전원Onoff, 온도up/down(int), 모드변경(int), 바람세기조정(int), 타이머설정(int), 바람각도조정(int)
	private final int MAX_TEMP = 32;// 최대온도
	private final int MIN_TEMP = 18;// 최대온도

	private int aircontemperature;// 온도
	private boolean aircontf;// 전원
	private int airconmodenum;// 모드
	private int airconairnum;// 바람세기
	private int aircontimer;// 타이머
	private boolean airgak;// 각도
	String[] airconmode = { "냉방", "송풍", "제습" };
	String[] airconair = { "약", "중", "강", "자동" };
	String airconairnow;

	Aircon() {
		this.aircontemperature = 18;
		this.aircontf = false;
		this.airconmodenum = 0;
		this.airconairnum = 0;
		this.airgak = true;
		this.aircontimer = 0;
	}

	void aircononoff() {// 전원키고끄기
		aircontf = !aircontf;
		System.out.println(aircontf ? "전원 on" : "전원 off");
	}

	void aircontempDown() {// 온도내리는 메소드'
		if (aircontf) {
			if (aircontemperature < MIN_TEMP) {
				System.out.println("18도 밑으로 설정할 수 없습니다.");
				aircontemperature = MIN_TEMP;
			} else {
				aircontemperature--;
			}
			System.out.println("현재 온도 : " + aircontemperature);
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}

	void aircontempUp() {// 온도 올리는 메소드
		if (aircontf) {
			if (aircontemperature > MAX_TEMP) {
				System.out.println("32도 밑으로 설정할 수 없습니다.");
				aircontemperature = MAX_TEMP;
			} else {
				aircontemperature++;
			}
			System.out.println("현재 온도 : " + aircontemperature);
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}

	void aircontempchange(int aircontemp) {// 원하는 온도입력해서 조정
		if (aircontf) {
			if (aircontemp < MIN_TEMP || aircontemp > MAX_TEMP) {
				System.out.println("온도 범위를 벗어났습니다");
			} else {
				aircontemperature = aircontemp;
				System.out.println("현재 온도 : " + aircontemperature);
			}
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}

	void airconmodechange() {// 실행될때마다 모드가 변경됨
		if (aircontf) {
			airconmodenum++;
			airconmodenum %= 3;
			System.out.println("현재 모드 : " + airconmode[airconmodenum]);
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}

	void airconmodechange(int airconmodenum) {// 원하는 모드번호 입력해서 모드 조정
		if (aircontf) {
			if (airconmodenum < 0 || airconmodenum > 2) {
				System.out.println("없는 모드입니다.");
			} else {
				this.airconmodenum = airconmodenum;
				System.out.println("현재 모드 : " + airconmode[airconmodenum]);
			}
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}

	void airconairchange() {// 실행될때마다 바람세기가 변경됨
		if (aircontf) {
			airconairnum++;
			airconairnum%=4;
			System.out.println("현재 바람세기 : " + airconair[airconairnum]);
		} else {
			
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}

	void airconairchange(int airconairnum) {// 원하는 바람세기번호 입력해서 모드 조정
		if (aircontf) {
			if (airconairnum < 0 || airconairnum > 4) {
				System.out.println("없는 모드입니다.");
			} else {
				this.airconairnum = airconairnum;
				System.out.println("현재 바람세기 : " + airconair[airconairnum]);
			}
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}

	void aircongak() {// 각도조정
		if (aircontf) {
			airgak = !airgak;
			System.out.println(airgak ? "각도 : 자동" : "각도 : 고정");
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}

	}

	void aircontimerchange() {// 실행될때마다 모드가 변경됨
		if (aircontf) {
			aircontimer++;
			aircontimer %= 5    ;
			switch (aircontimer) {
			case 0:
				System.out.println("타이머모드를 종료합니다");
				break;
			default:
				System.out.println(aircontimer+"시간뒤 꺼집니다.");
				break;
			}
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}

	void aircontimerchange(int aircontimer) {// 원하는 모드번호 입력해서 모드 조정
		if (aircontf) {
			if (aircontimer < 0 || aircontimer > 4) {
				System.out.println("타이머 범위를 벗어났습니다");
			} else {
				this.aircontimer = aircontimer;
				switch (this.aircontimer) {
				case 0:
					System.out.println("타이머모드를 종료합니다");
					break;
				case 1:
					System.out.println("1시간뒤 꺼집니다.");
					break;
				case 2:
					System.out.println("2시간뒤 꺼집니다.");
					break;
				case 3:
					System.out.println("3시간뒤 꺼집니다.");
					break;
				case 4:
					System.out.println("4시간뒤 꺼집니다.");
					break;
				}
			}
		} else {
			System.out.println("에어컨 전원이 꺼져있습니다.");
		}
	}
	
	void remote(int n) {
		switch(n) {
		case 1:
			aircononoff();
			break;
		case 2:
			aircontempUp();
			break;
		case 3:
			aircontempDown();
			break;
		case 4:
			airconmodechange();
			break;
		case 5:
			airconairchange();
			break;
		case 6:
			aircongak();
			break;
		case 7:
			aircontimerchange();
			break;
		}
	}

}
