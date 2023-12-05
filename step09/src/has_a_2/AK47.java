package has_a_2;

public class AK47 extends Gun {

	private static int AK47_bullet_MAX = 24;
	public AK47() {
		bullet = AK47_bullet_MAX;
	}

	@Override
	public void shot() {
		super.shot();
		super.shot();
	}

	@Override
	public void reload() {
		bullet = AK47_bullet_MAX;
	}

}
