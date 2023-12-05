package inner;

import inner.Outter.Inner;

public class OutterMain {

	public static void main(String[] args) {
		Outter ot=new Outter(50);//inner 클래스는 outter 클래스가 만들어져야지만 생성가능
		Inner it=ot.new Inner(100);
		it.printInner();
		Inner it2=ot.new Inner(200);
		it2.printInner();
		
		OutterStaticClass.InnerStaticClasse in = new OutterStaticClass.InnerStaticClasse(200);
		System.out.println(in.sum());
		
	}

}
