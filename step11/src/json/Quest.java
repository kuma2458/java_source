package json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class Quest {
	public static void jsonParse(String str) {
		JSONObject json=new JSONObject(str);
		System.out.println(json.get("size"));	
		JSONArray arr= json.getJSONArray("arr");
		
		for(int i=0; i<arr.length(); i++) {
			JSONObject j= arr.getJSONObject(i);
			System.out.println(j.get("name")+" "+j.getInt("age"));
		}
	}
	public static void main(String[] args) {
		//

		JSONObject json1 = new JSONObject();
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 24));
		list.add(new Person("김철수", 20));
		list.add(new Person("박하나", 23));
		json1.put("arr", new JSONArray(list));
		json1.put("size", list.size());
		
		System.out.println(json1.toString());
		System.out.println(json1.get("arr"));
		jsonParse(json1.toString());
	}

}
