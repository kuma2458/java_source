package inner;

public class OutterStaticClass {
	private int outter;
	private static double n = 23.1234;

	public OutterStaticClass(int outter) {
		this.outter = outter;
	}

	public static class InnerStaticClasse {
		private int i;

		public InnerStaticClasse(int i) {
			this.i = i;
		}

		public int sum() {
//			return outter+i; // outter가 none static이기 때문에 접근이 불가능
			return (int) (n + i);
		}

	}

}
