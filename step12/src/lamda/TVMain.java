package lamda;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV(new Power() {
			
			@Override
			public void poweronoff() {
				//tv.pow 등 TV가 가지고 있는 필드는 사용 못함.
			}
		});
		tv.poweronoff();
		
	}

}
