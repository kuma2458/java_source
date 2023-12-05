package has_a_2;

public class Gun {
	// 총알 저장
	// 생성자 총알 12발 초기화
	// 사격, 총알없으면 재장전
	// 재장전
	protected static int bullet_MAX = 12;
	protected int bullet;

	public Gun() {
		bullet = bullet_MAX;

	}

	public void shot() {
		if (bullet == 0)
			reload();
		bullet--;
		System.out.println("사격");
		System.out.println("총알이 " + bullet + "남았습니다");


	}

	public void reload() {
		System.out.println("재장전");
		bullet = bullet_MAX;

	}

}
