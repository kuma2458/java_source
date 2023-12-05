package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	/*
	 * 	Set
	 * 		1. 데이터를 중복저장 x
	 * 		2. 자동 정렬
	 */
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("HTML/CSS");
		set.add("JAVA");
		set.add("JS");
		set.add("JSP");
		set.add("C");
		set.add("JS");
		set.add("Spring");
		System.out.println(set);
		
		set.remove("JS");
		System.out.println(set);
		System.out.println(set.remove("Spring"));
		System.out.println(set);
		
		
		System.out.println(set.size());
		System.out.println(set.contains("JAVA"));
//		set.clear();
		System.out.println(set.isEmpty());
		
		//전체 조회 1 : 배열로 변환해서 조회
		String[] arr=new String[set.size()];
		set.toArray(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(it.next());
//		}
		
 		//전체 조회 2 : 반복자(Iterator) 사용
	}

}
