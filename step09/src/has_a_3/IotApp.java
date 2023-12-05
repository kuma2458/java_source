package has_a_3;

import java.util.ArrayList;

/*
 * power on off를 상속받은 클래스를 저장할 리스트 생성
 * 생성자에서는 미리 기기를 3개정도 생성해서 저장
 * 외부로부터 새로운 기기를 받아서 리스트에 등록하는 메서드 작성
 */

public class IotApp {

	private ArrayList<PowerOnOff> iotList;

	public IotApp() {
		iotList = new ArrayList<PowerOnOff>();
		iotList.add(new Tv());
		iotList.add(new Aircon());
		iotList.add(new Light());
	}

	// 디바이스 추가
	public void addIot(PowerOnOff iot) {
		if (iotList.size() == 10) {
			System.out.println("더 이상 등록할 수 없습니다.");
			return;
		}
		if(iot==null) {
			System.out.println("null값입니다.");
			return;
		}
		iotList.add(iot);
		System.out.println(iot.getClass().getSimpleName()+" 등록완료 ");
		System.out.println("현재 " + iotList.size() + "개 등록");
	}

	// 디바이스 전체 전원 On
	// 오버라이딩 말고 기존 그대로 사용해서 여러가지 기능을 쓸수 있는거 = 다형성+
	public void allIotPowerOn() {
		for (PowerOnOff iot:iotList) {
			iot.PowerOn();
		}
	}

	// 디바이스 전체 전원 Off
	public void allIotPowerOff() { 
		for (PowerOnOff iot:iotList) {
			iot.PowerOff();
		}
	}
}
