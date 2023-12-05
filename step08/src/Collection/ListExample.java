package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {
	/*
	 * 
	 * List 특징 1.데이터를 중복으로 저장 가능 2.등록한 순서대로 데이터 저장
	 * 
	 * ArrayList : 리스트에서 데이터를 배열로 관리 LinkedList : 리스트에서 데이터를 노드 단위로 관리
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		//리스트 생성한 부분, <저장할 데이터 타입(참조형-레퍼런스만 가능)>
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("js/jQuery");
		list.add("jsp");
		
		System.out.println(list);

		//데이터 삭제 - 인덱스 번호로 삭제
		
//		list.remove(2);
//		System.out.println(list);
//		list.remove(0);
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
//		
		//데이터 삭제 - 값을 기준으로 삭제
		list.remove("java");
		System.out.println(list);
		
		//리스트에 저장된 데이터 개수
		System.out.println(list.size());
		
		//해당 인덱스의 데이터를 교체
		list.set(1, "C");
		System.out.println(list);
		
		//데이터를 꺼내는 방법 1번
		for(int i = 0; i<list.size(); i++) {
			
			System.out.print(list.get(i)+" ");
			
		}
		
		//데이터를 꺼내는 방법 2번
		for(String str: list){
			System.out.println(str);
			}
		
		System.out.println("==================");
		//데이터를 꺼내는 방법 3번
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//해당 데이터가 리스트에 있냐?
		System.out.println(list.contains("자바"));
		System.out.println(list.contains("HTML/CSS"));
		
		
		//데이터가 몇번째 위치에 있는지
		System.out.println( list.indexOf("jsp"));
		System.out.println( list.indexOf("자바"));

		//리스트에 있는 모든 데이터  삭제
		list.clear();
		System.out.println(list);
		
		//리스트가 비었냐?
		System.out.println(list.isEmpty());
		
		
		
		
		
	}

}
