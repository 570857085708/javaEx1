package Day12_231219;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex3_ListMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "이동재");
		map.put("java", 90);
		map.put("oracle", 95);
		map.put("html", 100);
		list.add(map);
		
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		
		map2.put("name", "홍길동");
		map2.put("java", 80);
		map2.put("oracle", 85);
		map2.put("html", 95);
		list.add(map2);
		
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			System.out.println("이름 : " + user.get("name"));
			System.out.println("자바 : " + user.get("java") + "점");
			System.out.println("오라클 : " + user.get("oracle") + "점");
			System.out.println("HTML : " + user.get("html") + "점");
			System.out.println("===========");
		}
		
		
		
	} //

}
