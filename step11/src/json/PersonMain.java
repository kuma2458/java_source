package json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class PersonMain {

	public static void main(String[] args) {
		Person ps1 = new Person("홍길동", 24);
		Person ps2 = new Person("김철수", 20);
		Person ps3 = new Person("박하나", 23);

		JSONObject jObj1 = new JSONObject();
		jObj1.put("name", ps1.getName());
		jObj1.put("age", ps1.getAge());
		
		JSONObject jObj2 = new JSONObject();
		jObj2.put("name", ps2.getName());
		jObj2.put("age", ps2.getAge());
		
		JSONObject jObj3 = new JSONObject();
		jObj3.put("name", ps3.getName());
		jObj3.put("age", ps3.getAge());
		
		System.out.println(jObj1.toString());
		System.out.println(jObj2.toString());
		System.out.println(jObj3.toString());
		JSONArray arr=new JSONArray();
		
		arr.put(jObj1);
		arr.put(jObj2);
		arr.put(jObj3);
		
		System.out.println(arr.toString());
		
		JSONObject j1=new JSONObject(ps1);
		JSONObject j2=new JSONObject(ps2);
		JSONObject j3=new JSONObject(ps3);
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		
		ArrayList<Person> arr1=new ArrayList<Person>();
		arr1.add(ps1);
		arr1.add(ps2);
		arr1.add(ps3);
		
		JSONArray arr2=new JSONArray(arr1);
		System.out.println(arr2.toString());
	}

}
