package has_a_1;

public class K2 {
	//총알 24발
	//총을 쏠때 3발씩
	//재장전은 총알 전부 
	private static int bullet_MAX = 24;
	private int bullet;

	public K2() {
		bullet = bullet_MAX;

	}

	public void shot() {
		if (bullet == 0)
			reload();
		bullet-=3;
		System.out.println("사격");
		System.out.println("총알이 " + bullet + "남았습니다");


	}

	public void reload() {
		System.out.println("재장전");
		bullet = bullet_MAX;

	}

}
