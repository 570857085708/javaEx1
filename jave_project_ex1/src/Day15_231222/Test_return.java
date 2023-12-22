package Day15_231222;

import java.util.ArrayList;
import java.util.HashMap;

public class Test_return {

	HashMap<String, Object> test_return() {
		String name = "홍길동";
		int age = 30;
		String addr = "인천";
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "유재석");
		map1.put("age", "30");
		map1.put("addr", "서울");
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name", "강호동");
		map2.put("age", "40");
		map2.put("addr", "인천");
		
		list.add(map1);
		list.add(map2);
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("age", age);
		map.put("addr", addr);
		
		map.put("list", list);
		
		return map;
	}
	
	public static void main(String[] args) {
		
		Test_return test = new Test_return();
		
		HashMap<String, Object> map =test.test_return();
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("addr"));
	
		ArrayList<HashMap<String, Object>> list = (ArrayList<HashMap<String, Object>>) map.get("list");
	
	}//
	
	
}
