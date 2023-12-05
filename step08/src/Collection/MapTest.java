package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	/*
	 * 		Map
	 * 		키(key) 값을 이용해서 데이터(value)를 저장, 읽기, 삭제, 수정
	 * 
	 */
	
	
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("김", 23);
		map.put("나", 24);
		map.put("박", 25);
		map.put("이", 26);
		map.put("이", 30);//중복된 key 값을 넣어줄경우 데이터 수정을 함
	
		
		System.out.println(map);
		System.out.println(map.get("이"));
		
		map.remove("박");
		System.out.println(map);
		System.out.println(map.keySet());
			
		System.out.println(map.entrySet());//방법1	
		Set<String> key=  map.keySet();
		Iterator<String>  keyit=key.iterator();
		while(keyit.hasNext()) {
			String k=keyit.next();
			System.out.print(k+"="+map.get(k)+"   ");
		}
		
		//맵에 저장된 갯수
		System.out.println();
		System.out.println("맵에 저장된 갯수 : "+map.size());
		//맵에 해당하는 키가 있는지
		System.out.println("맵에 해당하는 키가 있나요? : "+map.containsKey("김"));
		//맵에 해당하는 값이 있는지
		System.out.println("맵에 해당하는 값이 있나요? : "+map.containsValue(22));
		//맵 내용 비우기
		map.clear();
		System.out.println("맵이 비워졌나요? : "+map);
		//맵에 내용이 없나?
		System.out.println("맵이 비워졌나요? : "+map.isEmpty());
		

		
	}
}
