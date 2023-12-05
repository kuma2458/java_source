package has_a_2;

public class K2 extends Gun{
	//총알 24발
	//총을 쏠때 3발씩
	//재장전은 총알 전부 
	private static int K2_bullet_MAX = 24;
//	private int bullet;

	public K2() {
		bullet = K2_bullet_MAX;

	}

	public void shot() {
		super.shot();
		super.shot();
		super.shot();
	}

	public void reload() {
		System.out.println("재장전");
		bullet = K2_bullet_MAX;

	}

}
