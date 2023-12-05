package object;

import java.util.ArrayList;

public class DogMain {

	public static void main(String[] args) {
		ArrayList<Dog> list=new ArrayList<Dog>();
		
		//리스트에 데이터 5개 저장
		list.add(new Dog("치와와",3));
		list.add(new Dog("불독",3));
		list.add(new Dog("진돗개",3));
		list.add(new Dog("시골잡종",3));
		list.add(new Dog("푸들",3));
		
		Dog d= new Dog("시골잡종",3);
		System.out.println(list.contains(d));
		System.out.println(list.indexOf(d));
		System.out.println(list.remove(d));
		System.out.println(list);
	}

}
